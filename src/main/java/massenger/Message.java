package massenger;

import java.util.Date;
import java.util.GregorianCalendar;

public class Message {
    int iD;
    String textMsg;
    Date date;
    public Message(String textMsg, IdMsg idMsg) {
        iD = idMsg.getRepoId();
        this.textMsg = textMsg;
        date = (new GregorianCalendar()).getTime();
    }

    @Override
    public String toString() {
        return "Message{" +
                "iD=" + iD +
                ", textMsg='" + textMsg + '\'' +
                ", date=" + date +
                '}';
    }
}
