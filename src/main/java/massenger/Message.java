package massenger;

import java.util.Date;
import java.util.GregorianCalendar;
// Описывается класс Message
public class Message {
    int iD;
    String textMsg;
    Date date;
    String auth;

    // Описывается конструктор Message
    public Message(String textMsg, IdMsg idMsg, String auth) {
        iD = idMsg.getRepoId();
        this.textMsg = textMsg;
        this.auth = auth;
        date = (new GregorianCalendar()).getTime();
    }

    // Переопределяется метод toString
    @Override
    public String toString() {
        return "Message{" +
                "iD=" + iD +
                ", textMsg='" + textMsg + '\'' +
                ", date=" + date +
                ", author= " + auth +
                '}';
    }
}
