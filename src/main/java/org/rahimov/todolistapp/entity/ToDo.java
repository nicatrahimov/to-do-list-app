package org.rahimov.todolistapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
public class ToDo {
    private int id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private LocalDate done;

    public ToDo() {
    }

    public ToDo(int id, String username, String description, LocalDate targetDate, LocalDate done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }
}
