import java.util.*;
import javax.swing.*;

public class OurWindow extends JFrame {
	final int WINDOW_WIDTH = 350;
	final int WINDOW_HEIGHT = 250;
	
	public OurWindow() {
		
		setTitle("A simple window.");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		OurWindow wn = new OurWindow();	
	}
}