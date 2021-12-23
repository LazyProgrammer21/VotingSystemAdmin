package sentmail;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;




public class testTwilio {

	
	public static final String Account_SID="ACbd90da3b88d527950bb4366e1a7e8c83";
	public static final String Auth_Token="956270ad39bb91886bc8703e1fa274e9";
	
	public static void main(String[] args) {
		
		Twilio.init(Account_SID, Auth_Token);
		Message message = Message.creator(
				new PhoneNumber("+9779865457708"),
				new PhoneNumber("+15306257548"),
				"Your code is").create();
				
				System.out.println(message.getSid());
			
	}

}
