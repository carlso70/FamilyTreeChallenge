import java.util.Stack;

/**
 * Created by jamescarlson on 1/17/17.
 */
public final class Operation {

    static int maxValue(Tree tree, int id, int id2) {
        Node node = tree.getNode(id);
        Node node2 = tree.getNode(id2);

        if (node != null || node2 != null) {
            int max = node.getValue();
            while (node != null) {
                if (node.getValue() > max)
                    max = node.getValue();
                node = node.getParent();
            }
            while (node2 != null) {
                if (node2.getValue() > max)
                    max = node2.getValue();
                node2 = node2.getParent();
            }

            return max;
        }

        return -1;
    }

    static void addValue(Tree tree, int id, int value) {
        Node parent = tree.getNode(id);
        if (parent != null) {
            Stack<Node> nodeStack = new Stack<>();
            nodeStack.push(parent);

            while (!nodeStack.isEmpty()) {
                Node node = nodeStack.pop();
                node.addValue(value);
                for (Node n: node.getChildren())
                    nodeStack.push(n);
            }
        }
    }
}
