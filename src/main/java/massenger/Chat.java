package massenger;

import java.util.ArrayList;
import java.util.List;
// Описывается класс Chat
public class Chat {
    String chatName;
    List<User> listUser;
    List<Message> allMessages;

    // Описывается конструктор Chat
    public Chat(String chatName) {
        this.chatName = chatName;
        listUser = new ArrayList<>(); // Создается список пользователей, которые участвуют в чате
        allMessages = new ArrayList<>(); // Создается общий список сообщений
    }

    // Переопределяется метод toString
    @Override
    public String toString() {
        return "Chat: " + chatName + " {" + "AllMessages= " + allMessages +
                '}';
    }
}
