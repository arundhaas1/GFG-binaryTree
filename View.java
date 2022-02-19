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

//BOTTOM VIEW 

package com.dhas;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Main{
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(22);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(3);
		tree.root.right.left = new Node(4);
		tree.root.right.right = new Node(25);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);

		tree.bottomView();
	}
}
class Node{
	int data;
	int hd;
	Node left, right;

	public Node(int x){
		data = x;
		hd=Integer.MAX_VALUE;
		left = right = null;
	}
}
class BinaryTree{
	Node root;
	public void bottomView(){
		if (root == null)
			return;
		int hd = 0;

		TreeMap<Integer, Integer> treeMap = new TreeMap<>();

		Queue<Node> queue = new LinkedList<>();
		root.hd = hd;
		queue.add(root);

		while (!queue.isEmpty()){
			Node temp = queue.remove();
			hd = temp.hd;

			treeMap.put(hd, temp.data);

			if (temp.left != null){
				temp.left.hd = hd-1;
				queue.add(temp.left);
			}
			if (temp.right != null){
				temp.right.hd = hd+1;
				queue.add(temp.right);
			}
		}
		//Printing map
		for(Map.Entry<Integer,Integer> entry:treeMap.entrySet()){
			System.out.println(entry.getValue());
		}
	}
}

//TOP VIEW

package com.dhas;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Main{
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(22);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new Node(3);
		tree.root.right.left = new Node(4);
		tree.root.right.right = new Node(25);
		tree.root.right.right.left = new Node(10);
		tree.root.right.right.right = new Node(14);

		tree.topView(tree.root);
	}
}
class Node{
	int data;
	Node left, right;

	public Node(int x){
		data = x;
		left = right = null;
	}
}

class BinaryTree {
	Node root;

	public void topView(Node root) {
		if (root == null) return;
		leftSide(root);
		if (root.right != null) {
			rightSide(root.right);
		}
	}

	public void leftSide(Node leftRoot) {
		if (leftRoot.left != null) {
			leftSide(leftRoot.left);
		}
		System.out.print(leftRoot.data + " ");
	}

	public void rightSide(Node rightRoot) {
		System.out.print(rightRoot.data + " ");
		if (rightRoot.right != null) {
			rightSide(rightRoot.right);
		}
	}
}

