package com.green.todoapp.model;

import lombok.Data;

@Data
public class TodoEntity {
    private int itodo;
    private String ctnt;
    private String cratedAt;
    private String delYn;
    private String pic;
}
