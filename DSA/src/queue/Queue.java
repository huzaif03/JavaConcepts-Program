package queue;

public class Queue {
	Node front;
	Node rear;
	int length = 0;
	public void enqueue(int data) {
		Node nn = new Node(data);
		if(front == null && rear == null) {
			front = nn;
			rear = nn;
			return;
		}
		rear.next = nn;
		rear = rear.next;
		length++;
		
	}
	public void dequeue() {
		if(rear == null && front == null) {
			System.out.println("QUEUE IS  ALREADY EMPTY");
			return;
		}
		if(rear == front) {
			System.out.println(front.data);
			rear = front = null;
			length--;
			return;
		}
		System.out.println(front.data);
		Node temp = front.next;
		front.next=null;
		front= temp;
		length--;
	}
	public int peek() {
		if(rear == null) {
			System.out.println("EMPTY QUEUE");
			return -1;
		}
		return rear.data;
	}

}
