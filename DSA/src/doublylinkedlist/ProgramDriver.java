package doublylinkedlist;

public class ProgramDriver {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addAtEnd(10);
		dll.addAtEnd(20);
		dll.addAtEnd(30);
		dll.addAtEnd(40);
		dll.addAtEnd(50);
		
		dll.addAtIndex(3,35);
		dll.addAtBegin(5);
		
		dll.findAtIndex(0);
		
		System.out.println("List Length = "+dll.length);
		dll.printListForward();
		System.out.println();
//		dll.printListBackword();
		
		
//		dll.deleteAtBegin();
//		dll.deleteAtEnd();
//		dll.deleteAtEnd();
		
//		dll.deleteAtIndex(2);
		
		System.out.println("List Length = "+dll.length);
		dll.printListForward();	
	}
}
