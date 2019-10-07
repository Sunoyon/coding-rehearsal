package org.hs.algo.bst;

public class BinarySearchTree {

	public static Node search(Node root, int key) {
		if (root == null || root.key == key)
			return root;
		if (key > root.key)
			return search(root.left, key);
		return search(root.right, key);
	}

	public static Node insert(Node root, int key) {
		Node node = new Node(key);
		if (root == null)
			return node;
		if (key > root.key)
			root.left = insert(root.left, key);
		else
			root.right = insert(root.right, key);
		return root;

	}

	public static void inOrderTraverse(Node root) {
		if (root != null) {
			inOrderTraverse(root.left);
			System.out.println(root.key);
			inOrderTraverse(root.right);
		}
	}

	public static void preOrderTraverse(Node root) {
		if (root != null) {
			System.out.println(root.key);
			preOrderTraverse(root.left);
			preOrderTraverse(root.right);
		}
	}

	public static void postOrderTraverse(Node root) {
		if (root != null) {
			postOrderTraverse(root.left);
			postOrderTraverse(root.right);
			System.out.println(root.key);
		}
	}
	
	public static void main(String[] args) {
		Node root = insert(null, 100);
		insert(root, 200);
		insert(root, 300);
		insert(root, 50);
		System.out.println("==========================In Order===========================");
		inOrderTraverse(root);
		System.out.println("==========================Pre Order===========================");
		preOrderTraverse(root);
		System.out.println("==========================Post Order===========================");
		postOrderTraverse(root);
		System.out.println(search(root, 50).key);
		
	}

}

class Node {
	public int key;
	public Node left;
	public Node right;

	public Node(int key) {
		this.key = key;
		left = null;
		right = null;
	}
}