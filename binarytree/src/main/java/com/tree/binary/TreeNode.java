package com.tree.binary;

/**
 * 二叉树的节点
 * 至少应该包含：本身的值，左子节点的指向，右子节点的指向
 * 实际开发开发中可以作为 BinaryTree 的内部类存在--符合高内聚
 */
public class TreeNode {
    // 当前节点的值
    private int data;

    // 当前节点的子左节点
    private TreeNode leftNode;

    // 当前节点的子右节点
    private TreeNode rightNode;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getLeftNode() {
        return this.leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode getRightNode() {
        return this.rightNode;
    }
}
