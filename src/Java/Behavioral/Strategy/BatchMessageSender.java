package Java.Behavioral.Strategy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BatchMessageSender {

    private List<Message> messageList;

    public BatchMessageSender() {
        messageList = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messageList.add(message);
    }

    public void addMessage(List<Message> messages) {
        messageList.addAll(messages);
    }

    public void sendBatch() {
        Calendar calendar = Calendar.getInstance();

        for (Message m : messageList) {
            m.setDateTimeSent(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(calendar.getTime()));
            m.getDispatchStrategy().send(m);
        }
    }
}
