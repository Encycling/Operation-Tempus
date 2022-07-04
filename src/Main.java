import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		// W.I.P
		// This project will start once Chez_Poofz is done learning Java.
		// NOT FINISHED

		// The first frame.

		// CREDITS TO BRO CODE (https://www.youtube.com/c/BroCodez)
		
		ImageIcon image = new ImageIcon("otLogo.png");
		Border border = BorderFactory.createLineBorder(Color.cyan);
				
		JLabel label = new JLabel(); // create a label
		label.setText("Welcome to Operation T.E.M.P.U.S"); // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);// set text left,center, right of image icon
		label.setVerticalTextPosition(JLabel.TOP); // set text top, center, bottom of image icon
		label.setForeground(Color.white); // set font color of text
		label.setFont(new Font("MV Boli", Font.PLAIN,20)); // set font of text
		label.setIconTextGap(-5); // set gap of text to image
		label.setBackground(Color.black); // set background color
		label.setOpaque(true); // display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
		label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon + test within label
		// label.setBounds(100,100,350,350); // set x,y position within frame as well as dimensions
				
				
				
		JFrame frame = new JFrame(); // Creates a frame
		frame.setSize(500,500); // sets the x dimension and y dimension of out frame
		frame.setVisible(true); // make frame visible
		// frame.setLayout(null);
		frame.setTitle("Operation T.E.M.P.U.S"); // Sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		frame.setResizable(false); // prevent frame from being resized (if false)
		frame.add(label);
		// frame.pack();
		// frame.getContentPane().setBackground(new Color(35,35,35,255)); // change color of bg

	}

}
