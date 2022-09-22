import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TextF0 extends JFrame implements ActionListener {

	// ------------------------------------------------ DEAD PROJECT
	// ----------------------------------------------------
	String thisIsADEadProject = "THIS IS A DEAD PROJECT";
	// ------------------------------------------------ DEAD PROJECT
	// ----------------------------------------------------

	JButton button;
	JTextField textField;

	TextF0() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		button = new JButton("Continue (you can use CTRL A to copy the code)");
		button.addActionListener(this);

		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		// textField.setFont(new Font("Consolas",Font.PLAIN,35));
		// textField.setForeground(new Color(0x00FF00));
		// textField.setBackground(Color.black);
		// textField.setCaretColor(Color.white);
		textField.setText(
				"01110100 01110101 01110100 01101111 01110010 01101001 01100001 01101100 00100000 01101100 01101111 01101100");
		textField.setEditable(false);

		this.add(button);
		this.add(textField);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			String zeroInput = JOptionPane.showInputDialog("Enter your answer:");
			if (zeroInput.equals("tutorial lol")) {
				this.dispose();
				JOptionPane.showMessageDialog(null, "Congratulations! That was pretty easy, but it's a good start.",
						"WOOHOO", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Moving onto: LEVEL 1", "WOOHOO", JOptionPane.WARNING_MESSAGE);
				Levels.Level1();
			} else {
				JOptionPane.showMessageDialog(null,
						"Try again. You can convert the binary into text using a converter.", "Whoops.",
						JOptionPane.ERROR_MESSAGE);
			}
		}

	}

}
