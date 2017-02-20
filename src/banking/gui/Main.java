package banking.gui;

/*
File: main.java
Author: Charles Breshears , Andrew Negri
Date: 20 Feb 2016

Description: main method for running the program
*/

/**
Class:

Description:
*/

/**
Method:
Inputs:
Returns:

Description:
*/
import javax.swing.JFrame;


final class Main {
	/**
	 * Private constructor to address STYLE issue.
	 */
	private Main() {
	}
	
	/**
	 * All methods should have a Javadoc according to STYLE.
	 * @param args command-line arguments
	 * @throws Exception as per typical main specifications
	 */
	public static void main(final String[] args) throws Exception {

		if (args.length != 1) {
			System.out.println("Usage: java FormMain <property file>");
			System.exit(1);
		}

		String propertyFile = args[0];
		JFrame frame = new MainFrame(propertyFile);
		frame.setVisible(true);

	}
}
