
public class ConvertToSingleControlStructure {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(".");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("***************SINGLE STRUCTURE VERSION****************");
		
		
		//to get the nth number instead of 5 I would ask the user for input(an int) and then substitute
		//all the 5s for a variable holding the user's input
		
	}

}
