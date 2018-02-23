package test;

import java.awt.Graphics;
import java.awt.Image;

public class GameFrame3 extends MyFrame{
	Image ball=GameUtill.getImage("images/ball.png");
	
	private double x=100,y=100;
	private double degree=3.14/3;
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(ball, (int)x, (int)y, null);
		
		x=100+100*Math.cos(degree);
		y=200+50*Math.sin(degree);
		
		degree+=0.1;
		
	}
	
	public static void main(String[] args) {
		GameFrame3 gf=new GameFrame3();
		gf.launchFrame();
	}

}
