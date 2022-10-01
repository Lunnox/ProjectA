package com.mosk.diary.ProjectA.repository;

import com.mosk.diary.ProjectA.model.TaskItem;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
public class TaskRepository {
    List<TaskItem> taskItems= Arrays.asList(
            new TaskItem(1,"Test 1","desc test1", new Date()),
            new TaskItem(1,"Test 2","desc test2", new Date()),
            new TaskItem(1,"Test 3","desc test3", new Date())
    );

    public List<TaskItem> getTaskItems() {
        return taskItems;
    }

    public void addTask(TaskItem newTask){
        taskItems.add(newTask);
    }
}
