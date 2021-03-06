package com.dhas;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main{
	public static void main(String[] args) {
		Node root = new Node(1);

		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);
		root.right.right.right = new Node(9);
		System.out.println("Vertical Order traversal is");
		printVerticalOrder(root);
	}
	// Tree node
	static class Node{
		int data;
		Node left;
		Node right;

		Node(int x){
			data = x;
			left = null;
			right = null;
		}
	}

	static void getVerticalOrder(Node root, int hd, TreeMap<Integer,ArrayList<Integer>> map){
		if(root == null)
			return;

		ArrayList<Integer> datas =  map.get(hd);
		if(datas == null){
			datas = new ArrayList<>();
			datas.add(root.data);
		}
		else
			datas.add(root.data);

		map.put(hd, datas);  //it makes as {hd=datas,..} and store it..hd is key and datas are value of array list
		getVerticalOrder(root.left, hd-1, map);
		getVerticalOrder(root.right, hd+1, map);
	}

	static void printVerticalOrder(Node root){
		TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
		int hd =0;
		getVerticalOrder(root,hd,map);

		for (Entry<Integer, ArrayList<Integer>> entry : map.entrySet()){
			System.out.println(entry.getValue());
		}
	}
}
