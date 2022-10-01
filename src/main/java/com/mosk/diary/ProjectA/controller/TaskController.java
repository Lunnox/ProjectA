package com.mosk.diary.ProjectA.controller;

import com.mosk.diary.ProjectA.model.TaskItem;
import com.mosk.diary.ProjectA.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping()
    public String getTasks(Model model){
        List<TaskItem> taskItems = taskRepository.getTaskItems();
        model.addAttribute("taskItems",taskItems);
        return "tasks";
    }

}
