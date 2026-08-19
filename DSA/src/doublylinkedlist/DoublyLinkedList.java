package doublylinkedlist;

public class DoublyLinkedList {
	Node head;
	Node tail;
	int length;
	
//	Add element at end of the list (wrt head)
	public void addAtEnd(int data) {
		Node nn = new Node(data);
		if(head == null && tail == null) {
			head =tail =nn;
			length++;
			return;
		}
		nn.prev = tail;
		tail.next = nn;
		tail = nn;
		length++;
	}
//	Add Element in beginning (wrt head)
	public void addAtBegin(int data) {
		Node nn = new Node(data);
		nn.next = head;
		head.prev = nn;
		head = nn;
		length++;
	}

// Add Element at any index (wrt head)
	public void addAtIndex(int index, int data) {
		Node nn = new Node(data);
		if(index < 0 || index > length) {
			System.out.println("INVALID INDEX");
			return;
		}
		if(index == length ) {
			addAtEnd(data);
			return;
		}
		if(index == 0) {
			addAtBegin(data);
			return;
		}
		Node temp = head;
		for(int i = 1;i < index;i++) {
			temp = temp.next;
		}
		nn.next = temp.next;
		nn.prev = temp.next.prev;
		temp.next.prev= nn;
		temp.next=nn;
		length++;
	}
	
	public void deleteAtBegin() {
		if(head == null) {
			System.out.println("LIST IS EMPTY");
			return;
		}
		if(head == tail) {
			head = tail = null;
			length--;
			return;
		}
		head = head.next;
		head.prev.next = null;
		head.prev = null;
		length--; 
	}
	public void deleteAtEnd() {
		if(tail == null) {
			System.out.println("LIST IS EMPTY");
			return;
		}
		if(tail == head) {
			tail = head = null;
			length--;
			return;
		}
		tail = tail.prev;
		tail.next.prev = null;
		tail.next = null;
		length--;
		
	}
	public void deleteAtIndex(int index) {
		if(index < 0 || index >= length) {
			System.out.println("INVALID INDEX");
			return;
		}
		if( index == 0) {
			deleteAtBegin();
			return;
		}
		if(index == length - 1) {
			deleteAtEnd();
			return;
		}
		Node temp = head;
		for(int i = 0; i<index; i++) {
			temp = temp.next;
		}
		temp.prev.next = temp.next;
		temp.next.prev = temp.prev;
		temp.next = temp.prev = null;
		length--;
	}
	public void printListForward() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+ " -> ");
			temp = temp.next;
		}
		System.out.println("null");	
	}
	public void printListBackword() {
		Node temp = tail;
		System.out.println("List End to Start");
		while(temp != null) {
			System.out.print(temp.data+ " -> ");
			temp = temp.prev;
		}
		System.out.println("null");	
	}
//	Find element with index
	public void findAtIndex(int index) {
		if(index < 0 || index >= length ) {
			System.out.println("INVALID INDEX");
			return;
		}
		Node temp= head;
		for(int i = 0;i<index ;i++) {
			temp = temp.next;
		}
		System.out.println("Element of "+index+ " index is "+temp.data);
	}



	
}
