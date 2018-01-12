// Author Peter Adamson

import java.util.ArrayList;

public class CheckBST{

	public void execute(){
		Node nodea1 = new Node();
		nodea1.ID = 1;
		Node nodea2 = new Node();
		nodea2.ID = 2;
		Node nodea3 = new Node();
		nodea3.ID = 3;
		Node nodea4 = new Node();
		nodea4.ID = 4;
		Node nodea5 = new Node();
		nodea5.ID = 5;
		Node nodea6 = new Node();
		nodea6.ID = 6;
		Node nodea7 = new Node();
		nodea7.ID = 7;
		nodea1.Data = 13;
		nodea1.left = nodea2;
		nodea1.right = nodea3;
		nodea2.Data = 10;
		nodea2.parent = nodea1;
		nodea2.right = nodea4;
		nodea3.Data = 19;
		nodea3.parent = nodea1;
		nodea3.left = nodea5;
		nodea4.Data = 12;
		nodea4.parent = nodea2;
		nodea5.Data = 15;
		nodea5.parent = nodea3;
		nodea5.left = nodea6;
		nodea5.right = nodea7;
		nodea6.Data = 14;
		nodea6.parent = nodea5;
		nodea7.Data = 18;
		nodea7.parent = nodea5;

		Node nodeb1 = new Node();
		nodeb1.ID = 1;
		Node nodeb2 = new Node();
		nodeb2.ID = 2;
		Node nodeb3 = new Node();
		nodeb3.ID = 3;
		Node nodeb4 = new Node();
		nodeb4.ID = 4;
		Node nodeb5 = new Node();
		nodeb5.ID = 5;
		Node nodeb6 = new Node();
		nodeb6.ID = 6;
		Node nodeb7 = new Node();
		nodeb7.ID = 7;
		nodeb1.Data = 12;
		nodeb1.left = nodeb2;
		nodeb1.right = nodeb3;
		nodeb2.Data = 10;
		nodeb2.parent = nodeb1;
		nodeb2.right = nodeb4;
		nodeb3.Data = 19;
		nodeb3.parent = nodeb1;
		nodeb3.left = nodeb5;
		nodeb4.Data = 13;
		nodeb4.parent = nodeb2;
		nodeb5.Data = 15;// Author Peter Adamson 3319005

import java.util.ArrayList;

public class CheckBST{

	public void execute(){
		Node nodea1 = new Node();
		nodea1.ID = 1;
		Node nodea2 = new Node();
		nodea2.ID = 2;
		Node nodea3 = new Node();
		nodea3.ID = 3;
		Node nodea4 = new Node();
		nodea4.ID = 4;
		Node nodea5 = new Node();
		nodea5.ID = 5;
		Node nodea6 = new Node();
		nodea6.ID = 6;
		Node nodea7 = new Node();
		nodea7.ID = 7;
		nodea1.Data = 13;
		nodea1.left = nodea2;
		nodea1.right = nodea3;
		nodea2.Data = 10;
		nodea2.parent = nodea1;
		nodea2.right = nodea4;
		nodea3.Data = 19;
		nodea3.parent = nodea1;
		nodea3.left = nodea5;
		nodea4.Data = 12;
		nodea4.parent = nodea2;
		nodea5.Data = 15;
		nodea5.parent = nodea3;
		nodea5.left = nodea6;
		nodea5.right = nodea7;
		nodea6.Data = 14;
		nodea6.parent = nodea5;
		nodea7.Data = 18;
		nodea7.parent = nodea5;

		Node nodeb1 = new Node();
		nodeb1.ID = 1;
		Node nodeb2 = new Node();
		nodeb2.ID = 2;
		Node nodeb3 = new Node();
		nodeb3.ID = 3;
		Node nodeb4 = new Node();
		nodeb4.ID = 4;
		Node nodeb5 = new Node();
		nodeb5.ID = 5;
		Node nodeb6 = new Node();
		nodeb6.ID = 6;
		Node nodeb7 = new Node();
		nodeb7.ID = 7;
		nodeb1.Data = 12;
		nodeb1.left = nodeb2;
		nodeb1.right = nodeb3;
		nodeb2.Data = 10;
		nodeb2.parent = nodeb1;
		nodeb2.right = nodeb4;
		nodeb3.Data = 19;
		nodeb3.parent = nodeb1;
		nodeb3.left = nodeb5;
		nodeb4.Data = 13;
		nodeb4.parent = nodeb2;
		nodeb5.Data = 15;
		nodeb5.parent = nodeb3;
		nodeb5.left = nodeb6;
		nodeb5.right = nodeb7;
		nodeb6.Data = 14;
		nodeb6.parent = nodeb5;
		nodeb7.Data = 18;
		nodeb7.parent = nodeb5;
		if(CheckBST(nodea1)){
			System.out.println("true");
		}
		if(CheckBST(nodeb1)){
			System.out.println("true");
		}
	}

	public static boolean CheckBST(Node root){
		boolean tree = false;
		ArrayList<Integer> A = new ArrayList<Integer>();
		inorder(root, A);
		for(int i = 0; i < A. size() - 1; i++){
			if(A.get(i) <= A.get(i+1)){
				tree = true;
			}
			else{
				return false;
			}
		}
		return tree;
	}

	public static void main(String[] args){
		CheckBST test = new CheckBST();
		test.execute();
	}

	private class Node{
		int ID;
		int Data;
		Node parent;
		Node left;
		Node right;
	}

	public static void inorder(Node root, ArrayList<Integer> A){
		if(root != null){
			inorder(root.left,A);
			A.add(root.Data);
			inorder(root.right,A);
		}
	}
}
		nodeb5.parent = nodeb3;
		nodeb5.left = nodeb6;
		nodeb5.right = nodeb7;
		nodeb6.Data = 14;
		nodeb6.parent = nodeb5;
		nodeb7.Data = 18;
		nodeb7.parent = nodeb5;
		if(CheckBST(nodea1)){
			System.out.println("true");
		}
		if(CheckBST(nodeb1)){
			System.out.println("true");
		}
	}

	public static boolean CheckBST(Node root){
		boolean tree = false;
		ArrayList<Integer> A = new ArrayList<Integer>();
		inorder(root, A);
		for(int i = 0; i < A. size() - 1; i++){
			if(A.get(i) <= A.get(i+1)){
				tree = true;
			}
			else{
				return false;
			}
		}
		return tree;
	}

	public static void main(String[] args){
		CheckBST test = new CheckBST();
		test.execute();
	}

	private class Node{
		int ID;
		int Data;
		Node parent;
		Node left;
		Node right;
	}

	public static void inorder(Node root, ArrayList<Integer> A){
		if(root != null){
			inorder(root.left,A);
			A.add(root.Data);
			inorder(root.right,A);
		}
	}
}
