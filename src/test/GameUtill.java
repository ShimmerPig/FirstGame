package test;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class GameUtill {
	
	private GameUtill() {}
	
	public static Image getImage(String path) {
		
		URL u=GameUtill.class.getClassLoader().getResource(path);
		BufferedImage img=null;
		try {
			img=ImageIO.read(u);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
		
	}

}
