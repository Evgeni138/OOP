package lesson6;

import java.util.ArrayList;
import java.util.List;

public class InterfaceSegregation {
    public static void main(String[] args) {
        List<BasePhone> list = new ArrayList<BasePhone>();
        list.add(new IPhone());
        list.add(new Nokia3311());
        for (BasePhone phone: list) {
            phone.call();
        }

        List<Fax> phone2 = new ArrayList<>();//??
        phone2.add(new IPhone());

    }
}

interface BasePhone {
    void call();
    void sendSMS();
}

interface Fax {
    void sendFax();
}

interface EMail {
    void sendEMail();
}

class IPhone implements BasePhone, Fax, EMail {
    @Override
    public void call() {

    }

    @Override
    public void sendSMS() {

    }

    @Override
    public void sendFax() {

    }

    @Override
    public void sendEMail() {

    }
}

class Nokia3311 implements BasePhone {
    @Override
    public void call() {

    }

    @Override
    public void sendSMS() {

    }
}