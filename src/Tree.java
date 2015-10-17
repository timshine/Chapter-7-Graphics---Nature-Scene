import java.awt.*;
public class Tree {
	
	public static void drawStump(Graphics g){
		g.setColor(new Color(100,50,0));
		g.fillRect(750,375,60,125);
		Polygon base = new Polygon();
		base.addPoint(750,475);
		base.addPoint(725,500);
		base.addPoint(835,500);
		base.addPoint(810,475);
		g.fillPolygon(base);
		
		
	}
	
	public static void drawLeaves(Graphics g){
		g.setColor(new Color(0,117,0));
		g.fillOval(690,250,180,140);
	}
}
