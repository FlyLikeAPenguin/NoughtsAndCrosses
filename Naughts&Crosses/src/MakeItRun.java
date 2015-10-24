import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MakeItRun extends JFrame{
	private static String player = "Cross";
	private static String[] allLines = new String[9];
	public static String currentPlayer;
	private static String[] players = new String[2];
	private static int counter = 0;
	private static boolean[] globalLockState = new boolean[9];
	private static OpeningScreen opn = new OpeningScreen();
	private static NAndCGUI gui = new NAndCGUI();
	static boolean againstComputer = false;
	static boolean gameWon = false;
	Random rand = new Random();
	public static String difficultySelected = "Easy";

	public class event0 implements MouseListener{
		public void mouseClicked(MouseEvent e11) {	
		}	
		@Override
		public void mouseEntered(MouseEvent arg0) {	
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
		}
		@Override
		public void mousePressed(MouseEvent arg0) {	
			if (globalLockState[0] == false){
				MakeMove(0);
				if(againstComputer == true && counter != 8){
					if(difficultySelected.equals("Hard")){
						ComputerMove(0);
					}else if(difficultySelected.equals("Easy")){
						MakeRandomMove();
					}
				}
			}
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
	}
	public class event1 implements MouseListener{
		public void mouseClicked(MouseEvent e12) {
		}	
		@Override
		public void mouseEntered(MouseEvent arg0) {		
		}
		@Override
		public void mouseExited(MouseEvent arg0) {			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {	
			if (globalLockState[1] == false){
				MakeMove(1);
				if(againstComputer == true && counter != 8){
					if(difficultySelected.equals("Hard")){
						ComputerMove(1);
					}else if(difficultySelected.equals("Easy")){
						MakeRandomMove();
					}
				}
			}
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
	}
	public class event2 implements MouseListener{
		public void mouseClicked(MouseEvent e13) {
		}	
		@Override
		public void mouseEntered(MouseEvent arg0) {		
		}
		@Override
		public void mouseExited(MouseEvent arg0) {			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {	
			if (globalLockState[2] == false){
				MakeMove(2);
				if(againstComputer == true && counter != 8){
					if(difficultySelected.equals("Hard")){
						ComputerMove(2);
					}else if(difficultySelected.equals("Easy")){
						MakeRandomMove();
					}
				}
			}
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
	}
	public class event3 implements MouseListener{
		public void mouseClicked(MouseEvent e21) {
		}	
		@Override
		public void mouseEntered(MouseEvent arg0) {		
		}
		@Override
		public void mouseExited(MouseEvent arg0) {			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {	
			if (globalLockState[3] == false){
				MakeMove(3);
				if(againstComputer == true && counter != 8){
					if(difficultySelected.equals("Hard")){
						ComputerMove(3);
					}else if(difficultySelected.equals("Easy")){
						MakeRandomMove();
					}
				}
			}
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
	}
	public class event4 implements MouseListener{
		public void mouseClicked(MouseEvent arg0) {
		}	
		@Override
		public void mouseEntered(MouseEvent arg0) {		
		}
		@Override
		public void mouseExited(MouseEvent e22) {			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {	
			if (globalLockState[4] == false){
				MakeMove(4);
				if(againstComputer == true && counter != 8){
					if(difficultySelected.equals("Hard")){
						ComputerMove(4);
					}else if(difficultySelected.equals("Easy")){
						MakeRandomMove();
					}
				}
			}
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
	}
	public class event5 implements MouseListener{
		public void mouseClicked(MouseEvent e23) {
		}	
		@Override
		public void mouseEntered(MouseEvent arg0) {		
		}
		@Override
		public void mouseExited(MouseEvent arg0) {			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {	
			if (globalLockState[5] == false){
				MakeMove(5);
				if(againstComputer == true && counter != 8){
					if(difficultySelected.equals("Hard")){
						ComputerMove(5);
					}else if(difficultySelected.equals("Easy")){
						MakeRandomMove();
					}
				}
			}
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
	}
	public class event6 implements MouseListener{
		public void mouseClicked(MouseEvent e31) {
		}	
		@Override
		public void mouseEntered(MouseEvent arg0) {		
		}
		@Override
		public void mouseExited(MouseEvent arg0) {			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {	
			if (globalLockState[6] == false){		
				MakeMove(6);
				if(againstComputer == true && counter != 8){
					if(difficultySelected.equals("Hard")){
						ComputerMove(6);
					}else if(difficultySelected.equals("Easy")){
						MakeRandomMove();
					}
				}
			}
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
	}
	public class event7 implements MouseListener{
		public void mouseClicked(MouseEvent e32) {
		}	
		@Override
		public void mouseEntered(MouseEvent arg0) {		
		}
		@Override
		public void mouseExited(MouseEvent arg0) {			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {	
			if (globalLockState[7] == false){
				MakeMove(7);
				if(againstComputer == true && counter != 8){
					if(difficultySelected.equals("Hard")){
						ComputerMove(7);
					}else if(difficultySelected.equals("Easy")){
						MakeRandomMove();
					}
				}
			}
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
	}
	public class event8 implements MouseListener{
		public void mouseClicked(MouseEvent e33) {
		}	
		@Override
		public void mouseEntered(MouseEvent arg0) {		
		}
		@Override
		public void mouseExited(MouseEvent arg0) {			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {	
			if (globalLockState[8] == false){
				MakeMove(8);
				if(againstComputer == true && counter != 8){
					if(difficultySelected.equals("Hard")){
						ComputerMove(8);
					}else if(difficultySelected.equals("Easy")){
						MakeRandomMove();
					}
				}
			}
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
	}
	public class eventBegin implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent arg0) {
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {	
		}
		@Override
		public void mouseExited(MouseEvent arg0) {		
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
			
			gameWon = false;
			
			System.out.println("Begin Pressed");
			System.out.println("Against Computer: " + againstComputer);

			players[0] = OpeningScreen.nameField1.getText();
			System.out.println("Player 1 " + players[0]);
			if (players[0].equals("")){
				players[0] = "Crosses";
			}
			players[1] = OpeningScreen.nameField2.getText();
			System.out.println("Player 2 " + players[1]);
			if (players[1].equals("")){
				players[1] = "Noughts";
			}
			if(players[1].equals(players[0])){
				players[0] = "Crosses";
				players[1] = "Noughts";
			}
			
			opn.setVisible(false);
			
			ReplayGame();

			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gui.setSize(310, 330);
			//gui.setResizable(false);
			gui.setVisible(true);
			gui.setTitle("Noughts & Crosses");
			
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
	}
	public class eventEnd implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent arg0) {			
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {			
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
		}
		@Override
		public void mousePressed(MouseEvent arg0) {		
			System.exit(0);
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {			
		}
	}
	public class eventReplay implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
		}
		@Override
		public void mouseEntered(MouseEvent e) {
		}
		@Override
		public void mouseExited(MouseEvent e) {
		}
		@Override
		public void mousePressed(MouseEvent e) {
			
			System.out.println("Replay Pressed");
			ReplayGame();

			gui.setVisible(true);
			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gui.setSize(310, 310);
			gui.setResizable(false);
			gui.setTitle("Noughts & Crosses");
			dispose();
		}
		@Override
		public void mouseReleased(MouseEvent e) {
		}
	}
	public class eventRestart implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent arg0) {
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
			
			System.out.println("Restart Pressed");
			gui.setVisible(false);
			opn.setVisible(true);
			dispose();
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
		}
	}
	public class eventAI implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			if(OpeningScreen.computer.isSelected()){
				OpeningScreen.difficulties.setVisible(true);
				opn.pack();
				
				againstComputer = true;						
			}else{
				againstComputer = false;
				OpeningScreen.difficulties.setVisible(false);
			}						
		}
	}
	public class eventDifficultyEasy implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
				difficultySelected = "Easy";
				System.out.println(difficultySelected);
				
		}
	}
	public class eventDifficultyHard implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
				difficultySelected = "Hard";
				System.out.println(difficultySelected);
				
		}
	}

	public boolean CheckWin(){

		if (allLines[0].equals(allLines[1]) && allLines[2].equals(allLines[1]) && !allLines[0].equals(" ")){       // X|X|X  O|O|O|  | | 
			return true;
		}else if (allLines[3].equals(allLines[4]) && allLines[5].equals(allLines[4]) && !allLines[3].equals(" ")){
			return true;
		}else if (allLines[6].equals(allLines[7]) && allLines[8].equals(allLines[7]) && !allLines[6].equals(" ")){
			return true;
		}else if (allLines[0].equals(allLines[4]) && allLines[4].equals(allLines[8]) && !allLines[0].equals(" ")){
			return true;
		}else if (allLines[6].equals(allLines[4]) && allLines[4].equals(allLines[2]) && !allLines[6].equals(" ")){
			return true;
		}else if (allLines[0].equals(allLines[3]) && allLines[3].equals(allLines[6]) && !allLines[0].equals(" ")){
			return true;
		}else if (allLines[1].equals(allLines[4]) && allLines[4].equals(allLines[7]) && !allLines[1].equals(" ")){
			return true;
		}else if (allLines[2].equals(allLines[5]) && allLines[5].equals(allLines[8]) && !allLines[2].equals(" ")){
			return true;
		}else{
			return false;
		}
	}
	public void SwitchPlayers(){
		if (currentPlayer.equals(players[0])){
			currentPlayer = players[1];
			player = "Nought";
		}else{
			if (currentPlayer.equals(players[1])){
				currentPlayer = players[0];
				player = "Cross";
			}
		}
	}
	public void AnnounceWin(){
		boolean result = CheckWin();
		System.out.println("CheckWin: " + CheckWin());

		if (result == true){
			System.out.println("Win " + currentPlayer);
			PlayAgain pag = new PlayAgain("win");
			pag.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			pag.setSize(400, 200);
			pag.setResizable(false);
			pag.setVisible(true);
			pag.setTitle("Noughts & Crosses: Play Again?");
			gameWon = true;

		}else if (counter > 7){

			System.out.println("Draw " + currentPlayer);
			PlayAgain pag = new PlayAgain("draw");
			pag.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			pag.setSize(400, 200);
			pag.setResizable(false);
			pag.setVisible(true);
			pag.setTitle("Noughts & Crosses: Play Again?");
			gameWon = true;
			
		}else{ 
			System.out.println("Game Continues " + counter);
			counter++;
		}
	}
	public void ReplayGame(){
		
		for(int i = 0; i < 9; i++){
			allLines[i] = " ";
			System.out.println("Slot " + (i+1) + " Cleared");
			
			NAndCGUI.image = new ImageIcon(getClass().getResource("Blank.png"));
			NAndCGUI.labels[i].setIcon(NAndCGUI.image);
		}
		
		gameWon = false;
		
		currentPlayer = players[0];

		SkeletonKey();

		player = "Cross";
		counter = 0;

		System.out.println("Board Cleared");
	}
	public static void SkeletonKey(){
		for (int i = 0; i < 9; i++){
			globalLockState[i] = false;
			System.out.println("Global Lock" + i + " is now unlocked");
		}
	}
	public void ComputerMove(int lastMove){
		if (gameWon == false){
			if(FinishLine() != -1 && FinishLine() != lastMove && allLines[FinishLine()].equals(" ")){
				System.out.println("FinishLine: " + FinishLine());
				MakeMove(FinishLine());
			}else if(CheckBlock() != -1 && CheckBlock() != lastMove && allLines[CheckBlock()].equals(" ")){
				MakeMove(CheckBlock());
			}else if (lastMove == 0 || lastMove == 2 || lastMove == 6 || lastMove == 8){
				if(allLines[4].equals(" ")){
					MakeMove(4);
				}else{
					boolean success = false;
					while (success == false){
						int n = rand.nextInt(9);
						if (allLines[n].equals(" ")){
							MakeMove(n);
							success = true;
						}
					}
				}
			}else if (lastMove == 1 || lastMove == 3 || lastMove == 5 || lastMove == 7){
				if(allLines[4].equals(" ")){
					MakeMove(4);
				}else{
					boolean success = false;
					while (success == false){
						int n = rand.nextInt(9);
						if (allLines[n].equals(" ")){
							MakeMove(n);
							success = true;
						}
					}
				}
			}else{boolean success = false;
			while (success == false){
				int n = rand.nextInt(9);
				if (allLines[n].equals(" ")){
					MakeMove(n);
					success = true;
				}
			}
			}
		}
	}
	public int CheckBlock(){
		if(allLines[0].equals("Cross") && allLines[1].equals("Cross") && !allLines[2].equals("Nought")){
			return 2;
		}else if(allLines[3].equals("Cross") && allLines[4].equals("Cross") && !allLines[5].equals("Nought")){
			return 5;
		}else if(allLines[6].equals("Cross") && allLines[7].equals("Cross") && !allLines[8].equals("Nought")){
			return 8;
		}else if(allLines[1].equals("Cross") && allLines[2].equals("Cross") && !allLines[0].equals("Nought")){
			return 0;
		}else if(allLines[4].equals("Cross") && allLines[5].equals("Cross") && !allLines[3].equals("Nought")){
			return 3;
		}else if(allLines[7].equals("Cross") && allLines[8].equals("Cross") && !allLines[6].equals("Nought")){
			return 6;
		}else if(allLines[0].equals("Cross") && allLines[2].equals("Cross") && !allLines[1].equals("Nought")){
			return 1;
		}else if(allLines[3].equals("Cross") && allLines[5].equals("Cross") && !allLines[4].equals("Nought")){
			return 4;
		}else if(allLines[6].equals("Cross") && allLines[8].equals("Cross") && !allLines[7].equals("Nought")){
			return 7;
		}else if(allLines[0].equals("Cross") && allLines[3].equals("Cross") && !allLines[6].equals("Nought")){
			return 6;
		}else if(allLines[1].equals("Cross") && allLines[4].equals("Cross") && !allLines[7].equals("Nought")){
			return 7;
		}else if(allLines[2].equals("Cross") && allLines[5].equals("Cross") && !allLines[8].equals("Nought")){
			return 8;
		}else if(allLines[3].equals("Cross") && allLines[6].equals("Cross") && !allLines[0].equals("Nought")){
			return 0;
		}else if(allLines[4].equals("Cross") && allLines[7].equals("Cross") && !allLines[1].equals("Nought")){
			return 1;
		}else if(allLines[5].equals("Cross") && allLines[8].equals("Cross") && !allLines[2].equals("Nought")){
			return 2;
		}else if(allLines[0].equals("Cross") && allLines[6].equals("Cross") && !allLines[3].equals("Nought")){
			return 3;
		}else if(allLines[1].equals("Cross") && allLines[7].equals("Cross") && !allLines[4].equals("Nought")){
			return 4;
		}else if(allLines[2].equals("Cross") && allLines[8].equals("Cross") && !allLines[5].equals("Nought")){
			return 5;
		}else if(allLines[0].equals("Cross") && allLines[8].equals("Cross") && !allLines[4].equals("Nought")){
			return 4;
		}else if(allLines[2].equals("Cross") && allLines[6].equals("Cross") && !allLines[4].equals("Nought")){
			return 4;
		}else if(allLines[0].equals("Cross") && allLines[4].equals("Cross") && !allLines[8].equals("Nought")){
			return 8;
		}else if(allLines[2].equals("Cross") && allLines[4].equals("Cross") && !allLines[6].equals("Nought")){
			return 6;
		}else if(allLines[4].equals("Cross") && allLines[8].equals("Cross") && !allLines[0].equals("Nought")){
			return 0;
		}else if(allLines[6].equals("Cross") && allLines[4].equals("Cross") && !allLines[2].equals("Nought")){
			return 2;
		}else{																						
			return -1;
		}
	}
	public int FinishLine(){
		if(allLines[0].equals("Nought") && allLines[1].equals("Nought") && !allLines[2].equals("Cross")){
			return 2;
		}else if(allLines[3].equals("Nought") && allLines[4].equals("Nought") && !allLines[5].equals("Cross")){
			return 5;
		}else if(allLines[6].equals("Nought") && allLines[7].equals("Nought") && !allLines[8].equals("Cross")){
			return 8;
		}else if(allLines[1].equals("Nought") && allLines[2].equals("Nought") && !allLines[0].equals("Cross")){
			return 0;
		}else if(allLines[4].equals("Nought") && allLines[5].equals("Nought") && !allLines[3].equals("Cross")){
			return 3;
		}else if(allLines[7].equals("Nought") && allLines[8].equals("Nought") && !allLines[6].equals("Cross")){
			return 6;
		}else if(allLines[0].equals("Nought") && allLines[2].equals("Nought") && !allLines[1].equals("Cross")){
			return 1;
		}else if(allLines[3].equals("Nought") && allLines[5].equals("Nought") && !allLines[4].equals("Cross")){
			return 4;
		}else if(allLines[6].equals("Nought") && allLines[8].equals("Nought") && !allLines[7].equals("Cross")){
			return 7;
		}else if(allLines[0].equals("Nought") && allLines[3].equals("Nought") && !allLines[6].equals("Cross")){
			return 6;
		}else if(allLines[1].equals("Nought") && allLines[4].equals("Nought") && !allLines[7].equals("Cross")){
			return 7;
		}else if(allLines[2].equals("Nought") && allLines[5].equals("Nought") && !allLines[8].equals("Cross")){
			return 8;
		}else if(allLines[3].equals("Nought") && allLines[6].equals("Nought") && !allLines[0].equals("Cross")){
			return 0;
		}else if(allLines[4].equals("Nought") && allLines[7].equals("Nought") && !allLines[1].equals("Cross")){
			return 1;
		}else if(allLines[5].equals("Nought") && allLines[8].equals("Nought") && !allLines[2].equals("Cross")){
			return 2;
		}else if(allLines[0].equals("Nought") && allLines[6].equals("Nought") && !allLines[3].equals("Cross")){
			return 3;
		}else if(allLines[1].equals("Nought") && allLines[7].equals("Nought") && !allLines[4].equals("Cross")){
			return 4;
		}else if(allLines[2].equals("Nought") && allLines[8].equals("Nought") && !allLines[5].equals("Cross")){
			return 5;
		}else if(allLines[0].equals("Nought") && allLines[8].equals("Nought") && !allLines[4].equals("Cross")){
			return 4;
		}else if(allLines[2].equals("Nought") && allLines[6].equals("Nought") && !allLines[4].equals("Cross")){
			return 4;
		}else if(allLines[0].equals("Nought") && allLines[4].equals("Nought") && !allLines[8].equals("Cross")){
			return 8;
		}else if(allLines[2].equals("Nought") && allLines[4].equals("Nought") && !allLines[6].equals("Cross")){
			return 6;
		}else if(allLines[4].equals("Nought") && allLines[8].equals("Nought") && !allLines[0].equals("Cross")){
			return 0;
		}else if(allLines[6].equals("Nought") && allLines[4].equals("Nought") && !allLines[2].equals("Cross")){
			return 2;
		}else{																						
			return -1;
		}
	}
	public void MakeRandomMove(){
		if (gameWon == false){
			boolean success = false;
			while (success == false){
				int n = rand.nextInt(9);
				if (allLines[n].equals(" ")){
					MakeMove(n);
					success = true;
				}
			}
		}
	}
	public void MakeMove(int index){
		globalLockState[index] = true;
		allLines[index] = player;
		System.out.println("Click " + index);
		NAndCGUI.image = new ImageIcon(getClass().getResource(player +".png"));
		NAndCGUI.labels[index].setIcon(NAndCGUI.image);
		AnnounceWin();
		SwitchPlayers();
	}
	public static void main(String[] args) {
		MakeItRun m = new MakeItRun();

		eventBegin eButton = m.new eventBegin();
		OpeningScreen.beginGame.addMouseListener(eButton);

		opn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		opn.pack();
		opn.setVisible(true);
		opn.setTitle("Welcome to Noughts & Crosses");	
		

	}
}