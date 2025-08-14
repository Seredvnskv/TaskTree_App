package org.example.model;
import java.util.HashSet;
import java.util.Set;

public class Task {
    private long id;
    private String title;
    private int priority;

    private static long counter = 0;
    private Set<Task> tasks;

    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
        this.id = ++counter;
        this.tasks = new HashSet<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
