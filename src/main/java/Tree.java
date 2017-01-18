
import java.util.HashMap;

/**
 * Created by jamescarlson on 1/17/17.
 */
public class Tree {

    private Node root;
    private HashMap<Integer, Node> treeMap;

    public Tree() {
        this.root = new Node(1);
        treeMap = new HashMap<>();
        treeMap.put(1, root);
    }

    public Node getNode(int id) {
        return treeMap.get(id);
    }

    public void addNode(int parentId, int childId) {
        if (parentId == childId)
            return;

        Node parent = getNode(parentId);
        Node child = new Node(childId);

        if (parent != null) {
            child.setParent(parent);
            parent.addChild(child);
            treeMap.put(childId, child);
        } else {
            parent = new Node(parentId);
            parent.addChild(child);
            treeMap.put(parentId, parent);
            treeMap.put(childId, child);
            child.setParent(parent);
        }
    }
}