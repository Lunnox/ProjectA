package com.mosk.diary.ProjectA.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskItem {
    private int id;
    private String title;
    private String description;
    private Date date;
}
