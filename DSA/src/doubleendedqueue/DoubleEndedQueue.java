package doubleendedqueue;

public class DoubleEndedQueue {
	Node front;
	Node rear;
	int length = 0;
	public void rearEnqueue(int data) {
		Node nn = new Node(data);
		if(rear ==null && front == null) {
			rear = front = nn;
			length++;
			return;
		}
		nn.prev = rear;
		rear.next = nn;
		rear = rear.next;
		length++;
	}
	public void frontEnqueue(int data) {
		Node nn = new Node(data);
		
		if(rear == null && front == null) {
			rear = front = nn;
			length++;
			return;
		}
		nn.next = front;
		front.prev = nn;
		front = front.prev;
		length++;	
	}
	public int rearDequeue() {
		if(rear  == null) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int rearDequeueData = rear.data;
		rear = rear.prev;
		rear.next.prev = rear.next = null;
		length--;
		return rearDequeueData;
	}
	public int frontDequeue() {
		if(front == null) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int frontDequeueData = front.data;
		front = front.next;
		front.prev.next = front.prev = null;
		length--;
		return frontDequeueData;
	}
	public int rearPeek() {
		if(rear == null) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return rear.data;
	}
	public int frontPeek() {
		if(front == null) {
			System.out.println("Queue is Empty");
			return -1;
		}
		return front.data;
	}

}
