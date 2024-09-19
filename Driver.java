import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Driver {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inDouble = new Scanner(new File("nums.txt"));
		Scanner inString = new Scanner(new File("strings.txt"));

		
		LinkedList<Double> llDouble = new LinkedList<>();
		LinkedList<String> llString = new LinkedList<>();


		
		while (inDouble.hasNext()) {									// populate linked list for doubles
			llDouble.insert(Double.parseDouble(inDouble.next()));
		}
		while (inString.hasNext()) {									// populate linked list for strings
			llString.insert(inString.next());
		}
//------------------------------------------------------------------
		llDouble.printListDataType(llDouble);							// print out double linked list and delete head until empty
		System.out.print("\n");
		llDouble.GoToHead();
		while (!llDouble.atEndOfList()) {
			llDouble.GoToHead();
			System.out.print("List is ");
			while(llDouble.getCurData() != null) {
				System.out.print(llDouble.getCurData() + " ");
				if (llDouble.nextData() == false) {
					break;
				}
			}
			llDouble.delete();
			System.out.print("\n");
		}
		System.out.print("\n");
//-------------------------------------------------------------------	
		llString.printListDataType(llString);							// print out string linked list and delete head until empty
		System.out.print("\n");
		llString.GoToHead();
		while (!llString.atEndOfList()) {
			llString.GoToHead();
			System.out.print("List is ");
			while(llString.getCurData() != null) {
				System.out.print(llString.getCurData() + " ");
				if (llString.nextData() == false) {
					break;
				}
			}
			llString.delete();
			System.out.print("\n");
		}
		System.out.print("\n");
//-------------------------------------------------------------------

	}
}
