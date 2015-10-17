import java.awt.*;
public class Background {
	
	public static void drawSky(Graphics g)
	{
		g.setColor(new Color (55,196,255));
		g.fillRect(0, 0, 1000, 650);
	}
	
	public static void drawMountains(Graphics g){
		//Draw Mountain
		g.setColor(new Color (155,78,0));
		Polygon tri = new Polygon();
		tri.addPoint(0, 400);
		tri.addPoint(400,400);
		tri.addPoint(200,0);
		g.fillPolygon(tri);
	
	
		//Draw Peak
		g.setColor(new Color(255,255,255));
		Polygon peak = new Polygon();
		peak.addPoint(150,100);
		peak.addPoint(250,100);
		peak.addPoint(200,0);
		g.fillPolygon(peak);
	}
		
	public static void drawSecondMountain(Graphics g){
		//Draw Second Mountain
		g.setColor(new Color (155,78,0));
		Polygon tri1 = new Polygon();
		tri1.addPoint(200,400);
		tri1.addPoint(600, 400);
		tri1.addPoint(400,0);
		g.fillPolygon(tri1);
		
		//Draw Second Peak
		g.setColor(new Color(255,255,255));
		Polygon peak1 = new Polygon();
		peak1.addPoint(350,100);
		peak1.addPoint(450, 100);
		peak1.addPoint(400, 0);
		g.fillPolygon(peak1);
		
		//Outline
		g.setColor(new Color (0,0,0));
		g.drawLine(0, 400, 200,0);
		g.drawLine(200,0,300,200);
		g.drawLine(200,400,400,0);
		g.drawLine(400,0,600,400);
		
	}	
	
	
	
	public static void drawGrass(Graphics g){
		g.setColor(new Color (0,232,0));
		g.fillRect(0,400,1000,650);
	}
}
