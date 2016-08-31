package Java.Behavioral.Strategy;


import Java.Behavioral.Strategy.DispatchStrategy.EmailStrategy;
import Java.Behavioral.Strategy.DispatchStrategy.PrivateMessageStrategy;
import Java.Behavioral.Strategy.DispatchStrategy.SMSStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserDetails me = new UserDetails("Jack Dalton", new SMSStrategy());

        UserDetails ed = new UserDetails("Ed Woollard", new EmailStrategy());
        UserDetails luke = new UserDetails("Luke Sapiets", new PrivateMessageStrategy());
        UserDetails jon = new UserDetails("Jon Weastwood", new SMSStrategy());

        BatchMessageSender batchMessageSender = new BatchMessageSender();

        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Hello man this is the first message", "", me, ed));
        messages.add(new Message("Hello man this is the second message", "", me, luke));
        messages.add(new Message("Hello man this is the third message", "", me, jon));

        batchMessageSender.addMessage(messages);
        batchMessageSender.sendBatch();
    }
}
