import java.applet.*;
import java.awt.*;
/*<applet code=colors.class width=800 height=800></applet>*/
public class colors extends Applet
{
	public void paint(Graphics g)
	{
		Color c1=new Color(255,135,10);
		Color c2=new Color(25,135,200);
	
		g.setColor(c1);
		g.drawLine(40,500,300,400);

		
		g.setColor(c2);
		g.drawLine(40,40,350,70);
	}
}			