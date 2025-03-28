package main;
import java.util.*;

public class bfsusingStack {
    public static void main(String[] args) {
        Integer[] nodes = {10, 5, 7, 15, 115, 207, 500};
        int target = 500;
        Stack<Integer> stack = new Stack<>();

        List<Integer> list = Arrays.asList(nodes);
        Collections.reverse(list);
        stack.addAll(list);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.println(node);
            if (node == target) {
                System.out.println("Found target: " + node);
                return;
            }
        }
        System.out.println("Target not found");
    }
}
