package Java.Behavioral.Strategy.DispatchStrategy;

import Java.Behavioral.Strategy.Message;

public class SMSStrategy implements DispatchStrategy {
    @Override
    public void send(Message message) {
        System.out.println("Message sent to " + message.getReceivingUserDetails().getFullName() + " via SMS");
        System.out.println("Content: " + message.getContent());
        System.out.println("Send Timestamp: " + message.getDateTimeSent() + "\n");
    }
}
