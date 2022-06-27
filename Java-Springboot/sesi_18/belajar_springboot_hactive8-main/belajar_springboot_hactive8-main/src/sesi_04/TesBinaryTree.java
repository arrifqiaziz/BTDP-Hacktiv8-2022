//package sesi_04;
//
//import java.util.Scanner;
//
//import sesi_04.BinaryTree.Node;
//
//public class TesBinaryTree {
//
//	private Node root;
//
//	// overload insert method
//	public void insert(int i) {
//		root = insert(root, i);
//	}
//
//	public Node insert(Node node, int value) {
//		if (node == null) {
//			return new Node(value);
//		}
//		if (value < node.value) {
//			node.left = insert(node.left, value);
//		} else if (value > node.value) {
//			node.right = insert(node.right, value);
//		}
//		return node;
//	}
//
//	public static void main(String[] args) {
//		BinaryTree bst = new BinaryTree();
//		ViewOrder view = new ViewOrder();
//
//		int inputNode;
//		int menu = 1;
//
//		while (menu != 3) {
//			System.out.println("1. Input");
//			System.out.println("2. View");
//			System.out.println("3. Exit");
//			System.out.print("Input : ");
//
//			Scanner scan = new Scanner(System.in);
//			menu = scan.nextInt();
//
//			switch (menu) {
//			case 1:
//				System.out.print("Masukan Angka : ");
//				inputNode = scan.nextInt();
//				bst.insert(inputNode);
//			case 2:
//				view.getAllOrder(bst.root);
//			case 3:
//				break;
//			}
//			System.out.println("\n");
//		}
//	}
//}