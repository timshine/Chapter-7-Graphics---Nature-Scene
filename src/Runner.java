/********************
 * Timothy Shine    *
 * Graphics Lab 07  *
 * 10/16/2015       *
 * ******************/
 

import java.awt.*;
import java.applet.*;

public class Runner extends Applet {
	
	//Sets Applet Size
	public void init(){
		setSize(1000,650);
	}
	
	//Outline of Program
	public void paint (Graphics g)
	{
		
		Background.drawSky(g);
		Background.drawMountains(g);
		Background.drawSecondMountain(g);
		Background.drawGrass(g);
		Sun.drawSun(g);
		Sun.drawSunglasses(g);
		Sun.drawMouth(g);
		Nature.drawClouds(g);
		Nature.drawPath(g);
		Tree.drawStump(g);
		Tree.drawLeaves(g);
		
	}
}
