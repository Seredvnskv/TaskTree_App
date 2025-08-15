package org.example;

import org.example.model.Task;
import org.example.model.TreeGenerator;

public class Main {
    public static void main(String[] args) {
        Task root = TreeGenerator.treeGenerator(10);

        TreeGenerator.printTree(root, 0);
    }
}