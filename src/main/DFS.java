package main;
import java.util.*;

class TreeDFS {
    int value;
    List<TreeDFS> children;

    // Constructor to initialize the node with a value
    public TreeDFS(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    // Method to add a child to the current node
    public TreeDFS addChild(int childValue) {
        TreeDFS child = new TreeDFS(childValue);
        children.add(child);
        return child;
    }

    // Method to get the children of the current node
    public List<TreeDFS> getChildren() {
        return children;
    }

    // Method to get the value of the current node
    public int getValue() {
        return value;
    }
}
public class DFS {
    public static TreeDFS search(int target, TreeDFS root) {
        // Create a stack to store nodes for DFS
        Stack<TreeDFS> stack = new Stack<>();

        // Push the root node onto the stack to start the search
        stack.push(root);

        // Continue searching until the stack is empty
        while (!stack.isEmpty()) {
            // Pop the last inserted node (LIFO)
            TreeDFS currentNode = stack.pop();

            // Print the current node's value for debugging
            System.out.println("Visiting Node: " + currentNode.getValue());

            // Check if we found the target value
            if (currentNode.getValue() == target) {
                System.out.println("Target found: " + currentNode.getValue());
                return currentNode; // Return the found node
            }

            // Add all children to the stack in reverse order
            // So that the first child is processed last (mimicking recursion)
            List<TreeDFS> children = currentNode.getChildren();
            for (int i = children.size() - 1; i >= 0; i--) {
                stack.push(children.get(i));
            }
        }

        // If we finish the loop without finding the target, return null
        System.out.println("Target not found.");
        return null;
    }

    public static void main(String[] args) {
        // Create a sample tree
        TreeDFS root = new TreeDFS(10); // Root node
        TreeDFS firstChild = root.addChild(5); // Root -> First child
        root.addChild(7); // Root -> Second child
        root.addChild(15); // Root -> Third child
        TreeDFS firstChildChild = firstChild.addChild(115); // 5 -> 115
        firstChildChild.addChild(207); // 115 -> 207
        firstChildChild.addChild(500); // 115 -> 500

        // Perform DFS search for a target value
        TreeDFS foundNode = search(500, root);

        // Print result
        if (foundNode != null) {
            System.out.println("Found node with value: " + foundNode.getValue());
        } else {
            System.out.println("Target not found in tree.");
        }
    }
}

