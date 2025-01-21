# Leetcode6

This project contains a solution to the LeetCode problem of inorder traversal of a binary tree. The solution is implemented in Java.

## Example


Input: root = [1,null,2,3]

Output: [1,3,2]
----------------------------------------------
## Explanation:
![Example 1](https://assets.leetcode.com/uploads/2024/08/29/screenshot-2024-08-29-202743.png)

## Working Process

1. **TreeNode Class**: Defines the structure of a node in the binary tree.
2. **Solution Class**: Contains the `inorderTraversal` method which performs the inorder traversal using an iterative approach with a stack.
3. **Main Class**: Creates a binary tree from an array and calls the `inorderTraversal` method to print the result.

## Time Complexity

The time complexity of the `inorderTraversal` method is O(n), where n is the number of nodes in the binary tree. This is because each node is visited exactly once.

## About

This project demonstrates an iterative approach to inorder traversal of a binary tree using a stack. It includes the creation of a binary tree from an array and the traversal of the tree to produce a list of node values in inorder sequence.

## More

For more information, visit the [LeetCode problem page](https://leetcode.com/problems/binary-tree-inorder-traversal/description/).
