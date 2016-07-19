import java.util.Stack;

class queueImpl {
	int lastInd = 0;
	int queueArr[] = new int[lastInd + 1];

	void enQueue(int n) {
		int newQueue[] = new int[lastInd + 1];
		lastInd++;
		newQueue[newQueue.length - 1] = n;
		for (int i = 0; i < newQueue.length - 1; i++) {
			newQueue[i] = queueArr[i];
		}
		queueArr = newQueue;
	}

	void deQueue() {
		if (queueArr.length > 0) {
			int newQueue[] = new int[lastInd - 1];
			lastInd--;
			for (int i = 1; i < queueArr.length; i++) {
				newQueue[i - 1] = queueArr[i];
			}
			queueArr = newQueue;
		} else {
			System.out.print("Queue is empty!");
		}
	}

	void printQueue() {
		if (queueArr.length > 0) {
			for (int i = 0; i < queueArr.length; i++) {
				System.out.print(queueArr[i] + "\t");
			}
		} else {
			System.out.println("No elements in the queue!");
		}
	}
}

class stackImpl {
	int pointer;
	int stackArr[] = new int[0];
	Stack<Integer> minStack = new Stack<Integer>();

	void findMin(int n) {
		if (minStack.isEmpty())
			minStack.add(n);
		else {
			if (minStack.peek() >= n) {
				minStack.add(n);
			}
		}
	}

	void push(int n) {
		findMin(n);
		int newStack[] = new int[stackArr.length + 1];
		for (int i = 0; i < stackArr.length; i++) {
			newStack[i] = stackArr[i];
		}
		newStack[newStack.length - 1] = n;
		stackArr = newStack;
	}

	void pop() {
		if (stackArr.length > 0) {
			int newStack[] = new int[stackArr.length - 1];

			for (int i = 0; i < newStack.length; i++) {
				newStack[i] = stackArr[i];
			}
			if (minStack.peek() == stackArr[stackArr.length - 1]) {
				minStack.pop();
			}
			stackArr = newStack;
		} else {
			System.out.println("Stack empty!");
		}
	}

	void printStack() {
		if (pointer < 0)
			System.out.println("No elements in the stack!");
		else {
			for (int i = 0; i < stackArr.length; i++) {
				System.out.print(stackArr[i] + "\t");
			}
		}
	}
}

public class StackQueue {
	public static int stackLen;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Queue");
		queueImpl Q = new queueImpl();
		Q.enQueue(10);
		Q.enQueue(20);
		Q.enQueue(30);
		Q.deQueue();
		Q.deQueue();
		Q.enQueue(40);
		Q.enQueue(50);
		// printing the stack
		// Q.printQueue();

		System.out.println("Stack 1");
		stackImpl S = new stackImpl();
		S.push(10);
		S.push(20);
		S.push(30);
		S.pop();
		S.pop();
		S.push(40);
		S.push(50);
		S.push(5);
		S.pop();
		// printing the stack
		S.printStack();
		System.out.println("\nMinimum is " + S.minStack.peek());

		System.out.println("\nStack 2");
		stackImpl S2 = new stackImpl();
		S2.push(100);
		S2.push(200);
		S2.push(300);
		S2.pop();
		S2.pop();
		S2.push(400);
		S2.push(500);
		S2.push(50);
		S2.pop();
		S2.push(50);
		S2.push(50);
		S2.push(50);
		S2.pop();
		S2.pop();
		S2.pop();
		// printing the stack
		S2.printStack();
		System.out.println("\nMinimum is " + S2.minStack.peek());
	}
}
