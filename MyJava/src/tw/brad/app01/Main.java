package tw.brad.app01;

import javax.swing.JFrame;

public class Main extends JFrame{
	public Main() {
		super("Main App");
		setSize(640,480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Main();
	}

}
