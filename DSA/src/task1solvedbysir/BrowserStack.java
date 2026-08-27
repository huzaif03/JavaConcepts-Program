package task1solvedbysir;

public class BrowserStack {
	Node currentStackHead;
	Node historyStackHead;
	public void visit(String data) {
		Node  nn = new Node(data);
		if(currentStackHead == null) {
			currentStackHead = nn;
			return;
		}
		nn.next = currentStackHead;
		currentStackHead = nn;
	}
	public String relode() {
		if(currentStackHead == null) {
			return null;
		}
		return currentStackHead.data;
	}
	public void backword() {
		if(currentStackHead == null) {
			return;
		}
		Node temp = currentStackHead;
		currentStackHead = temp.next;
		temp.next = null;
		if(historyStackHead == null) {
			historyStackHead = temp;
			return;
		}
		temp.next = historyStackHead;
		historyStackHead = temp;
	}
	public void forword() {
		if(historyStackHead == null) {
			return;
		}
		Node temp = historyStackHead;
		historyStackHead = temp.next;
		temp.next = null;
		visit(temp.data);
	}
	
	
	
	
}
