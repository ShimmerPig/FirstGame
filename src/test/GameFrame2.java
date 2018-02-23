package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame2 extends Frame{
	
	Image img=GameUtill.getImage("images/yuzhou4.jpg");
	Image xing=GameUtill.getImage("images/xingqiu1.png");
	
	public void launchFrame()
	{
		new PaintThread().start();
		setSize(1024,671);
		setLocation(10, 10);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);                      
			}
		});
		
	}

	private double x=10,y=10;
	
	@Override
	public void paint(Graphics g) {

//		g.drawLine(100, 100, 200, 200);
//		g.drawRect(100, 100, 200, 200);
//		g.drawOval(100, 100, 200, 200);
//		
//		Font f=new Font("ÀŒÃÂ",Font.BOLD,100);
//		g.setFont(f);
//		g.drawString("Œ“ «÷Ì÷Ì", 200, 200);
//		
//		g.fillRect(100, 100, 20, 20);
//		
//		Color c=g.getColor();
//		g.setColor(Color.red );
//		g.fillOval(300, 300, 20, 20);
//		g.setColor(c);
//		
		
		g.drawImage(img, 0, 0, null);
		g.drawImage(xing, (int)x, (int)y, null);
		x+=3;
		y+=3;
		
	}
	
	class PaintThread extends Thread{
		
		public void run() {
			while(true) {
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		GameFrame2 gf=new GameFrame2();
		gf.launchFrame();

	}
}
