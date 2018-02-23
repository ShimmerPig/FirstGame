package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends Frame{
	

	Image xing=GameUtill.getImage("images/ball.png");
	
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

	private double x=100,y=100;
	private double degree=3.14/3;
	private double speed=20;
	@Override
	public void paint(Graphics g) {

	
		g.drawImage(xing, (int)x, (int)y, null);
		if(speed>0)
		{
			speed-=0.05;
		}
		else
		{
			speed=0;
		}
		
		
		x+=speed*Math.cos(degree);
		y+=speed*Math.sin(degree);
		
		if(y>670-30||y<70)
		{
			degree=-degree;
		}
		if(x<0||x>1024-30)
		{
			degree=Math.PI-degree;
		}
	
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
		GameFrame gf=new GameFrame();
		gf.launchFrame();

	}
}
