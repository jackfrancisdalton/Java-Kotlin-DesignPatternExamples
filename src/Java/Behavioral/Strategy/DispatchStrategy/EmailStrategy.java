package Java.Behavioral.Strategy.DispatchStrategy;

import Java.Behavioral.Strategy.Message;

/**
 * Created by Jack F. Dalton on 0029 29 08 2016.
 */
public class EmailStrategy implements DispatchStrategy {
    @Override
    public void send(Message message) {
        System.out.println("Message sent to " + message.getReceivingUserDetails().getFullName() + " via email");
        System.out.println("Content: " + message.getContent());
        System.out.println("Send Timestamp: " + message.getDateTimeSent() + "\n");
    }
}
