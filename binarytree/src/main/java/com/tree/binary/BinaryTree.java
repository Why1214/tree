package com.tree.binary;

/**
 * 二叉树
 */
public class BinaryTree {

    // 代表二叉树的根节点
    private TreeNode root;

    public void setRoot(TreeNode root) {
        if (root == null) {
            throw new NullPointerException("root must be not null");
        }
        this.root = root;
    }

    /**
     * 前序遍历二叉树：
     * 先遍历本节点，
     * 再遍历本节点的左边，
     * 最后遍历本节点的右边
     */
    public void frontShow() {
        this.frontShow(this.root);
    }

    private void frontShow(TreeNode currentNode) {
        // 先遍历本节点
        System.out.print(currentNode.getData() + ",");

        // 再遍历本节点的左子树
        if (currentNode.getLeftNode() != null) {
            frontShow(currentNode.getLeftNode());
        }

        // 最后遍历本节点的右子树
        if (currentNode.getRightNode() != null) {
            frontShow(currentNode.getRightNode());
        }
    }

    /**
     * 中序遍历二叉树：
     * 先遍历本节点的左边，
     * 再遍历本节点，
     * 最后遍历本节点的右边
     */
    public void middleShow() {
        this.middleShow(this.root);
    }

    private void middleShow(TreeNode currentNode) {
        // 先遍历本节点的左子树
        if (currentNode.getLeftNode() != null) {
            middleShow(currentNode.getLeftNode());
        }

        // 再遍历本节点
        System.out.print(currentNode.getData() + ",");

        // 最后遍历本节点的右子树
        if (currentNode.getRightNode() != null) {
            middleShow(currentNode.getRightNode());
        }
    }

    /**
     * 后序遍历二叉树：
     * 先遍历本节点的左边，
     * 再遍历本节点的右边，
     * 最后遍历本节点
     */
    public void behindShow() {
        this.behindShow(this.root);
    }

    private void behindShow(TreeNode currentNode) {
        // 先遍历本节点的左子树
        if (currentNode.getLeftNode() != null) {
            behindShow(currentNode.getLeftNode());
        }

        // 再遍历本节点的右子树
        if (currentNode.getRightNode() != null) {
            behindShow(currentNode.getRightNode());
        }

        // 最后遍历本节点
        System.out.print(currentNode.getData() + ",");
    }
}
