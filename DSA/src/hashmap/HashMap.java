package hashmap;

public class HashMap<K, V> {
	Node buckets[];
	public HashMap(int size) {
		this.buckets = new Node[size];
	}
	public void put(int key, String value) {
		Node<Integer,String> nn = new Node<Integer,String>(key,value);
		int index = getIndex(key);
		Node head = buckets[index];
		if(head == null) {
			buckets[index] = nn;
			return;
		}
		while(head!= null) {
			if(head.key == (Integer)key) {
				head.value = value;
			}
			if(head.next == null) break;
			head = head.next;
		}
		head.next = nn;
	}
	private int getIndex(int key) {
		return key%buckets.length;
	}
	public String get(int key) {
		int index = getIndex(key);
		Node head = buckets[index];
		while(head != null) {
			if(head.key == (Integer)key) {
				return (String) head.value;
			}
			head = head.next;
		}
		return null;
	}
	public void remove(int key) {
		int index = getIndex(key);
		Node head = buckets[index];
		Node temp = head;
		if(head == null) {
			System.out.println("No such Elements");
			return;
		}
		if(temp.key == (Integer) key) {
			buckets[index] = temp.next;
			temp.next = null;
			return;
		}
		temp = head;
		while(temp.next != null) {
			if(temp.next.key == (Integer)key) {
				Node t = temp.next.next;
				if(temp.next.next != null) {
					temp.next.next = null;
				}
				temp.next = t;
				return;
			}
			temp = temp.next;
		}
		
	}
	public boolean containsValue(String value) {
		for(Node n : buckets) {
			while(n != null) {
				if(n.value == value) {
					return true;
				}
				n = n.next;
			}
		}
		return false;
	}
	public boolean containsKey(int key) {
		int index = getIndex(key);
		Node head = buckets[index];
			while(head != null) {
				if(head.key == (Integer)key) {
					return true;
				}
				head = head.next;
			}
		return false;
	}
	
	

	
	
}
