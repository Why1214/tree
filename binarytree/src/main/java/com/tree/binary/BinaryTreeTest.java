package com.tree.binary;

public class BinaryTreeTest {

    public static void main(String[] args) {
        // 获取一颗三层二叉树
        BinaryTree binaryTree = createBinaryTree();

        // 遍历
        show(binaryTree);
    }


    // 创建一颗三层二叉树
    private static BinaryTree createBinaryTree() {
        // 创建一颗二叉树
        BinaryTree binaryTree = new BinaryTree();

        // 创建一个根节点
        TreeNode root = new TreeNode(1);
        binaryTree.setRoot(root);

        // 为根节点创建一个左节点
        TreeNode leftNode = new TreeNode(2);
        root.setLeftNode(leftNode);
        // 为根节点创建一个右节点
        TreeNode rightNode = new TreeNode(3);
        root.setRightNode(rightNode);

        // 为根节点的左节点创建 左节点和右节点
        leftNode.setLeftNode(new TreeNode(4));
        leftNode.setRightNode(new TreeNode(5));

        // 为根节点的右节点创建 左节点和右节点
        rightNode.setLeftNode(new TreeNode(6));
        rightNode.setRightNode(new TreeNode(7));

        // 将创建好的二叉树返回
        return binaryTree;
    }

    private static void show(BinaryTree binaryTree) {
        // 前序遍历
        System.out.print("前序遍历：");
        frontShow(binaryTree);
        System.out.println();
        System.out.println("--------------------------------");

        // 前序遍历
        System.out.print("中序遍历：");
        middleShow(binaryTree);
        System.out.println();
        System.out.println("--------------------------------");

        // 后序遍历
        System.out.print("后序遍历：");
        behindShow(binaryTree);
        System.out.println();
        System.out.println("--------------------------------");
    }

    /**
     * 前序遍历二叉树：先遍历本节点，再遍历本节点的左子树，最后遍历本节点的右子树
     *
     * @param binaryTree
     */
    private static void frontShow(BinaryTree binaryTree) {
        if (binaryTree == null) {
            return;
        }
        binaryTree.frontShow();
    }

    /**
     * 中序遍历二叉树：先遍历本节点的左子树，再遍历本节点，最后遍历本节点的右子树
     *
     * @param binaryTree
     */
    private static void middleShow(BinaryTree binaryTree) {
        if (binaryTree == null) {
            return;
        }
        binaryTree.middleShow();
    }

    /**
     * 后序遍历二叉树：先遍历本节点的左子树，再遍历本节点的右子树，最后遍历本节点
     *
     * @param binaryTree
     */
    private static void behindShow(BinaryTree binaryTree) {
        if (binaryTree == null) {
            return;
        }
        binaryTree.behindShow();
    }
}
