package com.green.todoapp.model;

import lombok.Data;

@Data
public class TodoEntity {
    private int itodo;
    private String ctnt;
    private String cratedAt;
    private int delYn;
    private String pic;
    private int finishYn;
    private String finishedAt;
}
