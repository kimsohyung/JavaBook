package Java66;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest extends WindowAdapter implements ActionListener{
	private Frame f;
	private Button b;
	
	public ButtonTest() {
		f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		
		b = new Button("확인");
		b.setSize(100, 50);
		b.setLocation(100, 75);
		b.addActionListener(this);
		
		f.addWindowListener(this);
		f.add(b);
		f.setVisible(true);
	}


	public static void main(String[] args) {

		ButtonTest bt = new ButtonTest();
	
	}
	

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed()");
		b.setLabel("취소");
	}

}
