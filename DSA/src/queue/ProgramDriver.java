package queue;

public class ProgramDriver {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
		int peekData = q.peek();
		System.out.println((peekData==-1)? "" :"Peek Data of Queue is "+peekData);
		q.dequeue();
		q.dequeue();
		
		
	}
}
