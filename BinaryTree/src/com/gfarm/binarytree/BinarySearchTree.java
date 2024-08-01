package com.gfarm.binarytree;

import java.util.ArrayList;

public class BinarySearchTree {

	private TreeNode root;

	private class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	// insert recursive

	public void insert(int data) {
		root = insert(root, data);
	}

	public TreeNode insert(TreeNode root, int value) {
		if (root == null) {
			root = new TreeNode(value);
			return root;
		}
		if (value < root.data) {
			root.left = insert(root.left, value);
		}
		if (value > root.data) {
			root.right = insert(root.right, value);
		}
		return root;
	}

	// delete node
	public TreeNode delete(TreeNode root, int val) {
		if (root.data > val) {
			root.left = delete(root.left, val);
		} else if (root.data < val) {
			root.right = delete(root.right, val);
		} else {
			// case 1 no child
			if (root.left == null && root.right == null) {
				return null;
			}
			// case 2 with 1 child
			if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			// case 3 having 2 child nodes
			TreeNode is = inorderSuccessor(root.right);
			// inorder successor id left most element from the root
			root.data = is.data; // replacing root data with Inorder Successor
			root.right = delete(root.right, is.data);
		}
		return root;
	}

	private TreeNode inorderSuccessor(TreeNode root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}

	// print
	public void preorder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	// inorder
	public void inorder(TreeNode root) {
		if (root == null) {
			return;
		}

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

	// serarch
	public TreeNode search(TreeNode root, int key) {
		if (root == null || root.data == key) {
			return root;
		}
		if (key < root.data) {
			return search(root.left, key);
		} else {
			return search(root.right, key);
		}
	}

	// serarch
	public boolean search1(TreeNode root, int key) {
		if (root == null) {
			return false;
		}
		if (key < root.data) {
			return search1(root.left, key);
		} else if (root.data == key) {
			return true;
		} else {
			return search1(root.right, key);
		}
	}

	// valid
	public boolean isValid(TreeNode root, long min, long max) {
		if (root == null) {
			return true;
		}
		if (root.data <= min || root.data >= min) {
			return false;
		}
		boolean left = isValid(root.left, min, root.data);
		if (left) {
			boolean right = isValid(root.right, root.data, max);
			return right;
		}
		return false;
	}

	// print range
	public void printInRange(TreeNode root, int x, int y) {
		if (root == null) {
			return;
		}
		if (x <= root.data && root.data <= y) {
			printInRange(root.left, x, y);
			System.out.print(root.data + " ");
			printInRange(root.right, x, y);
		} else if (root.data >= y) {
			printInRange(root.left, x, y);
		} else
			printInRange(root.right, x, y);
	}
	//root to leave paths
	public void printRootToLeaf(TreeNode root, ArrayList<Integer> path) {
		if(root ==null) {
			return;
		}
		path.add(root.data);
		if(root.left ==null && root.right==null) {
			printPath(path);
		}else {
		printRootToLeaf(root.left, path);
		printRootToLeaf(root.right, path);
		}
		path.remove(path.size()-1);
	}
	private void printPath(ArrayList<Integer> path) {
		for(int i :path) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(8);
		tree.insert(5);
		tree.insert(3);
		tree.insert(1);
		tree.insert(4);
		tree.insert(6);
		tree.insert(10);
		tree.insert(11);
		tree.insert(14);
		// System.out.println(tree.insert(tree.root, 5).data);
		
//		System.out.println(tree.search1(tree.root, 89));
//		tree.preorder(tree.root);
//		System.out.println();
//		tree.inorder(tree.root);
//		tree.delete(tree.root, 5);
//		System.out.println();
//		tree.inorder(tree.root);
//		System.out.println();
//		tree.printInRange(tree.root, 4, 11);
		ArrayList<Integer> path = new ArrayList<>();
		tree.printRootToLeaf(tree.root, path);
		// System.out.println();
		// System.out.println(tree.search(tree.root, 3).data);
		// System.out.println(tree.isValid(tree.root, -100, 100));

	}

}
