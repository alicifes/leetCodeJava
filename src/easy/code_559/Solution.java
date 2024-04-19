package easy.code_559;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chenyuxiang
 * @Date 2024/4/11
 * @Description
 */
public class Solution {
    public int maxDepth(Node root) {
        return getDepth(root);
    }

    public int getDepth(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.children == null) {
            return 1;
        }
        int max = 0;
        for (Node children : node.children) {
            max = Math.max(max, getDepth(children));
        }
        return max + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Node> children = new ArrayList<>();
        Node node = new Node(1, children);
        Node node1 = new Node(3);
        Node node2 = new Node(2);
        children.add(node1);
        children.add(node2);
        System.out.println(solution.maxDepth(node));
    }
}
