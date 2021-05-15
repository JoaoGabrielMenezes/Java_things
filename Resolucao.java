package project;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class Resolucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = gd.getDisplayMode().getWidth();
		int height = gd.getDisplayMode().getHeight();
		
		System.out.println("Sua res é: "+width+" por "+height);
	}

}
