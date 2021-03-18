import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.lang.Math;
public class birthday_input {

	public static void main(String[] args) {
// Asks the user to input their birthday date and today's date, respectively 		
String input_Birthday = JOptionPane.showInputDialog("Please enter your birthday (MM/DD/YYYY)");

String input_Date = JOptionPane.showInputDialog(" Please enter today's date (MM/DD/YYYY)");	

DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/DD/YYYY");

/* The section below only returns the parts of the string that is specified below (substring).
 For example, the strYear_birthday String variable will return everything the user inputs for "YYYY"
 */
	String strYear_birthday = input_Birthday.substring(6,10);
	String strYear_date = input_Date.substring(6,10);
	String strMonth_birthday = input_Birthday.substring(0,2);
	String strMonth_date = input_Date.substring(0,2);
	String strDay_birthday = input_Birthday.substring(3,5);
	String strDay_date = input_Date.substring(3,5);	

// Takes the string arguments above and returns an integer of the specified string variable 
	int intYear_birthday = Integer.parseInt(strYear_birthday);
	int intYear_date = Integer.parseInt(strYear_date);
	int intMonth_birthday = Integer.parseInt(strMonth_birthday);
	int intMonth_date = Integer.parseInt(strMonth_date);
	int intDay_birthday = Integer.parseInt(strDay_birthday);
	int intDay_date = Integer.parseInt(strDay_date);
	int yearAge; 
	int monthAge; 
		yearAge =  intYear_date - intYear_birthday;
		monthAge = intMonth_date - intMonth_birthday;

	if(intMonth_date <= intMonth_birthday)
		{yearAge = yearAge - 1;}
		
	else if(intDay_date < intDay_birthday)
		{monthAge = monthAge - 1;}
	


JOptionPane.showMessageDialog(null, "You are " +yearAge+" years and " +(Math.abs(monthAge))+" month(s) old");
	
	}

}
