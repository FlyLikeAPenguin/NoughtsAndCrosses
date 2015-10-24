import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class PlayAgain extends MakeItRun{

	static JButton replay, end, restart;
	private JLabel congratulations;
	static String winningPlayer;
	
	PlayAgain(String wd){
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5,5,5,5);
		
		if (wd == "win"){
			dispose();
			gbc.gridx = 1;
			gbc.gridy = 0;
			congratulations = new JLabel("Congratulations " + currentPlayer + "!");
			add(congratulations, gbc);
		}else if (wd == "draw"){
			dispose();
			gbc.gridx = 1;
			gbc.gridy = 0;
			congratulations = new JLabel("It was a Draw!");
			add(congratulations, gbc);	
		}
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.ipadx = 5;
		replay = new JButton("Replay");
		add(replay, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		restart = new JButton("Restart");
		add(restart, gbc);

		gbc.gridx = 2;
		gbc.gridy = 1;
		end = new JButton("End");
		add(end, gbc);

		NAndCGUI.eventEnd end = new NAndCGUI.eventEnd();
		PlayAgain.end.addMouseListener(end);
		
		NAndCGUI.eventReplay replay = new NAndCGUI.eventReplay();
		PlayAgain.replay.addMouseListener(replay);
		
		NAndCGUI.eventRestart restart = new NAndCGUI.eventRestart();
		PlayAgain.restart.addMouseListener(restart);
	}
}