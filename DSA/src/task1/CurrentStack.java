package task1;

public class CurrentStack {
	Node currentStack;
	int length =0;
	HistoryStack hs = new HistoryStack();
	public void visit(String data) {
		Node nn = new Node(data);
		if(currentStack == null) {
			currentStack = nn;
			return;
		}
		nn.next = currentStack;
		currentStack = nn;
	}
	public String relode() {
		if(currentStack == null) {
			return null;
		}
		return currentStack.url;
	}
	public void backword() {
		if(currentStack == null) {
			return;
		}
		Node temp = currentStack;
		currentStack =currentStack.next;
		temp.next = null;
		hs.push(temp);
	}
	public void forword() {
		if(hs.historyStack == null) {
			return;
		}
		visit(hs.pop());
	}
	
	
	
}
