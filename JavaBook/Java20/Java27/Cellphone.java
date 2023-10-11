package Java27;

class Cellphone {
	String model;
	String color;

	void powerOn() {
		System.out.println("Power On");
	}

	void powerOff() {
		System.out.println("Power Off");
	}

	void bell() {
		System.out.println("Bell ring");
	}

	void sendVoice(String message) {
		System.out.println("Send Message : " + message);
	}

	void receiveVoice(String message) {
		System.out.println("Receive Message : " + message);
	}

	void hangup() {
		System.out.println("Hang up");
	}

	class Dmbcellphone extends Cellphone {
		int channel;

		Dmbcellphone(String model, String color, int channel) {
			this.model = model;
			this.color = color;
			this.channel = channel;
		}

		void thrnOnDmb() {
			System.out.println("channel" + channel + "번 DMB 방송 수신 시작");
		}

		void changeChannelDmb(int channel) {
			System.out.println("channel" + channel + "번으로 변경");
		}

		void thrnOffDmb() {
			System.out.println(" DMB 방송 수신 종료");
		}
	}

}
