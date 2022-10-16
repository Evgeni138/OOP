package lesson6;

import java.util.ArrayList;
import java.util.List;

public class Id2 {
    public static void main(String[] args) {
        Repos rep = new Repos();
        User2 user1 = UserCreater2.createUser("Petr1", rep);
        User2 user2 = UserCreater2.createUser("Petr2", rep);
        User2 user3 = UserCreater2.createUser("Petr3", rep);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(rep.listId);
        for (int idx: rep.listId) {
            System.out.println(idx);
        }
    }
}

class User2 {
    int iD;
    String name;
    User2 (int iD, String name) {
        this.iD = iD;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User2{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                '}';
    }
}

class UserCreater2 {
    public Repos repos;
    static User2 createUser(String name, Repos repos) {
        int id = repos.getRepoId();
        return new User2(id, name);
    }
}

class Repos {
    List<Integer> listId = new ArrayList<>();

    public int getRepoId () {
        if (listId.size() > 0) {
            int idx = listId.get(listId.size() - 1);
            listId.add(++idx);
            return idx;
        }
        else {
            listId.add(1);
            return 1;
        }
    }

}