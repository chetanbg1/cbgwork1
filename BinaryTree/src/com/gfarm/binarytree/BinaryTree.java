package com.gfarm.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	private TreeNode root;
	static int idx = -1;

	private class TreeNode {
		private int data;
		private TreeNode right;
		private TreeNode left;

		public TreeNode(int data) { // constructor
			this.data = data;
		}
	}

	public BinaryTree(int rootData) {
		root = new TreeNode(rootData);
	}

	// insert
	public void insert(int data) {
		TreeNode newNode = new TreeNode(data);
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			if (temp.left == null) {
				temp.left = newNode;
				return;
			} else if (temp.right == null) {
				temp.right = newNode;
				return;
			} else {
				q.add(temp.left);
				q.add(temp.right);
			}
		}
	}

	// delete
	public void delete(int data) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		TreeNode toReplace = null;
		while (!q.isEmpty()) {
			TreeNode current = q.remove();
			if (current.data == data) {
				toReplace = current;
				break;
			}
			if (current.left != null) {
				q.add(current.left);
			}
			if (current.right != null) {
				q.add(current.right);
			}
		}
			q.clear();
			q.add(root);
			TreeNode leafNodeToDelete = null;
			while (!q.isEmpty()) {
				TreeNode current = q.remove();
				//leaf node
				if(current.left!=null && current.left.left == null && current.left.right == null) {
					leafNodeToDelete = current.left;
					current.left = null;
					break;
				}
				if(current.right!=null && current.right.left == null && current.right.right == null) {
					leafNodeToDelete = current.right;
					current.right = null;
					break;
				}
				if(current.left != null) q.add(current.left);
				if(current.right != null) q.add(current.right);
		}
			toReplace.data = leafNodeToDelete.data;
			leafNodeToDelete = null;
	}

	public TreeNode buildTree(int node[]) {
		idx++;
		if (node[idx] == -1) {
			return null;
		}
		TreeNode newNode = new TreeNode(node[idx]);
		newNode.left = buildTree(node);
		newNode.right = buildTree(node);
		return newNode;
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
					while (!stack.isEmpty() && temp == stack.peek().right) {
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

	// level order traversal
	public void levelTrav() {
		if (root == null) {
			return;
		}
		Queue<TreeNode> que = new LinkedList<>();
		que.offer(root);
		while (!que.isEmpty()) {
			TreeNode temp = que.poll();
			System.out.print(temp.data + " ");
			if (temp.left != null) {
				que.offer(temp.left);
			}
			if (temp.right != null) {
				que.offer(temp.right);
			}
		}
	}

	//
	public void levelTrav1(TreeNode root) {
		if (root == null) {
			return;
		}
		Queue<TreeNode> que = new LinkedList<>();
		que.offer(root);
		que.add(null);
		while (!que.isEmpty()) {
			TreeNode temp = que.poll();
			if (temp == null) {
				System.out.println();
				if (que.isEmpty()) {
					break;
				} else {
					que.add(null);
				}
			} else {
				System.out.print(temp.data + " ");
				if (temp.left != null) {
					que.offer(temp.left);
				}
				if (temp.right != null) {
					que.offer(temp.right);
				}
			}
		}
	}

	// find max value in binary tree recursive
	public int maxValue(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int result = root.data;
		int left = maxValue(root.left);
		int right = maxValue(root.right);
		if (left > result) {
			result = left;
		}
		if (right > result) {
			result = right;
		}
		return result;

	}

	// count the nodes
	public int countNode(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftNodes = countNode(root.left);
		int rightNodes = countNode(root.right);

		return leftNodes + rightNodes + 1;

	}

	// sum of nodes
	public int sumofNodes(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int result = root.data;
		int leftSum = sumofNodes(root.left);
		int rightSum = sumofNodes(root.right);

		return result + leftSum + rightSum;
	}

	// height of Tree
	public int heightOfTree(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = heightOfTree(root.left);
		int rightHeight = heightOfTree(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
//		if(leftHeight > rightHeight) {
//			return leftHeight +1;
//		}else 
//			 return rightHeight +1;
	}

	// diameter of the tree
	// number of nodes in the longest path between any2 nodes
	// case1 -- through the root
	// case 2 -- not through the root
	public int diameter(TreeNode root) { // O(n^2)
		if (root == null) {
			return 0;
		}
		int diam1 = diameter(root.left);
		int diam2 = diameter(root.right);
		int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

		return Math.max(diam3, Math.max(diam1, diam2));

	}

	// diameter of the tree in O(n)
	static class TreeInfo {
		int ht; // height
		int diam; // diameter

		public TreeInfo(int ht, int diam) {
			super();
			this.ht = ht;
			this.diam = diam;
		}

	}

	public TreeInfo diameter1(TreeNode root) {
		if (root == null) {
			return new TreeInfo(0, 0);
		}
		TreeInfo left = diameter1(root.left);
		TreeInfo right = diameter1(root.right);

		int myheight = Math.max(left.ht, right.ht) + 1;
		int diam1 = left.diam;
		int diam2 = right.diam;
		int diam3 = left.ht + right.ht + 1;

		int myDiam = Math.max(diam3, Math.max(diam1, diam2));

		TreeInfo myInfo = new TreeInfo(myheight, myDiam);
		return myInfo;

	}

	// subTree of other tree
	public boolean isSubTree(TreeNode root, TreeNode subRoot) {
		if (subRoot == null) {
			return true;
		}
		if (root == null) {
			return false;
		}
		if (root.data == subRoot.data) {
			if (isIdentical(root, subRoot)) {
				return true;
			}
		}
		return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
	}

	private boolean isIdentical(TreeNode root, TreeNode subRoot) {
		if (root == null && subRoot == null) {
			return true;
		}
		if (root == null || subRoot == null) {
			return false;
		}
		if (root.data == subRoot.data) {
			return isIdentical(root.left, subRoot) && isIdentical(root.right, subRoot);
		}
		return false;
	}
	// sum at the Kth level
	// Traverse the Binary Tree using Level Order Traversal and queue
	// During traversal, pop each element out of the queue and push it’s child (if
	// available) in the queue.
	// Keep the track of the current level of the Binary tree.
	// To track the current level,
	// declare a variable level and increase it whenever a child is traversed from
	// the parent.
	// When the current level of the tree i.e. the variable level meets the required
	// Kth level,
	// pop the elements from the queue and calculate their sum.

	public int sumAtKthLevel(TreeNode root, int k) {
		if (root == null) {
			return 0;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		int level = 0;
		int sum = 0;
		int flag = 0;
		while (!q.isEmpty()) {
			int size = q.size();
			while (size-- > 0) {
				TreeNode current = q.peek();
				q.remove();
				if (level == k) {
					flag = 1;
					sum += current.data;
				} else {
					if (current.left != null)
						q.add(current.left);

					if (current.right != null)
						q.add(current.right);
				}
				level++;
				if (flag == 1) {
					break;
				}

			}

		}
		return sum;
	}

	// sum at kth recursion
	public int sumAtKthLevel(TreeNode root, int k, int level) {
		if (root == null) {
			return 0; // If the tree node is null, return 0 (no sum).
		}
		if (level == k) {
			return root.data; // If we've reached the desired level, return the node's value.
		}
		// Recursively calculate the sum at the kth level in the left and right
		// subtrees.
		return sumAtKthLevel(root.left, k, level + 1) + sumAtKthLevel(root.right, k, level + 1);
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(7);
		
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		tree.delete(4);
		// int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		// int subNode [] = {2, 4, -1, -1, 5, -1, -1};
		// TreeNode root = tree.buildTree(node);
		// TreeNode subRoot = tree.buildTree(subNode);
//		System.out.println(root.data);
//		// tree.createBinaryTree();
		tree.preOrder(tree.root);
//		System.out.println();
//		tree.inOrder(root);
//		System.out.println();
//		tree.postOrder(root);
//		System.out.println();
//		tree.levelTrav1(root);
//		System.out.println(tree.countNode(root));
//		System.out.println(tree.sumofNodes(root));
//		System.out.println(tree.heightOfTree(root));
//		System.out.println(tree.diameter(root));
//		System.out.println(tree.diameter1(root).diam);
//		System.out.println(tree.diameter1(root).ht);
		// System.out.println(tree.sumAtKthLevel(root, 3));
		// System.out.println(tree.sumAtKthLevel(root, 1, 0));
		// System.out.println(tree.isSubTree(root,subRoot));
		// System.out.println();
		// tree.preOrderT();
		// System.out.println();
		// tree.inOrder(tree.root);
		// System.out.println();
		// tree.postOrder(tree.root);
		// System.out.println();
		// tree.inOrderT();
		// tree.postOrderT();
		// System.out.println();
		// tree.levelTrav();
		// System.out.println();
		// System.out.println(tree.maxValue(tree.root));
	}

}
