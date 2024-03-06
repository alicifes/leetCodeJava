package easy.treeTravel;
import java.util.Objects;

public class TreeTravel {
    //前序遍历 这个前的意思为 root 节点边遍历的位置
    public void preorderTree(TreeNode root, String type) {
        if(Objects.equals(type, "pre")){
            dfsPre(root);
        }
        if(Objects.equals(type,"mid")){
            dfsMid(root);
        }
        if(Objects.equals(type,"last")){
            dfsRel(root);
        }
        System.out.println("???????");
    }

    public void dfsPre(TreeNode node) {
        if (node == null) {
            return;
        } else {
            System.out.println(node.val);
            dfsPre(node.left);
            dfsPre(node.right);
        }
    }
    //中序
    public void dfsMid(TreeNode node) {
        if (node == null) {
            return;
        } else {
            dfsPre(node.left);
            System.out.println(node.val);
            dfsPre(node.right);
        }
    }

    //倒序
    public void dfsRel(TreeNode node) {
        if (node == null) {
            return;
        } else {
            dfsPre(node.left);
            dfsPre(node.right);
            System.out.println(node.val);
        }
    }

    public static void main(String[] args) {
        TreeNode travelList = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        TreeTravel travel = new TreeTravel();
        travel.preorderTree(travelList,"pre");
        travel.preorderTree(travelList,"mid");
        travel.preorderTree(travelList,"last");
    }
}