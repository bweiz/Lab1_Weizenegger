
public class stack<E> {
	
	private Node<E> top;
	private int size;
	private Node<E> cur;
	
	private static class Node<E> {
		private E item;
		private Node<E> next;
		
		public Node(E item) {
			this.item = item;
			this.next = null;
		}
	}
	
	public stack() {
		top = null;
		size = 0;
	}
	
	
	public void push(E item) {
		if (top == null) {
			top = new Node<E>(item);
			size++;
		} else {
			Node<E> oldTop = top;
			top = new Node<E>(item);
			top.next = oldTop;
			size++;
		}
	}
	
	public E pop() {

		while (!isEmpty()) {
			E popped = top.item;
			if (size == 1) {
				top = null;
				size--;
			} else {
				top = top.next;
				size--;
			} 
			return popped;
			} return null;
	}
	
	public void printStack() {
		this.goToHead();
		for (int i=1; i<=size; i++) {
			System.out.print(cur.item + " ");
			cur = cur.next;
		} cur = top;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	private void goToHead() {
		cur = top;
	}
}
