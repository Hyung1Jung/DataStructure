package lab9_1;

public class MyLinkedTree {
	// 트리 노드 클래스 -- data, leftChild, rightChild 필드를 지님
	private class Node {
		int data;
		Node leftChild;
		Node rightChild;
	}

	// 트리의 루트 노드를 가리키는 인스턴스 변수 root
	private Node root;

	// 공백 트리로 초기화 하는 생성자
	public MyLinkedTree() {
		root = null;
	}

	// 루트 노드의 데이터가 data이고, leftSubtree, rightSubtree를 좌우 서브트리로 하도록 트리를 초기화 하는 생성자
	public MyLinkedTree(int data, MyLinkedTree leftSubtree, MyLinkedTree rightSubtree) {
		root = new Node();
		root.data = data;

		if (leftSubtree == null)
			root.leftChild = null;
		else
			root.leftChild = leftSubtree.root;

		if (rightSubtree == null)
			root.rightChild = null;
		else
			root.rightChild = rightSubtree.root;
	}

	// 트리 전체를 전위 순회하며 노드의 데이터를 출력
	public void printPreorder() {
		preorder(root);
		System.out.println();
	}

	// p를 루트로 하는 트리를 전위 순회하는 메소드
	private void preorder(Node p) {
		if (p != null) {
			System.out.print(p.data + " ");
			preorder(p.leftChild);
			preorder(p.rightChild);
		}
	}

	// 트리 전체를 중위 순회하며 노드의 데이터를 출력
	public void printInorder() {
		inorder(root);
		System.out.println();
	}

	// p를 루트로 하는 트리를 중위 순회하는 메소드
	private void inorder(Node p) {
		if (p != null) {
			inorder(p.leftChild);
			System.out.print(p.data + " ");
			inorder(p.rightChild);
		}
	}

	// 루트노드부터 리프노드에 이르기까지 왼쪽 자식들을 출력하는 메소드
	public void printLeft() {
		Node temp = root;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.leftChild;
		}
		System.out.println();
		System.out.println();
	}
}