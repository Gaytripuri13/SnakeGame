package snakegame;
import javax.swing.*;

public class SnakeGame extends JFrame{

	 SnakeGame() {
		super("Snake Game");

		add(new BOARD());
		pack();

		setResizable(false);
		setLocationRelativeTo(null);
		
		
	}

	public static void main(String[] args) {
		
   new SnakeGame().setVisible(true);
	}

}
