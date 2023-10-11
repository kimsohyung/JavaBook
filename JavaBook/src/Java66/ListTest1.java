package Java66;

import java.awt.Frame;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListTest1 extends WindowAdapter{
	
	public void wimdowClosing(WindowEvent e) {
		System.exit(0);
	}
	

	public static void main(String[] args) {
		Frame f = new Frame("List - Select");
		f.setSize(300, 300);
		f.setLayout(null);

		List selectOne = new List(6);
		selectOne.setLocation(20, 40);
		selectOne.setSize(100, 120);
		selectOne.add("Student");
		selectOne.add("Teacher");
		selectOne.add("Driver");
		selectOne.add("Computer Programmer");
		selectOne.add("Sales Man");
		selectOne.add("Musician");
		selectOne.add("Director");

		List selectMamy = new List(6, true);
		selectMamy.setLocation(150, 40);
		selectMamy.setSize(100, 120);
		selectMamy.add("Student");
		selectMamy.add("Teacher");
		selectMamy.add("Driver");
		selectMamy.add("Computer Programmer");
		selectMamy.add("Sales Man");
		selectMamy.add("Musician");
		selectMamy.add("Director");

		f.add(selectOne);
		f.add(selectMamy);
		f.setVisible(true);

	}

}
