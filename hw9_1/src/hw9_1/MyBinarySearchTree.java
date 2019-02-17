package hw9_1;
/*
 * 파일명: MyBinarySearchTree.java
 * 작성일: 2018.11.13
 * 작성자: 정형일
 * 설명: int형 키값 저장하는 이진탐색트리를 연결자료구조로 구현한 클래스
 */

import java.util.NoSuchElementException;

public class MyBinarySearchTree {
	// (1) 트리의 노드를 표현하는 private 클래스 Node - 필드(int형 key, leftChild, rightChild),
	private class Node {
		int key;
		Node leftChild = null;
		Node rightChild = null;

		// 생성자(key값을 매개변수로 받아 초기화)
		Node(int key) {
			this.key = key;
		}
	}

	// (2) private 인스턴스 변수 트리의 루트 노드를 가킬 변수(root)를 선언하고 null로 초기화
	private Node root = null;

	// 트리에 키값 key를 삽입하는 메소드
	public void insert(int key) {
		root = insertKey(root, key);
	}

	// p를 루트로 하는 트리에 키값 key를 삽입하고, 삽입 후 루트를 리턴하는 메소드(재귀 알고리즘)
	private Node insertKey(Node p, int key) {
		if (p == null) {
			Node newNode = new Node(key);
			return newNode;
		} else if (key < p.key) {
			p.leftChild = insertKey(p.leftChild, key);
			return p; // 루트 불변
		} else if (key > p.key) {
			p.rightChild = insertKey(p.rightChild, key);
			return p; // 루트 불변
		} else { // key = p.key 인 경우 삽입 실패
			System.out.println("삽입 실패. 중복된 키값이 존재합니다: " + key);
			return p; // 루트 불변
		}
	}

	// 트리를 중위순회하며 출력하는 메소드
	public void printInorder() {
		inorder(root);
		System.out.println();
	}

	// (3) p를 루트로 하는 트리를 중위 순회하며 키값을 출력하는 메소드(재귀 알고리즘)
	private void inorder(Node p) {
		if (p != null) {
			inorder(p.leftChild);
			System.out.print(p.key + " ");
			inorder(p.rightChild);
		}
	}

	// (4) 트리의 최대 키값을 리턴하는 메소드(반복 알고리즘) - 공백 트리인 경우 NoSuchElementException 예외 발생
	public int max() {
		if (root == null) {
			throw new NoSuchElementException();
		}

		else {
			Node temp = root;
			while (temp.rightChild != null) {
				temp = temp.rightChild;
			}
			return temp.key;
		}
	}

	// 트리가 키값 key를 포함하는지 여부를 리턴하는 메소드
	public boolean contains(int key) {
		
		 return search(root, key);
		 
}

// (5) p를 루트로 하는 트리에 키값 key가 존재하는지 여부를 리턴하는 메소드(재귀 알고리즘)
	 private boolean search(Node p, int key) {
	      if(p == null)
	         return false;
	      if(p.key == key) 
	         return true;
	      else if(key < p.key)
	         return search(p.leftChild, key);
	      else
	         return search(p.rightChild, key);
	   }


	// (6) 트리에 키값 key를 삽입하는 메소드(반복 알고리즘) - 삽입 성공여부(true/false)를 리턴
	   public boolean add(int key) {
		      Node node = new Node(key);
		      Node p = root;

		      while (true) {
		         if (root == null) {
		            root = node;
		            return true;
		         }

		         else if (key < p.key) {
		            if (p.leftChild == null) {
		               p.leftChild = node;
		               return true;
		            } else
		               p = p.leftChild;
		         }

		         else if (key > p.key) {
		            if (p.rightChild == null) {
		               p.rightChild = node;
		               return true;
		            } else
		               p = p.rightChild;
		         }

		         else
		            return false;
		      }
		   }

		   public boolean remove(int key) {
		      Node temp = root;
		      Node parent = null;
		      
		      if(root == null)
		         return false;

		      while(temp.key != key) {
		         if(temp.key > key) {
		            if(temp.leftChild != null) {
		               parent = temp;
		               temp = temp.leftChild;
		            }
		            else {
		               parent = temp;
		               temp = null;
		            }
		         }

		         else {
		            if(temp.rightChild != null) {
		               parent = temp;
		               temp = temp.rightChild;
		            }
		            else {
		               parent = temp;
		               temp = null;
		            }
		         }

		         if(temp == null) {
		            return false;
		         }
		      }
		      

		      if(temp.leftChild == null && temp.rightChild == null) {
		         if(parent == null) 
		            root = null;
		         else if(parent.leftChild == temp)
		            parent.leftChild = null;
		         else
		            parent.rightChild = null;
		      }

		      else if(temp.leftChild == null || temp.rightChild == null) {
		         if(temp.leftChild != null) {
		            if(parent == null)
		               root = temp.leftChild;
		            else if(parent.leftChild == temp) 
		               parent.leftChild = temp.leftChild;
		            else
		               parent.rightChild = temp.leftChild;
		         }

		         else {
		            if(parent == null)
		               root = temp.rightChild;
		            else if(parent.leftChild == temp)
		               parent.leftChild = temp.rightChild;
		            else
		               parent.rightChild = temp.rightChild;
		         }
		      }

		      else {
		         Node q = temp.leftChild;
		         while(q.rightChild != null) {
		            q = q.rightChild;
		         }

		         temp.key = q.key;
		         remove(q.key);
		      }
		      return true;
		   }
}
