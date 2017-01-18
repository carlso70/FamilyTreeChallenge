package com.github.carlso70.familytreechallenge;

import java.io.File;
import java.util.Scanner;

public class FamilyTree {

    public static void main(String[] args) {

        Tree tree = new Tree();

        File file = new File("inputs/input_hard.txt");

        try {
            Scanner in = new Scanner(file);

            // nodes in tree
            final int size = in.nextInt();
            // n-1
            for (int i = 0; i < size - 1; i++) {
                int parent = in.nextInt();
                int child = in.nextInt();
                tree.addNode(parent, child);
            }

            final int queries = in.nextInt();
            for (int i = 0; i < queries; i++) {
                if (in.next().contains("add")) {
                    int id = in.nextInt();
                    int value = in.nextInt();
                    Operation.addValue(tree, id, value);
                } else {
                    int id = in.nextInt();
                    int id2 = in.nextInt();
                    System.out.println(Operation.maxValue(tree, id, id2));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
