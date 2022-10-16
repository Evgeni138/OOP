package massenger;


public class Program {
    public static void main(String[] args) {
        IdUser idUser = new IdUser();
        IdMsg idMsg = new IdMsg();
        User user1 = new User("1user", idUser);
        User user2 = new User("2user", idUser);
        User user3 = new User("3user", idUser);
        Chat chat1 = user1.creatChat("Chat1");
        user2.logInChat(chat1);
        user3.logInChat(chat1);
        user2.createMsg("text1", chat1, idMsg);
        user2.createMsg("text2", chat1, idMsg);
        user1.createMsg("text3", chat1, idMsg);

        System.out.println(user1);
        System.out.println("User3 Unread: " + user3.notReadMessages);
        System.out.println("User1 Unread: " + user1.notReadMessages);
        user1.readAllMsg(user1.notReadMessages);
        user3.readAllMsg(user3.notReadMessages);
        System.out.println("User3 Unread: " + user3.notReadMessages);
        System.out.println(chat1);
        user1.createMsg("text4", chat1, idMsg);
        user1.createMsg("text5", chat1, idMsg);

        System.out.println(user3.notReadMessages);
        user3.readAllMsg(user3.notReadMessages);
        user1.createMsg("text6", chat1, idMsg);
        user1.createMsg("text7", chat1, idMsg);
        System.out.println(user3.notReadMessages);
        System.out.println(user2.notReadMessages);

    }
}
