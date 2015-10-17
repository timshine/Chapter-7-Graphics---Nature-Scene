import java.awt.Color;
import java.awt.Graphics;


public class Sun {

	public static void drawSun(Graphics g){
		
		g.setColor (new Color(255,255,0));
		g.fillOval(800, 20, 150, 150);
	}
		
	public static void drawSunglasses(Graphics g){
		g.setColor(new Color(0,0,0));
		g.fillArc(825, 45, 40, 40, 180,180);
		g.fillArc(885,45,40,40,180,180);
		g.fillRect(865,65,35,2);
	}
		
	public static void drawMouth(Graphics g){
		g.fillArc(845,105,60,30,180,180);
	}
}
