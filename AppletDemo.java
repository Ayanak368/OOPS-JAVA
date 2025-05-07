import java.awt.*;
import java.applet.*;
public class AppletDemo extends Applet
{
	public void init()
	{
		setBackground(Color.pink);
		setForeground(Color.yellow);
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome",100,200);
	}
}
	
	/* <applet code=AppletDemo width=400 height=500>
	</applet> */
