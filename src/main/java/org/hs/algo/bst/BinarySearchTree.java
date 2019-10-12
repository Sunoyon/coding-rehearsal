package org.hs.algo.bst;

public class BinarySearchTree {

	public static Node search(Node root, int key) {
		if (root == null || root.key == key)
			return root;
		if (key < root.key)
			return search(root.left, key);
		return search(root.right, key);
	}

	public static Node insert(Node root, int key) {
		Node node = new Node(key);
		if (root == null)
			return node;
		if (key < root.key)
			root.left = insert(root.left, key);
		else if (key > root.key)
			root.right = insert(root.right, key);
		return root;

	}

	public static Node delete(Node root, int key) {
		if (root == null)
			return root;
		if (root.key == key && root.left == null && root.right == null)
			return null;
		if (root.key == key && root.left == null)
			return root.right;
		if (root.key == key && root.right == null)
			return root.left;

		if (key < root.key)
			root.left = delete(root.left, key);
		else if (key > root.key)
			root.right = delete(root.right, key);
		else {
			root.key = inOrderSuccessorValue(root.right);
			delete(root.right, root.key);
		}

		return root;
	}

	public static int inOrderSuccessorValue(Node root) {
		int key = root.key;

		while (root != null) {
			if (key > root.key)
				key = root.key;
			root = root.left;
		}
		return key;
	}

	public static void inOrderTraverse(Node root) {
		if (root != null) {
			inOrderTraverse(root.left);
			System.out.print(root.key + " ");
			inOrderTraverse(root.right);
		}
	}

	public static void preOrderTraverse(Node root) {
		if (root != null) {
			System.out.print(root.key + " ");
			preOrderTraverse(root.left);
			preOrderTraverse(root.right);
		}
	}

	public static void postOrderTraverse(Node root) {
		if (root != null) {
			postOrderTraverse(root.left);
			postOrderTraverse(root.right);
			System.out.print(root.key + " ");
		}
	}

	public static void main(String[] args) {
		Node tree = insert(null, 50);
        insert(tree, 50); 
        insert(tree, 30); 
        insert(tree, 20); 
        insert(tree, 40); 
        insert(tree, 70); 
        insert(tree, 60); 
        insert(tree, 80); 
        
        System.out.println("\n==========================In Order===========================\n");
        inOrderTraverse(tree);
        
        delete(tree, 20);
        System.out.println("\n==========================In Order===========================\n");
        System.out.println("Delete 20");
        inOrderTraverse(tree);
        
        delete(tree, 30);
        System.out.println("\n==========================In Order===========================\n");
        System.out.println("Delete 30");
        inOrderTraverse(tree);
        
        delete(tree, 50);
        System.out.println("\n==========================In Order===========================\n");
        System.out.println("Delete 50");
        inOrderTraverse(tree);

        delete(tree, 1000);
        System.out.println("\n==========================In Order===========================\n");
        System.out.println("Delete 1000");
        inOrderTraverse(tree);
        

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