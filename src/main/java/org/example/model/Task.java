package org.example.model;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class Task implements Comparable<Task> {
    private long id;
    private String title;
    private int priority;
    private boolean done;

    private static AtomicLong counter = new AtomicLong();
    private Set<Task> tasks;

    public Task(String title, int priority) {
        this.title = title;
        this.priority = priority;
        this.done = false;
        this.id = counter.incrementAndGet();
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

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "[" + "id: " + id + ", priority: " + priority + ", done: " + done + "]";
    }

    @Override
    public int compareTo(Task other) {
        if (this.priority < other.priority) {
            return -1;
        } else if (this.priority > other.priority) {
            return 1;
        }
        return 0;
    }
}
