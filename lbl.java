import java.awt.*;
import java.applet.*;
public class lbl extends Applet
{
	Label l1,l2;
	public void init()
	{
		setLayout(null);
		l1=new Label("aniket");
		l1.setBounds(10,20,60,80);

		l2=new Label("ani");
		l2.setBounds(100,200,60,80);
		
		add(l1);
		add(l2);
	}
}
/*<applet code=lbl.class width=800 height=800></applet>*/