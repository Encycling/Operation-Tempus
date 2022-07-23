import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Frame0 extends JFrame implements ActionListener{
	// JFrame for level 0
	
	JButton button;
	JTextField textField;
	JTextField textField2;
	
	Frame0(){
		
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(getPreferredSize());
		
		button = new JButton("submit");
		button.addActionListener(this);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(500,40));
		textField.setText("01101111 01110000 01100101 01110010 01100001 01110100 01101001 01101111 01101110 00100000 01110100 01100101 01101101 01110000 01110101 01110011 00100000 01110100 01110101 01110100 01101111 01110010 01101001 01100001 01101100");
		textField.setEditable(false);
		
		textField2 = new JTextField();
		textField2.setPreferredSize(new Dimension(500,40));
		textField2.setText("Enter the decoded message here (you can press CTRL A to copy the code.)");
		textField2.setEditable(true);
		
		
		this.add(textField);
		this.add(button);
		this.add(textField2);
		this.setVisible(true);
		this.pack();
		this.setLocationRelativeTo(null);
		
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			String tAnswer = textField2.getText();
			if(tAnswer == "operation tempus tutorial") {
				JOptionPane.showMessageDialog(null, "Congratulations! You have finished the tutorial", "CONGRATS", JOptionPane.INFORMATION_MESSAGE);
				this.dispose();
				Levels.Level1();
			}
			else {
				JOptionPane.showMessageDialog(null, "Come on.. It isn't that hard. Try converting the binary into text.", "Whoops...", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
