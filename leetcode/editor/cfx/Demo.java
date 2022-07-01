package cfx;

import java.util.LinkedList;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2022-05-27 13:14
 * @Description:
 */

public class Demo {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        TreeNode binaryTree = TreeNode.createBinaryTree(list);
        preOrderTraveral(binaryTree);
    }


    /**
     * 前序遍历 根->左->右
     *
     * @param node
     */
    public static void preOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.getData() + "->");
        preOrderTraveral(node.getLeft());
        preOrderTraveral(node.getRight());
    }
}
