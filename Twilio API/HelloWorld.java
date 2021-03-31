import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class HelloWorld {
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

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
