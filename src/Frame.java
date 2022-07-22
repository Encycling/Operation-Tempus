import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Frame extends JFrame implements ActionListener{
	JLabel label;
	JButton button;
	
	Frame(){
		button = new JButton();
		button.setBounds(150,80,250,50);
		button.setHorizontalAlignment(JButton.CENTER);
		button.setVerticalAlignment(JButton.BOTTOM);
		button.setText("Okay.");
		button.setFocusable(false);
		button.addActionListener(this);
		button.setHorizontalAlignment(SwingConstants.CENTER);
		button.setVerticalAlignment(SwingConstants.CENTER);
		
		label = new JLabel();
		label.setText("<html>I would like to thank<br/>itoaster5#5877 for being a tester.<br/>(ik bad design lol, will improve on next project)</html>");
		label.setBounds(150,0,250,250);
		label.setVisible(true);
		label.setFocusable(false);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.TOP);
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setSize(500,200);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Before we start");
		this.add(label);
		this.setLayout(null);
		this.add(button);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			this.dispose();
		}
		
	}
}
