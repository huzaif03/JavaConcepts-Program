package hashmap;

public class HashMap<K, V> {
	Node buckets[];
	public HashMap(int size) {
		this.buckets = new Node[size];
	}
	public void put(K key, V value) {
		Node<K, V> nn = new Node<K,V>(key,value);
		int index = getIndex((Integer)key);
		Node head = buckets[index];
		if(head == null) {
			buckets[index] = nn;
			return;
		}
		while(head!= null) {
			if(head.key == key) {
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
	public V get(K key) {
		int index = getIndex((int)key);
		Node head = buckets[index];
		while(head != null) {
			if(head.key == key) {
				return (V)head.value;
			}
			head = head.next;
		}
		return null;
	}
	public void remove(K key) {
		int index = getIndex((int)key);
		Node head = buckets[index];
		Node temp = head;
		if(head == null) {
			System.out.println("No such Elements");
			return;
		}
		if(temp.key == key) {
			buckets[index] = temp.next;
			temp.next = null;
			return;
		}
		temp = head;
		while(temp.next != null) {
			if(temp.next.key == key) {
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
	public boolean containsValue(V value) {
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
	public boolean containsKey(K key) {
		int index = getIndex((int)key);
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
