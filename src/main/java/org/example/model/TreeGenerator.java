package org.example.model;

import java.util.*;

public class TreeGenerator {
    public static Task treeGenerator(int elements) {
        Set<Task> taskSet = new HashSet<>();

        Task root = new Task("Root-Project", generatePriority());
        taskSet.add(root);

        for (int i = 1; i <= elements; i++) {
            Task task = new Task("Task-" + i, generatePriority());
            root.addTask(task);
            taskSet.add(task);

            for (int  j = 1; j <= elements; j++) {
                Task subTask = new Task("SubTask-" + j, generatePriority());
                task.addTask(subTask);
                taskSet.add(subTask);
            }
        }

        return root;
    }

    private static int generatePriority() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public static void printTree(Task task, int depth) {
        System.out.println("-".repeat(depth) + "> " + task.getTitle() + " " + task);

        for (Task t : task.getTasks()) {
            printTree(t, depth + 1);
        }
    }
}
