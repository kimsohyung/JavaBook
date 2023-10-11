package Java62;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class BroderTest {
	private Frame frame;
	private Button center, west, east, south;
	private TextField tf1;

	public BroderTest() {
		frame = new Frame("BorderLayout example");
		south = new Button("Button 1");
		west = new Button("Button 2");
		east = new Button("Button 3");
		center = new Button("Button 4");
		tf1 = new TextField();
		tf1.setText("입력창 입니다.");

	}

	public void startFeame() {
		frame.add(tf1, "North");
		frame.add(south, "South");
		frame.add(west, "West");
		frame.add(east, "East");
		frame.add(center, "Center");

		frame.setSize(400, 400);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		BroderTest border = new BroderTest();
		border.startFeame();
	}
}
