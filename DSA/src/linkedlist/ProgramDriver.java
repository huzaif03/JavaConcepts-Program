package linkedlist;

public class ProgramDriver {
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		ll.addAtBeggining(5);
		
		ll.printList();
		System.out.println("Length : "+ll.length);
		ll.addAtIndex(40,0);
		
//		ll.deleteAtBeggining();
		
//		ll.deleteAtIndex(3);
		
		ll.printList();
		System.out.println("Length : "+ll.length);
	}
}
