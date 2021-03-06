package com.github.carlso70.familytreechallenge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeOperationsTest {
    @Test
    public void testAddANodes() {
        Tree tree = new Tree();
        tree.addNode(1, 2);
        tree.addNode(2, 3);
        tree.addNode(2, 4);
        tree.addNode(2, 5);
        tree.addNode(1, 6);
        Operation.addValue(tree, 2, 50);

        assertEquals(tree.getNode(6).getValue(), 0);
        assertEquals(tree.getNode(1).getValue(), 0);

        assertEquals(tree.getNode(2).getValue(), 50);
        assertEquals(tree.getNode(5).getValue(), 50);
    }

    @Test
    public void testMaxValue() {
        Tree tree = new Tree();
        tree.addNode(1, 2);
        tree.addNode(2, 3);
        tree.addNode(2, 4);
        tree.addNode(1, 5);

        Operation.addValue(tree, 4, 30);
        Operation.addValue(tree, 5, 20);

        assertEquals(Operation.maxValue(tree, 4, 5), 30);
    }

    @Test
    public void addParentWithoutRoot() {
        Tree tree = new Tree();
        tree.addNode(1, 2);
        tree.addNode(1, 3);
        tree.addNode(4, 5);

        Operation.addValue(tree, 4, 100);
        Operation.addValue(tree, 1, 10);

        assertEquals(Operation.maxValue(tree, 4, 5), 100);
   }

    @Test
    public void testAncestorUnion() {
        /*
          This test is to make sure we are only
          using the union of the two paths to the root
          from the chosen nodes when looking for the
          max value between two nodes.
         */
        Tree tree = new Tree();
        tree.addNode(1, 2);
        tree.addNode(1, 3);
        tree.addNode(3, 4);
        tree.addNode(3, 5);
        Operation.addValue(tree, 1, 100);
        Operation.addValue(tree, 3, -50);

        assertEquals(50, Operation.maxValue(tree, 4, 5));
    }

    @Test
    public void testMaxPathWithRootNode() {

    }
}
