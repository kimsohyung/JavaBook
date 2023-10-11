package Java66;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;


public class ButtonTest1 extends WindowAdapter{
	private Frame f;
	private Button b;
	
	public ButtonTest1() {
		f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		
		b = new Button("확인");
		b.setSize(100, 50);
		b.setLocation(100, 75);
		
		f.add(b);
		f.setVisible(true);
	}
}