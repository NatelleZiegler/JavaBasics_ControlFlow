import java.util.*;
import javax.swing.*;

public class Poll {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int WINDOW_WIDTH = 350;
		final int WINDOW_HEIGHT = 250;
		
		JFrame window = new JFrame();
		window.setTitle("This is a window.");
		
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setVisible(true);		
	}
}