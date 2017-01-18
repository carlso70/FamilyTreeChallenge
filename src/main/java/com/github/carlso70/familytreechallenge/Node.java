package com.github.carlso70.familytreechallenge;

import java.util.ArrayList;

public class Node {

    private Node parent;
    private ArrayList<Node> children;
    private int value;
    private int id;

    public Node(int id) {
        this.children = new ArrayList<>();
        this.parent = null;
        this.value = 0;
        this.id = id;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void addChild(Node child) {
        this.children.add(child);
    }

    public Node getParent() {
        return this.parent;
    }

    public int getId() {
        return this.id;
    }

    public int getValue() {
        return this.value;
    }

    public void addValue(int value) {
        this.value += value;
    }

    public ArrayList<Node> getChildren() {
        return this.children;
    }

}
