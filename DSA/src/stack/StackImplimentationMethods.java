package stack;

public class StackImplimentationMethods {

	Node stack;
	int length = 0;
//	Push (Add in stack)
	public void push(int data) {
		Node nn = new Node(data);
		if(stack == null) {
			stack = nn;
			length++;
			return;
		}
		nn.next = stack;
		stack = nn;
		length++;
	}
//  Peek() (Returns top most value)
	public int peek() {
		if(stack == null) {
			return Integer.MAX_VALUE;
		}
		return stack.data;
	}
//	Pop() (Delete last or top element)
	public int pop() {
		if(stack == null) {
			return Integer.MAX_VALUE;
		}
		int popedData = stack.data;
		stack = stack.next;
		length--;
		return popedData;
	}
	
}
