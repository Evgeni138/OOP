package lesson6;

import java.util.ArrayList;

public class Id {

    public static void main(String[] args) {
        // User user1 = //new User(123, "Р’Р°СЃСЏ");
        var re = new Repo();
        var re1 = new Repo2();
        User user2 = UserCreater.getCreater(re)
                .CreateUser("Max");
        User user3 = UserCreater.getCreater(new Repo2())
                .CreateUser("Anna");

        System.out.println(user2 + " " + user3);
        System.out.println(re);
        System.out.println(re1);

    }
}

class User {
    int id;
    String fistName;

    public User(int id, String fistName) {
        this.id = id;
        this.fistName = fistName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fistName='" + fistName + '\'' +
                '}';
    }
}

class UserCreater {

    static private UserCreater Creater;
    private Repository repo;

//    public void setRepo(Repository repo) {
//        this.repo = repo;
//    }

    public static UserCreater getCreater(Repository repo) {
        if (Creater == null)
            Creater = new UserCreater(repo);
        return Creater;
    }

    public User CreateUser(String fistName) {
        int id = repo.getLastId();
        return new User(id, fistName);
    }

    private UserCreater(Repository repository) {
        this.repo = repository;
    }
}

interface Repository {
    public int getLastId();
}

class Repo implements Repository {
    ArrayList<Integer> liId = new ArrayList<>();

    public int getLastId() {
        if (liId.size() > 0) {
            int idx = liId.get(liId.size() - 1);
            liId.add(++idx);
            return idx;
        } else {
            liId.add(1);
            return 1;
        }
    }
}

class Repo2 implements Repository {
    ArrayList<Integer> liId = new ArrayList<>();

    public int getPremiumLastId() {

        return 777;// liId.Max();
    }

    public int getLastId() {

        return 1312312;// liId.Max();
    }
}

class Repo3 implements Repository {
    ArrayList<Integer> liId = new ArrayList<>();

    public int getUserId(int id) {

        liId.add(id);
        return id;// liId.Max();
    }

    public int getLastId() {

        return 1312312;// liId.Max();
    }

}
