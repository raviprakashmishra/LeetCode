package com.ravi.tree;

public class BinaryTree {
	int data;
	BinaryTree left;
	BinaryTree right;
	
	public BinaryTree(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public static void main(String[] args) {
		BinaryTree bt1 = new BinaryTree(1);
		BinaryTree bt2 = new BinaryTree(2);
		BinaryTree bt3 = new BinaryTree(3);
		BinaryTree bt4 = new BinaryTree(4);
		BinaryTree bt5 = new BinaryTree(5);
		BinaryTree bt6 = new BinaryTree(6);
		BinaryTree bt7 = new BinaryTree(7);
		
		bt1.left  = bt2;
		bt1.right = bt3;
		
		bt2.left  = bt4;
		bt2.right = bt5;
		
		bt3.left  = bt6;
		bt3.right = bt7;
		
		
		inOrder(bt1);
		
		reverseTree(bt1);
		
		System.out.println("reversed");
		
		inOrder(bt1);
		
	}
	
	public static void inOrder(BinaryTree root){
		BinaryTree current = root;
		
		if(current.left != null ){
			inOrder(current.left);
		}
		
		System.out.println(current.data);
		
		if(current.right != null ){
			inOrder(current.right);
		}
	}
	
	
	public static BinaryTree reverseTree(BinaryTree root){
		BinaryTree current = root;
		
		if( current == null){
			return null;
		}
		
		else{
			swap(current);
			
		}
		
		return current;
		
		
	}

	
	public static void swap(BinaryTree current){
		BinaryTree temp = current.left;
		current.left = current.right;
		current.right = temp;
		
		if(current.left != null){
			swap(current.left);
		}
		
		if(current.right != null){
			swap(current.right);
		}
		
	}
}
