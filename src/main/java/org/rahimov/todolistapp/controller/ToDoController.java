package org.rahimov.todolistapp.controller;

import lombok.RequiredArgsConstructor;
import org.rahimov.todolistapp.entity.ToDo;
import org.rahimov.todolistapp.service.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ToDoController {

    private final ToDoService toDoService;

    @RequestMapping("/todo")
    public String getAllTodos(ModelMap modelMap){
        List<ToDo> toDos = toDoService.findByUsername("nicat");
        modelMap.addAttribute("todos",toDos);
        return "list-todos";
    }
}
