package com.gfarm.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	private TreeNode root;

	private class TreeNode {
		private int data;
		private TreeNode right;
		private TreeNode left;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(9);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
		third.left = sixth;

	}

	// preorder recursive
	public void preOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");

		preOrder(root.left);
		preOrder(root.right);
	}

	// iterative traversal preorder
	public void preOrderT() {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.data + " ");
			if (temp.right != null) {
				stack.push(temp.right);
			}
			if (temp.left != null) {
				stack.push(temp.left);
			}
		}

	}

	// iterative inorder traversal
	public void inOrderT() {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while (!stack.isEmpty() || temp != null) {
			if (temp != null) {
				stack.push(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
				System.out.print(temp.data + "--> ");
				temp = temp.right;
			}
		}
	}

	// iterative post order traversal
	public void postOrderT() {
		if (root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode current = root;
		while (!stack.isEmpty() || current != null) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				TreeNode temp = stack.peek().right;
				if (temp == null) {
					temp = stack.pop();
					System.out.print(temp.data + " ");
					while(!stack.isEmpty() && temp ==stack.peek().right){
						temp = stack.pop();
						System.out.print(temp.data + " ");
					}
				} else {
					current = temp;
				}
			}
		}
	}

	// recursive inorder traversal
	public void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	// recursive postorder traversal
	public void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		inOrder(root.right);
		System.out.print(root.data + " ");

	}
	
	//level order traversal 
	public void levelTrav() {
		if(root == null) {
			return;
		}
		Queue<TreeNode> que = new LinkedList<>();
		que.offer(root);
		while(!que.isEmpty()){
			TreeNode temp = que.poll();
			System.out.print(temp.data + " ");
			if(temp.left != null) {
				que.offer(temp.left);
			}
			if(temp.right != null) {
				que.offer(temp.right);
			}
		}
	}
	//find max value in binary tree recursive
	public int maxValue(TreeNode root) {
		if(root ==null) {
			return 0;
		}
		int result = root.data;
		int left = maxValue(root.left);
		int right = maxValue(root.right);
		if(left > result) {
			result =  left;
		}
		if(right > result) {
			result = right;
		}
		return result;
		
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createBinaryTree();
		// tree.preOrder(tree.root);
		// System.out.println();
		// tree.preOrderT();
		// System.out.println();
		// tree.inOrder(tree.root);
		// System.out.println();
		//tree.postOrder(tree.root);
		//System.out.println();
		// tree.inOrderT();
		//tree.postOrderT();
		System.out.println();
		//tree.levelTrav();
		System.out.println();
		System.out.println(tree.maxValue(tree.root));
	}

}
