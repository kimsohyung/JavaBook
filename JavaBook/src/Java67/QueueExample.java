package Java67;

import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "김자바"));
		messageQueue.offer(new Message("sendKAKAoTalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
			break;
			case "sendSMS":
				System.out.println(message.to + "님에게 sms을 보냅니다.");
			break;case "sendKAKAoTalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
			break;
			
			
			}
		}
		
	}

}
