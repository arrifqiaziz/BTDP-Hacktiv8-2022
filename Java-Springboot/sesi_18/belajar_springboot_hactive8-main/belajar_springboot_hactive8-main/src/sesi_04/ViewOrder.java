package sesi_04;

import sesi_04.BinaryTree.Node;

public class ViewOrder {
	
	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.value + " ");
			inOrder(node.right);
		}
	}

	public void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.value + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	public void postOrder(Node node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.value + " ");
		}
	}

	public void getAllOrder(Node root) {
		System.out.println();
		System.out.print("Inorder : ");
		inOrder(root);
		System.out.println();

		System.out.print("Preorder : ");
		preOrder(root);
		System.out.println();

		System.out.print("Postorder : ");
		postOrder(root);
		System.out.println();
	}
}
