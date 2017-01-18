package com.github.carlso70.familytreechallenge;

import java.util.Stack;

public final class Operation {

    static int maxValue(Tree tree, int id, int id2) {
        Node node1 = tree.getNode(id);
        Node node2 = tree.getNode(id2);

        Stack<Node> path1 = new Stack<>();
        path1.push(node1);
        while (path1.peek().getParent() != null) {
            path1.push(path1.peek().getParent());
        }

        Stack<Node> path2 = new Stack<>();
        path2.push(node2);
        while (path2.peek().getParent() != null) {
            path2.push(path2.peek().getParent());
        }

        //find common ancestor
        Node ancestor = path1.peek();
        while (path1.peek().getValue() == path2.peek().getValue()) {
            ancestor = path1.pop();
            path2.pop();
            if (path2.isEmpty() || path1.isEmpty()) {
                break;
            }
        }

        Node maxPath1 = ancestor;
        while (!path1.isEmpty()) {
            if (maxPath1.getValue() < path1.peek().getValue()) {
                maxPath1 = path1.pop();
            } else {
                path1.pop();
            }
        }

        Node maxPath2 = ancestor;
        while (!path2.isEmpty()) {
            if (maxPath2.getValue() < path2.peek().getValue()) {
                maxPath2 = path2.pop();
            } else {
                path2.pop();
            }
        }

        if (maxPath2.getValue() > maxPath1.getValue()) {
            return maxPath2.getValue();
        } else {
            return maxPath1.getValue();
        }
    }

    static void addValue(Tree tree, int id, int value) {
        Node parent = tree.getNode(id);
        if (parent != null) {
            Stack<Node> nodeStack = new Stack<>();
            nodeStack.push(parent);

            while (!nodeStack.isEmpty()) {
                Node node = nodeStack.pop();
                node.addValue(value);
                for (Node n: node.getChildren()) {
                    nodeStack.push(n);
                }
            }
        }
    }
}
