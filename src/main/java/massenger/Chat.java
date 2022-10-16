package massenger;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    String chatName;
    List<User> listUser;
    List<Message> allMessages;

    public Chat(String chatName) {
        this.chatName = chatName;
        listUser = new ArrayList<>();
        allMessages = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Chat: " + chatName + " {" + "AllMessages= " + allMessages +
                '}';
    }
}
