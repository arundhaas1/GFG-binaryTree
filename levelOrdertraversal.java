package com.dhas;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);

		levelOrder(root);
	}
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	static void levelOrder(Node root) {
		if (root == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);

		while (!queue.isEmpty()) {

			Node curr = queue.poll();

			if (curr == null) {
				if (!queue.isEmpty()) {
					queue.add(null);
					System.out.println();
				}
			} else {
				if (curr.left != null)
					queue.add(curr.left);

				if (curr.right != null)
					queue.add(curr.right);

				System.out.print(curr.data + " ");
			}
		}
	}
}
