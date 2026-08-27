package task1;

public class HistoryStack {
	Node historyStack;
	public void push(Node temp) {
		if(historyStack == null) {
			historyStack = temp;
			return;
		}
		temp.next=historyStack;
		historyStack = temp;
		return;
	}
	public String pop() {
		Node temp = historyStack;
		historyStack = historyStack.next;
		temp.next = null;
		return temp.url;
	}
	

}
