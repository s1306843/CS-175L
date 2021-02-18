import java.util.Scanner;

public class mailMerge {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String firstName = " ";
		String lastName = " ";
		String houseNumber = " ";
		String street = " ";
		String userAnswer = " ";
		String textReplace1 = "Dear <firstName> <lastName>,";
		String textReplace2 = "Please confirm that your address is <houseNumber> <street>.";
		String textReplace3 = "Your answer is: <yORn> Goodbye!";
		String prompt1 = "Please enter your first name: ";
		String prompt2 = "Please enter your last name: ";
		String prompt3 = "Please enter your house number: ";
		String prompt4 = "Please enter your street: ";
		String prompt5 = "Is this address correct? ";
		
		System.out.println(prompt1);
		firstName = in.nextLine();
		textReplace1 = textReplace1.replace("<firstName>", firstName);
		System.out.println(prompt2);
		lastName = in.nextLine();
		textReplace1 = textReplace1.replace("<lastName>", lastName);
		System.out.println(prompt3);
		houseNumber = in.nextLine();
		textReplace2 = textReplace2.replace("<houseNumber>", houseNumber);
		System.out.println(prompt4);
		street = in.nextLine();
		textReplace2 = textReplace2.replace("<street>", street);
		System.out.println(prompt5);
		userAnswer = in.next();
		textReplace3 = textReplace3.replace("<yORn>", userAnswer);
		System.out.println(textReplace1);
		System.out.println(textReplace2);
		System.out.println(textReplace3);
	
	}

}