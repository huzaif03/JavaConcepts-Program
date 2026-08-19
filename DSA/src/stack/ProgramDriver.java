package stack;

public class ProgramDriver {
	public static void main(String[] args) {
		StackImplimentationMethods sim = new StackImplimentationMethods();
		sim.push(10);
		sim.push(20);
		sim.push(30);
		sim.push(40);
		sim.push(50);
		
		int peekData = sim.peek();
		System.out.println((peekData == Integer.MAX_VALUE) ? "STACK IS EMPTY":"Peek value of Stack is "+peekData);
		
		int popedData = sim.pop();
		System.out.println((popedData == Integer.MAX_VALUE) ? "STACK IS EMPTY":"Poped value of Stack is "+popedData);
		
		popedData = sim.pop();
		System.out.println((popedData == Integer.MAX_VALUE) ? "STACK IS EMPTY":"Poped value of Stack is "+popedData);
 	
		peekData = sim.peek();
		System.out.println((peekData == Integer.MAX_VALUE) ? "STACK IS EMPTY":"Peek value of Stack is "+peekData);
	}
}
