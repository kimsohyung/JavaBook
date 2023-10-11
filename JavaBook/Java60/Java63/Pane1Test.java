package Java63;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class Pane1Test {
	private Frame f;
	private Panel p;
	private Button ok, cancel;
	private TextField tf1;
	
	public Pane1Test() {
		f = new Frame("Pane1 example");
		ok = new Button("전송");
		cancel = new Button("삭제");
		tf1 = new TextField("Input ...");
		p = new Panel();
	}
	
	public void startFrame() {
		f.add(tf1, BorderLayout.NORTH);
		p.setBackground(Color.blue);
		p.add(ok);
		p.add(cancel);
		f.add(p, BorderLayout.CENTER);
		
		f.setSize(400,400);
		f.setVisible(true);
	
	}

	
	public static void main(String[] args) {
		Pane1Test g = new Pane1Test();
		g.startFrame();
		
	}

}