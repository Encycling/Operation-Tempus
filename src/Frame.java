import javax.swing.JFrame;

public class Frame extends JFrame{
	
	Frame(){
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setSize(500,500);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Before we start");
	}
}
