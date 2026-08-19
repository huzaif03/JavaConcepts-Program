package doubleendedqueue;

public class ProgramDriver {
	public static void main(String[] args) {
		DoubleEndedQueue deq = new DoubleEndedQueue();
		deq.rearEnqueue(50);
		deq.rearEnqueue(60);
		deq.rearEnqueue(70);
		deq.rearEnqueue(80);
		deq.rearEnqueue(90);
		
		deq.frontEnqueue(30);
		deq.frontEnqueue(20);
		deq.frontEnqueue(10);
		
		int rearDequeueData = deq.rearDequeue();	
		System.out.println("Rear Dequeue Data is "+rearDequeueData);
		
		int frontDequeueData = deq.frontDequeue();
		System.out.println("Front Dequeue Data is "+frontDequeueData);
		
		System.out.println("Rear peek value is "+deq.rearPeek());
		
		System.out.println("Front peek value is "+deq.frontPeek());
		
	}
}
