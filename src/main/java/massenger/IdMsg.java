package massenger;

import java.util.ArrayList;
import java.util.List;
// Описывается класс IdMsg, счетчик сообщений
public class IdMsg {
    List<Integer> listMsg = new ArrayList<>();

    public int getRepoId () {
        if (listMsg.size() > 0) {
            int idx = listMsg.get(listMsg.size() - 1);
            listMsg.add(++idx);
            return idx;
        }
        else {
            listMsg.add(1);
            return 1;
        }
    }
}
