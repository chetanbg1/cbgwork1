package com.gfarm.binarytree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
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

	public BinaryTree() {
		// TODO Auto-generated constructor stub
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
		Queue<TreeNode> q = new LinkedList<>(); //create a queue
		q.add(root); //add root inqueue
		TreeNode toReplace = null; // delete and replace 
		while (!q.isEmpty()) { 
			TreeNode current = q.remove(); //remove from queue store in current
			if (current.data == data) { 
				toReplace = current; //replace with null
				break;
			}
			if (current.left != null) { // check current left
				q.add(current.left);  // add in queue
			}
			if (current.right != null) { //check current right
				q.add(current.right); // add in queue
			}
		}
		q.clear();     //clear the queue
		q.add(root);   // add root
		TreeNode leafNodeToDelete = null;
		while (!q.isEmpty()) {
			TreeNode current = q.remove();
			// leaf node
			if (current.left != null && current.left.left == null && current.left.right == null) {
				leafNodeToDelete = current.left;
				current.left = null;
				break;
			}
			if (current.right != null && current.right.left == null && current.right.right == null) {
				leafNodeToDelete = current.right;
				current.right = null;
				break;
			}
			if (current.left != null)
				q.add(current.left);
			if (current.right != null)
				q.add(current.right);
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
		if (root == null) {  // null check
			return;
		}
		Queue<TreeNode> que = new LinkedList<>(); //create queue
		que.offer(root);    // add the root
		while (!que.isEmpty()) {  // if queue not empty
			TreeNode temp = que.poll();   //remove the element from queue store in temp node
			System.out.print(temp.data + " "); // print the node
			if (temp.left != null) {   // check if temp has the left node 
				que.offer(temp.left); // add in queue
			}
			if (temp.right != null) {   // check if temp has the right node 
				que.offer(temp.right);  // add in queue
			}
		}
	}

	//
	public void levelTrav1(TreeNode root) {
		if (root == null) {   //null check
			return;
		}
		Queue<TreeNode> que = new LinkedList<>(); // create queue
		que.offer(root);    // add root in queue
		que.add(null);   //add null to keep track of level
		while (!que.isEmpty()) {   //if not empty
			TreeNode temp = que.poll();  //remove the element from queue store in temp
			if (temp == null) {    // if temp is null 
				System.out.println();   //new line
				if (que.isEmpty()) {  //if queue is empty breack
					break;
				} else {
					que.add(null);  // if not empty add null
				}
			} else {
				System.out.print(temp.data + " ");  // print the temp node
				if (temp.left != null) {   // if temp node has left node 
					que.offer(temp.left);   // add in queue
				}
				if (temp.right != null) {   // if temp right is not null
					que.offer(temp.right);   //add in queue
				}
			}
		}
	}

	// find max value in binary tree recursive
	public int maxValue(TreeNode root) {
		if (root == null) { // null check
			return 0;
		}
		int result = root.data; // initially consider root as max
		int left = maxValue(root.left); // recursive call to left subtree
		int right = maxValue(root.right); // recursive call to right subtree
		if (left > result) { // if left is greater than result set result as left
			result = left;
		}
		if (right > result) { // if right is greater than result set result as right
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

	
	public int diameterIterrative(TreeNode root) {
		
		Map<TreeNode, Integer> map = new HashMap<>();
		Stack<TreeNode> stack = new Stack<>();
		int diameter = 0;
		
		if(root !=null) {
			stack.push(root);
		}
		while(!stack.isEmpty()) {
			TreeNode node = stack.peek();
			//fill up the stack to perform post-order traversal
			if(node.left != null && !map.containsKey(node.left)) {
				stack.push(node.left);
			}else if(node.right != null && !map.containsKey(node.right)) {
				stack.push(node.right);
			}else {
				//process the root, once left and right subtree have been processed
				stack.pop();
				int leftDepth = map.getOrDefault(node.left, 0);
				int rightDepth = map.getOrDefault(node.right, 0);
				
				//put the max depth at a node in the map
				map.put(node,1 + Math.max(leftDepth, rightDepth));
				
				//update the max diameter found so far
				diameter = Math.max(diameter, leftDepth + rightDepth);
			}
		}
		return diameter; 
		
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
		if (subRoot == null) { // null check
			return true;
		}
		if (root == null) {
			return false;
		}
		if (root.data == subRoot.data) {
			if (isIdentical(root, subRoot)) { // call the method
				return true;
			}
		}
		return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
	}

	private boolean isIdentical(TreeNode root, TreeNode subRoot) {
		if (root == null && subRoot == null) { // if both are null retrun true
			return true;
		}
		if (root == null || subRoot == null) { // one of the node is not null return false
			return false;
		}
		if (root.data == subRoot.data) { // if node values are same
			// recursive call for left subtree and right subtree
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
		if (root == null) { // null check
			return 0;
		}
		Queue<TreeNode> q = new LinkedList<>(); // create a queue
		q.add(root); // add the root in queue
		int level = 0; // keep the track of level
		int sum = 0;
		int flag = 0;
		while (!q.isEmpty()) {
			int size = q.size();
			while (size-- > 0) { // if size is greater than zero
				TreeNode current = q.peek(); // peek the element
				q.remove(); // remove from the queue
				if (level == k) { // if level is equal to given parameter k
					flag = 1;
					sum += current.data; // add into sum
				} else { // if level not equal to given value of k
					if (current.left != null) // if left element exist add in queue
						q.add(current.left);

					if (current.right != null) // // if right element exist add in queue
						q.add(current.right);
				}
				level++; // increase the level by 1
				if (flag == 1) {
					break;// means we reach the given level no need to traverse further,return sum
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
//thought before coding
	// for each of the pairs of nodes 'p' and 'q'
	// if p and q both are null, then it is valid pair
	// if one of the node is null then it is invalid pair
	// if node contain the same value, it is valid pair
	// if does not contain the same value it is invalid pair
	// we will implement the preorder recursive approach
	// first compare the root then left and right subtrees
//pseudo code
	// implement the recursive preorder traversal
	// parameters, p- current node in p tree , q- current node in q tree
	// base case, if both the nodes are null return true
	// one of the node is null return false - invalid
	// in each of the recursive call if two node values are not the same return
	// false
	// recursively compare the left subtree p => p.left , q => q.left
	// recursively compare the right subtree p => p.right , q => q.right
	// return true only if both recursive calls returns true
//time complexity - O(n) - n is the number of nodes, visit each node once
//space complexity O(h) - h is the height of smaller tree
	// O(h) - recursive call stack memory

	private static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;

		return p.data == q.data && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

	}

//we will implement the recursive approach
	// we will compare two nodes denoted as 'p' and 'q'
	// p and q both are null valid pair return true
	// if one of the node is null invalid return false
	// if the values of the node are same then valid return true, else if not same
	// then invalid
	// after comparing the node we will compare subtrees
	// compare p.left with q.right
	// compare p.right with q.left
//pseudo code
	// if root is null return true
	// recursively compare the subtree
	// parameters
	// p, node 1 - initially root.left
	// q, node 2 - initially root.right
	// base case
	// both are null return true
	// if one is null return false
	// in each of the recursive call if node values are not same return false or
	// else true
	// recursively compare p.left with q.right
	// recursively compare p.right with q.left
	// Return true if both call return true
//time complexity O(n) - n- is no of nodes ,visit each node once
//space complexity O(h), h - is the height of tree, recursive call stack memory 

	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return isSymmetric(root.left, root.right);
	}

	private boolean isSymmetric(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;

		return p.data == q.data && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
	}

	// symmetric tree iterative approach
//pseudo code
	// if root is equal to null return true
	// create the queue to keep track of our nodes , add root twice to the queue
	// while queue is not empty , poll two nodes p and q from the queue
	// if both are null continue to next iteration
	// if one of the node is null or node does not contain same values return false
	// add p.left and q.right into queue
	// add q.right and p.left into queue
	// return true after evaluating all the pairs
//time complexity
	// O(n) = n is the number of nodes,visit each node once
//space complexity O(n) , queue created

	public boolean isSymmetrici(TreeNode root) {
		if (root == null)
			return true;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		queue.add(root);
		
		while (!queue.isEmpty()) {
			TreeNode p = queue.poll();
			TreeNode q = queue.poll();

			if (p == null && q == null)
				continue;
			if ((p == null || q == null)||(p.data != q.data))
				return false;
			queue.add(p.left);
			queue.add(q.right);
			queue.add(p.right);
			queue.add(q.left);
		}
		return true;
	}

//balance binary tree
	// given a binary tree determine is it balanced height tree 
	//left and right subtree of every node is differ in height by no more than 1 
//thought before coding
	//we will implement the recursive approach
	//we will find the height of left and right subtree
	// then we will check that the difference should not be more than 1
	
	public boolean isBalanced(TreeNode root) {
		if(root == null) return true;
		
		return (Math.abs(heightOfTree(root.left) - heightOfTree(root.right)) <= 1);
	}

	
//min depth of tree
	public int minDepth(TreeNode root) {
		if(root == null) return 0;
		return Math.min(heightOfTree(root.left), heightOfTree(root.right)) +1;
	}
	public static void main(String[] args) {
//		BinaryTree tree = new BinaryTree();
//		BinaryTree tree = new BinaryTree(7);
//		
//		tree.insert(1);
//		tree.insert(2);
//		tree.insert(3);
//		tree.insert(4);
//		tree.insert(5);
//		tree.insert(6);
//		tree.delete(4);
//		
//		BinaryTree p = new BinaryTree(1);
//		p.insert(2);
//		p.insert(3);
//		p.preOrder(p.root);
//		System.out.println();
//		BinaryTree q = new BinaryTree(1);
//		q.insert(2);
//		q.insert(3);
//		p.preOrder(p.root);
//		System.out.println();
//		System.out.println(isSameTree(p.root, q.root));

		// int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		// int subNode [] = {2, 4, -1, -1, 5, -1, -1};
		// TreeNode root = tree.buildTree(node);
		// TreeNode subRoot = tree.buildTree(subNode);
//		System.out.println(root.data);
//		 tree.createBinaryTree();
//		tree.preOrder(tree.root);
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
//		System.out.println();
//		 System.out.println(tree.sumAtKthLevel(tree.root, 1, 0));
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

		BinaryTree tree = new BinaryTree(1);

		tree.insert(2);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(4);
		tree.insert(3);
		//tree.preOrder(tree.root);
		System.out.println(tree.diameter(tree.root));
		System.out.println(tree.diameterIterrative (tree.root));
//		System.out.println(tree.isSymmetrici(tree.root));
//		tree.levelTrav1(tree.root);
//		
//		System.out.println(tree.isBalanced(tree.root));
//		System.out.println(tree.minDepth(tree.root));

	}

}
