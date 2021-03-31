import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class HelloWorld {
    public static final String ACCOUNT_SID = "AC5e070a2e87728ddf8a074ec08929ba61";
    public static final String AUTH_TOKEN = "4ca4fe9369957206640525968d6c0b94";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        
        //send helloWorld SMS message
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("+12403095733"),
                new com.twilio.type.PhoneNumber("+16672958342"),
                "Hello, World!")
            .create();

        System.out.println(message.getSid());
    }
}
