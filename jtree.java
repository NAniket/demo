import javax.swing.*;
import java.applet.*;
import java.awt.*;
import javax.swing.tree.*;
public class jtree extends JApplet
{
	Container co;
	JTree j;
	public void init()
	{
		co=getContentPane();
		co.setLayout(new BorderLayout());
	
		DefaultMutableTreeNode top=new DefaultMutableTreeNode("root");
		
		DefaultMutableTreeNode d1=new DefaultMutableTreeNode("vegitables");
		DefaultMutableTreeNode d2=new DefaultMutableTreeNode("fruits");
	
		top.add(d1);
		top.add(d2);
	
		DefaultMutableTreeNode a1=new DefaultMutableTreeNode("capscium");
		DefaultMutableTreeNode a2=new DefaultMutableTreeNode("carrot");
		
		DefaultMutableTreeNode b1=new DefaultMutableTreeNode("banana");
		DefaultMutableTreeNode b2=new DefaultMutableTreeNode("mango");

		d1.add(a1);
		d1.add(a2);
		
		d2.add(b1);
		d2.add(b2);
	
		j=new JTree(top);
		co.add(j);
	}
}
/*<applet code=jtree.class width=800 height=800></applet>*/