import java.util.Arrays;

class StackDesign {
	int myStack[];
	int top;
	int size;

	public StackDesign(int size) {
		this.size = size;
		myStack = new int[size];
		this.top = -1;
	}

	// isEmpty
	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	// peek
	public int peek() {
		if (top > -1)
			return myStack[top];
		else
			return -1;
	}

	// push
	public void push(int n) {
		if (top + 1 < size) {
			myStack[++top] = n;
		} else
			System.out.println("Stack full");
	}

	// pop
	public int pop() {
		if (top > -1) {
			int ret = myStack[top];
			myStack[top--] = 0;
			return ret;
		} else
			return -1;
	}

	@Override
	public String toString() {
		return "StackDesign [myStack=" + Arrays.toString(myStack) + ", top=" + top + "]";
	}

}

public class StackImpl {

	public static void main(String[] args) {
		StackDesign myStack = new StackDesign(10);
		System.out.println(myStack.toString());
		myStack.push(5);
		myStack.push(4);
		myStack.push(3);
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.toString());
		System.out.println(myStack.pop());
		System.out.println(myStack.toString());
		System.out.println(myStack.pop());
		System.out.println(myStack.toString());
		System.out.println(myStack.pop());
	}

}
