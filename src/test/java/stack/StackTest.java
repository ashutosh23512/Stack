package stack;

import org.junit.Test;

import com.stack.DataStruc;
import com.stack.Stack;

public class StackTest {
	@Test
	public void Stack_push() {
		System.out.println("Stack Push");

		DataStruc<Integer> firstnodeadd = new DataStruc<Integer>(70);
		DataStruc<Integer> secondnodeadd = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeadd = new DataStruc<Integer>(56);
		Stack stack = new Stack();
		stack.push(firstnodeadd);
		stack.push(secondnodeadd);
		stack.push(thirdnodeadd);
		stack.print();

	}

	@Test
	public void Stack_peak_pop() {
		System.out.println("Stack Peak and Pop");

		DataStruc<Integer> firstnodeadd = new DataStruc<Integer>(70);
		DataStruc<Integer> secondnodeadd = new DataStruc<Integer>(30);
		DataStruc<Integer> thirdnodeadd = new DataStruc<Integer>(56);
		Stack stack = new Stack();
		stack.push(firstnodeadd);
		stack.push(secondnodeadd);
		stack.push(thirdnodeadd);
		stack.print();

		System.out.println("Peak is: " + stack.peak());
		stack.print();
		stack.pop();
		stack.print();

	}
}