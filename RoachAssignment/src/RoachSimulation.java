import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class RoachSimulation {

	public static void main(String[] args) 
	{
		DecimalFormat decFormat = new DecimalFormat("00");
		String in = JOptionPane.showInputDialog(null, "Please enter the starting roach population:");
		double startingPop = Double.parseDouble(in);
		RoachPopulation roaches = new RoachPopulation(startingPop);
		JOptionPane.showMessageDialog(null, "The initial roach population is: " + decFormat.format(startingPop));
		
		//spray cycle #1
		roaches.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 1 breeding is: " + decFormat.format(Math.round(roaches.getroaches())));
		in = JOptionPane.showInputDialog("Please enter spray percentage for cycle 1: ");
		double sprayPct = Double.parseDouble(in);
		roaches.spray(sprayPct);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 1: " + decFormat.format(sprayPct* 100) + "% spraying is " + Math.round(roaches.getroaches()));
		
		//spray cycle #2
		roaches.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 2 breeding is: " + decFormat.format(Math.round(roaches.getroaches())));
		in = JOptionPane.showInputDialog("Please enter spray percentage for cycle 2: ");
		sprayPct = Double.parseDouble(in);
		roaches.spray(sprayPct);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 2: " + decFormat.format(sprayPct* 100) + "% spraying is " + Math.round(roaches.getroaches()));
		
		//spray cycle #3
		roaches.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 3 breeding is: " + decFormat.format(Math.round(roaches.getroaches())));
		in = JOptionPane.showInputDialog("Please enter spray percentage for cycle 3: ");
		sprayPct = Double.parseDouble(in);
		roaches.spray(sprayPct);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 3: " + decFormat.format(sprayPct* 100) + "% spraying is " + Math.round(roaches.getroaches()));
		
		//spray cycle #4
		roaches.breed();
		JOptionPane.showMessageDialog(null, "The roach population after cycle 4 breeding is: " + decFormat.format(Math.round(roaches.getroaches())));
		in = JOptionPane.showInputDialog("Please enter spray percentage for cycle 4: ");
		sprayPct = Double.parseDouble(in);
		roaches.spray(sprayPct);
		JOptionPane.showMessageDialog(null, "The roach population after cycle 4: " + decFormat.format(sprayPct* 100) + "% spraying is " + Math.round(roaches.getroaches()));
		
	}

}
