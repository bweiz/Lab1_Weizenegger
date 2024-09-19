import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Driver3 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner nums = new Scanner(new File("equation.txt"));
		stack<Integer> operands = new stack<Integer>();

		
		while (nums.hasNext()) {
			String word = nums.next();
			Integer value = 0;
			if (word.equals("+")) {
				Integer v1 = operands.pop();
				Integer v2 = operands.pop();
				value = v1 + v2;
				operands.push(value);
			} else if (word.equals("*")) {
				Integer v1 = operands.pop();
				Integer v2 = operands.pop();
				value = v1 * v2;
				operands.push(value);
			} else {
				operands.push(Integer.parseInt(word));
			}
		}
		System.out.print("The result of the postfix equation is " + operands.pop());
	}
} 