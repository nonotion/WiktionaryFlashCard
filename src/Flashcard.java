/**
 * 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import fastily.jwiki.core.Wiki;

/**
 * @author Alan & Ziyang
 *
 */
public class Flashcard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test
		// Gets the text of the main page and prints it.
		//Wiki wiki = new Wiki("en.wikipedia.org");
		//System.out.println(wiki.getPageText("Main Page"));
		//Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
	
	private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
}

