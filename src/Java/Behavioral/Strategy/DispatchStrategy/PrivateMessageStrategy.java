package Java.Behavioral.Strategy.DispatchStrategy;

import Java.Behavioral.Strategy.Message;

public class PrivateMessageStrategy implements DispatchStrategy {
    @Override
    public void send(Message message) {
        System.out.println("Message sent to " + message.getReceivingUserDetails().getFullName() + " via private message");
        System.out.println("Content: " + message.getContent());
        System.out.println("Send Timestamp: " + message.getDateTimeSent() + "\n");
    }
}