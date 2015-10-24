import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;



@SuppressWarnings("serial")
public class NAndCGUI extends MakeItRun{
	
	public static ImageIcon image;
	public static JLabel[] labels = new JLabel[9];
	public static JPanel gridPanel;
	ImageIcon bg = new ImageIcon(getClass().getResource("Background.png"));
	Image background = bg.getImage();
	
public void paint(Graphics g){
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(background, 10, 20, null);
	}
	public NAndCGUI(){
		setLayout(new GridLayout(3, 3, 10, 10));	
		
		for(int i = 0; i<9; i++){
		labels[i] = new JLabel(image);
		add(labels[i]);
		}

		event0 e0 = new event0();
		event1 e1 = new event1();
		event2 e2 = new event2();
		event3 e3 = new event3();
		event4 e4 = new event4();
		event5 e5 = new event5();
		event6 e6 = new event6();
		event7 e7 = new event7();
		event8 e8 = new event8();
		
		labels[0].addMouseListener(e0);
		labels[1].addMouseListener(e1);
		labels[2].addMouseListener(e2);
		labels[3].addMouseListener(e3);
		labels[4].addMouseListener(e4);
		labels[5].addMouseListener(e5);
		labels[6].addMouseListener(e6);
		labels[7].addMouseListener(e7);
		labels[8].addMouseListener(e8);	
		}
	
	
	}