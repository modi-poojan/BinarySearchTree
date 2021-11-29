package com.BinaryTree;

public class Node implements Comparable<Node> {

	int data;
	Node right;
	Node left;
	
	public Node(int data) {
		super();
		this.data = data;
	}

	@Override
	public int compareTo(Node node) {
		
		if(this.data > node.data)
			return 1;
		else if (this.data < node.data)
			return -1;
		else
		return 0;
	}
	//
}
