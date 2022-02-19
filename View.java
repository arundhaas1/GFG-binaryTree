//LEFT VIEW

package com.dhas;

class Main{
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(10);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(8);
		tree.root.right.right = new Node(15);
		tree.root.right.left = new Node(12);
		tree.root.right.right.left = new Node(14);

		tree.leftView(tree.root, 1);
	}
}
class Node {
	int data;
	Node left, right;

	public Node(int x)
	{
		data = x;
		left = right = null;
	}
}

class BinaryTree {
	Node root;
	static int max_level = 0;
	void leftView(Node node, int level){
		if (node == null)
			return;
		
		if (max_level < level) {
			System.out.print(" " + node.data);
			max_level = level;
		}

		leftView(node.left, level + 1);
		leftView(node.right, level + 1);
	}
}

//RIGHT VIEW


package com.dhas;

class Main{
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(10);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(8);
		tree.root.right.right = new Node(15);
		tree.root.right.left = new Node(12);
		tree.root.right.right.left = new Node(14);

		tree.leftView(tree.root, 1);
	}
}
class Node {
	int data;
	Node left, right;

	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}

class BinaryTree {
	Node root;
	static int max_level = 0;
	void leftView(Node node, int level){
		if (node == null)
			return;
		
		if (max_level < level) {
			System.out.print(" " + node.data);
			max_level = level;
		}

		leftView(node.right, level + 1);
		leftView(node.left, level + 1);
	}
}
