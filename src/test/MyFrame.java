package test;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import test.GameFrame.PaintThread;

public class MyFrame extends Frame{
	public void launchFrame()
	{
		new PaintThread().start();
		setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
		setLocation(10, 10);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);                      
			}
		});
		
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
	


}
