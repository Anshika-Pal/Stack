class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        top++;
        stack[top] = element;
        System.out.println("Element " + element + " added to stack.");
    }
    public void pop() {
    	if(top!=-1) {
    		int element=stack[top];
    		top--;
    		System.out.println("Element " + element + " removed from stack.");
    		return;
    	}
    	System.out.println("No Element to POP.");
    }
    public void traverse() {
        if(top!=-1) {
        	for(int x=top;x>=0;x--) {
        		System.out.println(stack[x]);
        	}
        	return;
        }
        System.out.println("No Element to Traverse.");
    }
}

public class DSA_StackArray {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5);
		stack.traverse();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60); // This will print "Stack is full. Cannot push element."
		stack.pop();
		stack.traverse();
	}
}
