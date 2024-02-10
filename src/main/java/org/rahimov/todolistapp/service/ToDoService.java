package org.rahimov.todolistapp.service;

import org.rahimov.todolistapp.entity.ToDo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Service
public class ToDoService {
    private static List<ToDo> todos=new ArrayList<>();

    static {
        todos.add(new ToDo(1,"Learning","some words", LocalDate.now(),LocalDate.now().plusMonths(2)));
        todos.add(new ToDo(1,"Music Listening","some additional words", LocalDate.now(),LocalDate.now().plusYears(2)));
        todos.add(new ToDo(1,"Learnig","some words", LocalDate.now(),LocalDate.now().plusDays(3)));
    }
    public List<ToDo>findByUsername(String username){
        return todos;
    }
}
