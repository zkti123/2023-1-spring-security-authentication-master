package com.green.todoapp.model;

import lombok.Data;

@Data
public class TodoSelDto {
    private int itodo;
    private int startIdx;
    private int row;
    private int page;
    private int delYn;

}
