import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Driver2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inHam = new Scanner(new File("hamlet.txt"));
		stack<String> stackHam = new stack<String>();
		
		while (inHam.hasNext()) {
			String word = inHam.next();
			if (!word.equals("$")) {
				stackHam.push(word);
			} else {
				System.out.print(stackHam.pop() + " ");
			}
		}
		System.out.println();
		System.out.print("Left on stack: ");
		stackHam.printStack();
	}
	
	
}
