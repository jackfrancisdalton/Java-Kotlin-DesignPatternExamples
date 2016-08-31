package Java.Behavioral.Strategy;

import Java.Behavioral.Strategy.DispatchStrategy.DispatchStrategy;

public class Message {

    private String content;
    private String dateTimeSent;
    private UserDetails sendingUserDetails;
    private UserDetails receivingUserDetails;
    private DispatchStrategy dispatchStrategy;

    public Message(String content, String dateTimeSent, UserDetails sendingUserDetails, UserDetails receivingUserDetails, DispatchStrategy dispatchStrategy) {
        this.content = content;
        this.dateTimeSent = dateTimeSent;
        this.sendingUserDetails = sendingUserDetails;
        this.receivingUserDetails = receivingUserDetails;
        this.dispatchStrategy = dispatchStrategy;
    }

    public Message(String content, String dateTimeSent, UserDetails sendingUserDetails, UserDetails receivingUserDetails) {
        this(content, dateTimeSent, sendingUserDetails, receivingUserDetails, receivingUserDetails.getPreferedFormOfContact());
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDateTimeSent() {
        return dateTimeSent;
    }

    public void setDateTimeSent(String dateTimeSent) {
        this.dateTimeSent = dateTimeSent;
    }

    public UserDetails getSendingUserDetails() {
        return sendingUserDetails;
    }

    public void setSendingUserDetails(UserDetails sendingUserDetails) {
        this.sendingUserDetails = sendingUserDetails;
    }

    public UserDetails getReceivingUserDetails() {
        return receivingUserDetails;
    }

    public void setReceivingUserDetails(UserDetails receivingUserDetails) {
        this.receivingUserDetails = receivingUserDetails;
    }

    public DispatchStrategy getDispatchStrategy() {
        return dispatchStrategy;
    }

    public void setDispatchStrategy(DispatchStrategy dispatchStrategy) {
        this.dispatchStrategy = dispatchStrategy;
    }
}
