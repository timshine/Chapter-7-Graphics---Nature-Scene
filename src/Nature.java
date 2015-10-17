import java.awt.*;
public class Nature {
	

	
	public static void drawClouds(Graphics g){
		g.setColor(new Color(255,255,255));
		for(int k = 0; k<3; k++){
			int x = (int)(Math.random()*200) + 500;
			int y = (int)(Math.random()*125 + 20);
			g.fillOval(x, y, 50, 25);
			
		}
		g.fillOval(250,15,50,25);
		g.fillOval(50,30,50,25);
		
		
		
	}
	
	public static void drawPath(Graphics g){
		Polygon path = new Polygon();
		g.setColor(new Color (255,255,255));
		path.addPoint(200,400);
		path.addPoint(400, 650);
		path.addPoint(750, 650);
		path.addPoint(275,400);
		g.fillPolygon(path);
	}
	
	
}
