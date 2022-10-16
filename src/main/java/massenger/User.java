package massenger;

import java.util.LinkedList;
import java.util.Queue;
// Описывается класс User
public class User {
    public int iD;
    String nameUser;
    public Queue<Integer> notReadMessages;
    IdUser idUser;
    // Описывается конструктор User
    public User(String nameUser, IdUser idUser) {
        iD = idUser.getRepoId();
        this.nameUser = nameUser;
        notReadMessages = new LinkedList<>();
    }
// Описывется метод создания нового чата
    public Chat creatChat(String chatName) {
        Chat chat = new Chat("Chat1");
        chat.listUser.add(this);
        return chat;
    }

    // Описывется метод подключения к чату
    public void logInChat(Chat chat) {
        chat.listUser.add(this);
    }

    // Описывется метод создания сообщения
    public void createMsg(String text, Chat chat, IdMsg idMsg) {

        Message newMsg = new Message(text, idMsg, this.nameUser);
        chat.allMessages.add(newMsg);
        System.out.println(this.nameUser + " send new message: " + text);
        for (User user : chat.listUser) {
            if (user.iD != this.iD) {
                user.notReadMessages.add(newMsg.iD);
            }
        }
        if (this.notReadMessages.size() > 0)
            this.readAllMsg(this.notReadMessages);
    }

    // Описывется метод чтения сообщения
    public Queue<Integer> readAllMsg(Queue<Integer> notReadMessages) {
        if (this.notReadMessages.size() > 0) {
            notReadMessages.clear();
            System.out.println(this.nameUser + " has read all the messages");
        } else System.out.println(this.nameUser + ": You don`t have any unread");
        return notReadMessages;
    }

    // Переопределяется метод toString
    @Override
    public String toString() {
        return "User{" +
                "idUser= " + iD +
                ", nameUser= " + nameUser +
                ", notReadMessages= " + notReadMessages +
                '}';
    }
}
