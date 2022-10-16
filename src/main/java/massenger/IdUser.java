package massenger;

// Описывается класс IdUser, счетчик пользователей
import java.util.ArrayList;
import java.util.List;

public class IdUser {
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

