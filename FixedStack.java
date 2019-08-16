package AssignmentSession5;

public class FixedStack implements Stack {

	private int n;
	private int[] arr;
	
	public FixedStack(int i) {
		this.arr = new int[i];
		this.n = -1;
	}
	
	@Override
	public void push(int i) {
		if (this.n < (arr.length-1)) {
			arr[n+1] = i;
			n++;
		} else {
			System.out.println("Stack overflow.");
		}
	}

	@Override
	public int pop() {
		if (this.hasNext()) {
			n--;
			return arr[n+1];
		}
		System.out.println("Stack is empty.");
		return -1;
	}
	
	public boolean hasNext() {
		if (n > -1) {
			return true;
		} return false;
	}
}

