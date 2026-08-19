package linkedlist;

public class Linkedlist {

	Node head;
	int length;
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println("null");
	}

	public void add(int data) {
		Node nn = new Node(data);
		if (head == null) {
			head = nn;
			length++;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = nn;
		length++;
	}
	
	public void addAtBeggining(int data) {
		Node nn = new Node(data);
		Node temp = head;
		head = nn;
		head.next = temp;
		length++;
	}
	
	public void addAtIndex(int data, int index) {
		if(index<0 || index > length) {
			System.out.println("INVALID INDEX");
			return;
		}
		Node nn = new Node(data);
		Node temp = head;
		for(int i = 1;i<index ;i++) {
			temp = temp.next;
		}
		if(index == 0) {
			addAtBeggining(data);
			return;
		}
		Node tempNext = temp.next;
		temp.next = nn;
		temp.next.next = tempNext;
		length++;
		
	}
	

	public void deleteAtIndex(int index) {
		
		if(index<0 || index >= length) {
			System.out.println("INVALID INDEX");
			return;
		}
		if(index == 0) {
			deleteAtBeggining();
			return;
		}
		Node temp = head;
		for(int i = 1; i<index;i++) {
			temp = temp.next;
		}
		Node tempNext = temp.next.next;
		temp.next.next = null;
		temp.next = tempNext;
		length--;
	}


	public void deleteAtBeggining() {
		Node temp = head;
		temp = temp.next;
		head.next = null;
		head = temp;
		 return;
	}

	
	
}
