package screen;

import java.awt.HeadlessException;
import javax.swing.JFrame;


//게임 프레임 클래스
public class GameFrame extends JFrame {

	GameOver gameover = new GameOver();
	public GameFrame() throws HeadlessException {
		super();
		
		this.add(GameField.gamefield);
		this.revalidate();
		this.repaint();
		this.add(gameover);


		//this.addKeyListener(new InputKey(element));
		this.requestFocus();
		setSize(GameField.gamefield.returnFieldSize(), GameField.gamefield.returnFieldSize());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setResizable(false);
		setVisible(true);
	
	}
	
	

}
