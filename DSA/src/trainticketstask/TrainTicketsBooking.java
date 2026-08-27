package trainticketstask;

public class TrainTicketsBooking {
	Node listHead;
	Node queueFront;
	Node queueRear;
	int length = 0;
	
	public void bookTicket(Passenger ps) {
		Node nn = new Node(ps);
		if(length < 5) {
			if(listHead == null) {
				listHead = nn;
				length++;
				return;
			}
			Node temp = listHead;
			while(temp.next != null){
				temp = temp.next; 
			}
			temp.next = nn;
			length++;
		}else {
			if(queueRear == null) {
				queueRear = queueFront = nn;
				return ;
			}
			queueRear.next = nn;
			queueRear = queueRear.next;
		}
	}

	public void cancelTicket(int id) {
		Node temp = listHead;
		boolean flag = false;
		if(temp.data.id == id) {
			listHead = temp.next;
			temp.next = null;
			length--;
			flag = true;
		}else {
			while(temp.next != null) {
				if(temp.next.data.id == id) {
					Node t1 = temp.next.next;
					temp.next.next = null;
					temp.next = t1;
					length--;
					flag = true;
					break;
				}
				temp = temp.next;
			}
		}
		if(flag && queueFront != null) {
			Node t = queueFront;
			queueFront = queueFront.next;
			t.next  = null;
			bookTicket(t.data);
		}else {
			System.out.println("INVALID ID");
		}
		
		
	}

}
