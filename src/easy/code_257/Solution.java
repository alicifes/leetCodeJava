package easy.code_257;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root, "", list);
        return list;
    }

    public void dfs(TreeNode node, String path, List<String> list) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            list.add(path + node.val);
            return;
        }
        dfs(node.left, path + node.val + "->", list);
        dfs(node.right, path + node.val + "->", list);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(solution.binaryTreePaths(root));
    }
}
