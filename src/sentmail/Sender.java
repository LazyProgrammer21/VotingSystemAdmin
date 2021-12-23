package sentmail;

import java.io.IOException;

public class Sender {
	public static void main(String[] args) throws IOException {
		TestGmail tg = new TestGmail();
		tg.Send();
		
	}
}
