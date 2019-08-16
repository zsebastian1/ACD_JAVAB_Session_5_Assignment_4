package AssignmentSession5;

import java.util.Scanner;

public class MainStack {

	public static void main(String[] args) {
		
		FixedStack fs = new FixedStack(5);
		VariableStack vs = new VariableStack();
		
		System.out.println("Below is an example of pushing 5 to both stacks: ");
		for (int i = 0; i < 5; i++) {
			fs.push(i);
			vs.push(i);
		}
		
		System.out.println("\nHere is an example of pushing another to a Fixed Stack. Resulting in a stack overflow: ");
		fs.push (5);
		
		System.out.println("Below is the FixedStack printed: ");
		while (fs.hasNext()) {
			System.out.print(fs.pop() + " ");
		}
		
		System.out.println("\nPushing another to Variable Stack.");
		vs.push (6);
		System.out.println("\nBelow is the Variable Stack printed: ");
		while (vs.hasNext()) {
			System.out.print(vs.pop() + " ");
		}
		
	}

}
