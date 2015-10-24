import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class OpeningScreen extends MakeItRun{

	private ImageIcon openingScreen;
	private JLabel imgHolder;
	static JTextField nameField1, nameField2;
	static JButton beginGame = new JButton("Begin Game");
	static JCheckBox computer;
	public static JRadioButton difficultyEasy, difficultyHard;
	public static GridBagConstraints gbc;
	public static ButtonGroup group = new ButtonGroup();
	public static JPanel difficulties = new JPanel();
	
	OpeningScreen(){
		dispose();
			
		setLayout(new FlowLayout());
		JRadioButton difficultyEasy = new JRadioButton("Easy Difficulty", true);
		group.add(difficultyEasy);
		
		JRadioButton difficultyHard = new JRadioButton("Hard Difficulty", false);
		group.add(difficultyHard);
		
		difficulties.add(difficultyEasy);
		difficulties.add(difficultyHard);
		
		eventDifficultyEasy difE = new eventDifficultyEasy();
		difficultyEasy.addActionListener(difE);
		
		eventDifficultyHard difH = new eventDifficultyHard();
		difficultyHard.addActionListener(difH);
		
			setLayout(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.insets = new Insets(5,5,5,5);
			
			gbc.gridx = 0;
			gbc.gridy = 0;
			openingScreen = new ImageIcon(getClass().getResource("OpeningScreen.png"));
			imgHolder = new JLabel(openingScreen);
			add(imgHolder, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 0;
			add(beginGame, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 1;
			nameField1 = new JTextField("Player One", 16); //Character limit is (16)
			add(nameField1, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 1;
			nameField2 = new JTextField("Player Two", 16); //Character limit is (16)
			add(nameField2, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 2;
			computer = new JCheckBox("Play Against AI");
			add(computer, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 2;
			add(difficulties, gbc);
			difficulties.setVisible(false);
			
			eventAI ai = new eventAI();
			computer.addItemListener(ai);
	}
}