package lesson6;

public class OpenClose {
    public static void main(String[] args) {
        System.out.println(new BaseClient().getDiscount(100));
        System.out.println(new SilverClient().getDiscount(100));
        System.out.println(new VIPClient().getDiscount(100));
        System.out.println(new BlackFriday().getDiscount(100));
        System.out.println(new Promo().promDiscount(new BaseClient().getDiscount(100)));
    }
}
class Promo {
    public double promDiscount(double price){
        return price * 0.5;
    }
}
class BaseClient {
    public double getDiscount(double price) {
        return price * 0.95;
    }
}

class SilverClient extends BaseClient {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.95;
    }
}

class VIPClient extends SilverClient{
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.95;
    }
}

class BlackFriday extends BaseClient {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price)*0.5;
    }
}