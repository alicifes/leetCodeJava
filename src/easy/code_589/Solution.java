package easy.code_589;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chenyuxiang
 * @Date 2024/4/2
 * @Description
 */
public class Solution {
    public List<Integer> preorder(Node root) {
        if (root == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        addNode(root, list);
        return list;
    }

    public void addNode(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        if (node.children != null) {
            for (Node child : node.children) {
                addNode(child, list);
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Node root = new Node(1);
        root.children = new ArrayList<>();
        root.children.add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));
        root.children.get(0).children = new ArrayList<>();
        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));
        System.out.println(solution.preorder(root));
    }
}
