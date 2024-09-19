

public class LinkedList<E> {
	
	private Node<E> head;
	private Node<E> cur;
	
	private static class Node<E> {
		private E item;
		private Node<E> next;
		
		public Node(E item) {
			this.item = item;
			this.next = null;
		}
	}
	
	public LinkedList() {
		head = null;
		cur = head;
	}
	
	public E getCurData() {
		if (cur != null) {
			return cur.item;
		} else {
			return null;
		}
	}
	
	public boolean nextData() {
		if (cur != null) {
			cur = cur.next;
		} 
		return (cur != null); // no next data, at end of list
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void insert(E e) {
		Node<E> oldhead = head;
		head = new Node<E>(e);
		head.next = oldhead;
		cur = head;
	}
	public void printListDataType(LinkedList<E> list) {
		list.GoToHead();
		if (list.cur.item.getClass() == Double.class) {
			System.out.println("The data type of the data in this linked list is Double");
		} else if (list.cur.item.getClass() == String.class) {
			System.out.println("The data type of the data in this linked list is String");

		}
	}
	public void delete() {
		head = head.next;
		cur = head;
	}
	
	public boolean atEndOfList() {
		if (cur == null) {
			return true;
		} else {
			return false;
		}
	} 
	
	public void GoToHead() {
		cur = head;
	}


	

	
}