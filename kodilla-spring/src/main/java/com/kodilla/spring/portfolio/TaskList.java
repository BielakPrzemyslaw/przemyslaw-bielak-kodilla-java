package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public boolean addTasks(String taskDescription) {
        return tasks.add(taskDescription);
    }

    @Override
    public String toString() {
        return "TasksList{" + "tasks=" + tasks + '}';
    }

    public List<String> getTasks() {
        return tasks;
    }
}
