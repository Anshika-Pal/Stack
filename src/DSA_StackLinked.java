class LinkedStack {

	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private Node top;
	private int size;

	public LinkedStack() {
		top = null;
		size = 0;
	}

	public void push(int element) {
		Node newNode = new Node(element);
		newNode.next = top;
		top = newNode;
		size++;
		System.out.println("Element " + element + " added to stack.");
	}

	public void pop() {
		if (top != null) {
			int element = top.data;
			top = top.next;
			size--;
			System.out.println("Element " + element + " removed from stack.");
			return;
		}
		System.out.println("No Element to POP.");
	}

	public void traverse() {
		if (top != null) {
			Node currentNode = top;
			while(currentNode != null) {
				System.out.println(currentNode.data);
				currentNode = currentNode.next;
			} 
			return;
		}
		System.out.println("No Element to Traverse.");
	}

	public int getStackSize() {
		return size;
	}
}

public class DSA_StackLinked {
	public static void main(String[] args) {
		LinkedStack stack = new LinkedStack();
		System.out.println("Stack Size: " + stack.getStackSize());
		stack.traverse();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.pop();
		stack.traverse();
		System.out.println("Stack Size: " + stack.getStackSize());
	}
}
