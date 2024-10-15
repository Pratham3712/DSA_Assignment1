package stackDS;

public class stack1 {
	private int[] stack;
	private int[] stack1;
	private int maxSize;
	private int maxSize1;
	private int top;
	private int top1;

	public void createStack(int size, int size1) {
		stack = new int[size];
		maxSize = size;
		top = -1;

		stack1 = new int[size1];
		maxSize1 = size1;
		top1 = -1;
	}

	public void push(int element) {
		if (!isFull()) {
			stack[++top] = element;
			System.out.println("Element " + element + " pushed to stack.");
		} else {
			System.out.println("Stack is full. Cannot push element.");
		}
	}

	public void push1(int element) {
		if (!isFull1()) {
			stack1[++top1] = element;
			System.out.println("Element " + element + " pushed to stack1.");
		} else {
			System.out.println("Stack1 is full. Cannot push element.");
		}
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isFull1() {
		return top1 == maxSize1 - 1;
	}

	public int pop() {
		if (!isEmpty()) {
			return stack[top--];
		} else {
			System.out.println("Stack is empty. Cannot pop element.");
			return -1;
		}
	}

	public int pop1() {
		if (!isEmpty1()) {
			return stack1[top1--];
		} else {
			System.out.println("Stack1 is empty. Cannot pop element.");
			return -1;
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isEmpty1() {
		return top1 == -1;
	}

	public int peek() {
		if (!isEmpty()) {
			return stack[top];
		} else {
			System.out.println("Stack is empty. Cannot peek element.");
			return -1;
		}
	}

	public int peek1() {
		if (!isEmpty1()) {
			return stack1[top1];
		} else {
			System.out.println("Stack1 is empty. Cannot peek element.");
			return -1;
		}
	}

	public void printStack() {
		System.out.println("Stack has:");
		for (int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}

	public void printStack1() {
		System.out.println("Stack1 has:");
		for (int i = top1; i >= 0; i--) {
			System.out.println(stack1[i]);
		}
	}
}