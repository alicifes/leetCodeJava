package easy.code_589;

import java.util.List;

/**
 * @Author chenyuxiang
 * @Date 2024/4/2
 * @Description
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
