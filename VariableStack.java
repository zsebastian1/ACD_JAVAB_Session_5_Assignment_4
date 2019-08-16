package AssignmentSession5;

public class VariableStack implements Stack {

	public VariableStack() {
		
	}
	
private StackNode head;
	
	@Override
	public void push(int i) {
		StackNode nHead = new StackNode(i, head);
		this.head = nHead;
	}

	@Override
	public int pop() {
		if (head != null) {
			int i = head.i;
			this.head = head.next;
			return i;
		} else {
			System.out.println("Stack is empty.");
			return -1;
		}
	}
	
	public boolean hasNext() {
		if (head != null) {
			return true;
		}
		return false;
	}
	

}
class StackNode{
	int i;
	StackNode next;
	
	public StackNode(int i, StackNode next) {
		this.i = i;
		this.next = next;
	}
}