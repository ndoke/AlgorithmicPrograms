import java.util.Arrays;

class QueueDesign {
	int myQueue[];
	int size;
	int tail;
	// start of the queue
	int start;

	public QueueDesign(int size) {
		this.size = size;
		this.myQueue = new int[size];
		this.tail = -1;
		this.start = -1;
	}

	// get tail
	public int getTail() {
		if (tail > -1)
			return myQueue[tail];
		else
			return -1;
	}

	// enqueue
	public void enQueue(int n) {
		if (tail - start + 1 < size) {
			if (start == -1)
				start++;
			myQueue[++tail] = n;
		} else
			System.out.println("Queue full");
	}

	// dequeue
	public int deQueue() {
		if (tail != start) {
			int ret = myQueue[start];
			myQueue[start++] = 0;
			return ret;
		} else if (tail == start && tail > -1 && start > -1) {
			int ret = myQueue[start];
			myQueue[start] = 0;
			tail = -1;
			start = -1;
			return ret;
		} else
			return -1;
	}

	// isEmpty
	public boolean isEmpty() {
		if (tail == start)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "QueueDesign [myQueue=" + Arrays.toString(myQueue) + ", tail=" + tail + ", start=" + start + "]";
	}

}

public class QueueImpl {

	public static void main(String[] args) {
		QueueDesign myQueue = new QueueDesign(3);
		System.out.println(myQueue.toString());
		myQueue.enQueue(5);
		myQueue.enQueue(4);
		myQueue.enQueue(3);
		System.out.println(myQueue.toString());
		System.out.println(myQueue.isEmpty());
		System.out.println(myQueue.getTail());
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.getTail());
		System.out.println(myQueue.isEmpty());
		System.out.println(myQueue.toString());
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.toString());
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.toString());
		System.out.println(myQueue.deQueue());
		myQueue.enQueue(3);
		System.out.println(myQueue.toString());
		myQueue.enQueue(4);
		System.out.println(myQueue.toString());
		System.out.println(myQueue.deQueue());
		System.out.println(myQueue.toString());
	}

}
