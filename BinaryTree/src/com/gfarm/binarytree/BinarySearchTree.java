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
		if (root == null) { // null check
			root = new TreeNode(value); // if null add new node at root
			return root;
		}
		if (value < root.data) { // if value is less than root data
			root.left = insert(root.left, value); // add in left of the root node
		}
		if (value > root.data) { //// if value is greater than root data
			root.right = insert(root.right, value); // add in right of the root node
		}
		return root;
	}

	// delete node
	public TreeNode delete(TreeNode root, int val) {
		if (root.data > val) { // if val is less than root data
			root.left = delete(root.left, val); // recursive call in left subtree
		} else if (root.data < val) { // if val is greater than root data
			root.right = delete(root.right, val); // recursive call in right subtree
		} else {
			// case 1 no child
			if (root.left == null && root.right == null) { // if both left and right child are null return null
				return null;
			}
			// case 2 with 1 child
			if (root.left == null) { // if left child is null
				return root.right; // return right
			} else if (root.right == null) { // else if right is null return left
				return root.left;
			}
			// case 3 having 2 child nodes
			TreeNode is = inorderSuccessor(root.right);
			// inorder successor is left most element from the root
			root.data = is.data; // replacing root data with Inorder Successor
			root.right = delete(root.right, is.data);// recursively call the delete method where root will be right node
														// and val is inorder successor
		}
		return root;
	}

	private TreeNode inorderSuccessor(TreeNode root) {
		while (root.left != null) { // null check for left chile
			root = root.left; // if not null go till left most child
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
		if (key < root.data) { // if key is less than root
			return search1(root.left, key); // recursive call in left subtree
		} else if (root.data == key) { // if key matches root data return true
			return true;
		} else {
			return search1(root.right, key); // else recursively search in right subtree
		}
	}

	// valid
	public boolean isValid(TreeNode root, long min, long max) {
		if (root == null) { // null check for root
			return true;
		}
		if (root.data <= min || root.data >= min) { // check the long range
			return false;
		}
		boolean left = isValid(root.left, min, root.data); // recursive call in left subtree max is root data
		if (left) { // if left recursion returns true
			boolean right = isValid(root.right, root.data, max); // recursive call in right subtree where min is root
																	// data
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

	// root to leave paths
	public void printRootToLeaf(TreeNode root, ArrayList<Integer> path) {
		if (root == null) {
			return;
		}
		path.add(root.data);
		if (root.left == null && root.right == null) {
			printPath(path);
		} else {
			printRootToLeaf(root.left, path);
			printRootToLeaf(root.right, path);
		}
		path.remove(path.size() - 1);
	}

	private void printPath(ArrayList<Integer> path) {
		for (int i : path) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

//convert sorted array into binary search tree
	// given an array where elements are stored in ascending order, convert it into
	// a height
	// balance BST
	// height balance tree is defined as a binary tree in which the depth of the two
	// subtrees
	// of every node never differ by more than 1
//thought before coding
	// we are given an sorted array, which number we choose to be a root of current
	// subtree
	// we have to peek the value of mid index to be the root of our tree
	// this will allow element to left, to be on left subtree
	// and element to right, on right subtree
	// we will keep track of our current boundaries
//pseudo code
	// implement recursive approach to generate tree
	// parameters - nums an input array
	// left, the current left boundary, initially 0
	// right, the current right boundary, initially at nums.length -1;
	// base case - if left is > right return null
	// in each of the recursive call
	// calculate the mid index, mid = left + (left + right)/2
	// generate the root node with nums[mid]
	// recursively generate the left subtree of root
	// right => mid-1
	// recursively generate the right subtree of root
	// left => mid+1
	// return root
//time complexity -O(n) n -length of array, visit a each node once
//space complexity -O(h+n) 
	// O(h) - recursive call stack memory
	// O(n) - newly created tree
	public TreeNode sortedArray(int[] nums) {
		return sortedArraytiBST(nums, 0, nums.length - 1);
	}

	private TreeNode sortedArraytiBST(int[] nums, int left, int right) {
		if (left > right) {
			return null;
		}
		int mid = left + (right - left) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = sortedArraytiBST(nums, left, mid - 1);
		root.right = sortedArraytiBST(nums, mid + 1, right);

		return root;
	}

//path sum
	//given the root of binary tree and integer target sum, return true if the tree has a 
	//root to leaf path such that adding up all the values along the path equals target sum
//thought before coding
	// we will use recursive approach
	//parameters, node - current node we are visiting
	// 			  sum - initially 0 , target sum 
	// base condition
	// node equal to null return false
	//in each recursive call increment sum by node.data 
	// if node is leaf node return true if sum is equal to target sum else return false
	// if not a leaf node, recursively find a path in left subtree
	// node => node.left
	//recursively find a path in right subtree
	// node => node.right
	//return if either of the path is valid or else return false if both the paths are invalid 
//time complexity O(n) - n is no of nodes - visit each node once
//space complexity O(h) h - height of the tree , recursive call stack memory

	public boolean hasPathSum(TreeNode root, int targetSum) {
		return hasPathSum(root, 0, targetSum);
	}
	
	
	private boolean hasPathSum(TreeNode node, int sum, int targetSum) {
		if(node == null) return false;
		
		sum += node.data; //add current node in sum
		
		if(node.left == null && node.right == null) {
			return sum == targetSum;
		}
		return hasPathSum(node.left, sum, targetSum) || hasPathSum(node.right, sum, targetSum);
	
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
//		ArrayList<Integer> path = new ArrayList<>();
//		tree.printRootToLeaf(tree.root, path);
		// System.out.println();
		// System.out.println(tree.search(tree.root, 3).data);
		// System.out.println(tree.isValid(tree.root, -100, 100));

//		int[] nums = { -10, -3, 0, 5, 9 };
//		TreeNode result = tree.sortedArray(nums);
//		tree.preorder(result);
		tree.preorder(tree.root);
		System.out.println(tree.hasPathSum(tree.root, 6));
	}

}
