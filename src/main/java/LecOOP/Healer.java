package LecOOP;

public class Healer extends BaseHero {
    private int potion;
    private int maxPotion;

    public Healer() {
        super(String.format("Hero_Healer #%d", ++Healer.number),
                Healer.r.nextInt(100, 200));
        this.maxPotion = Healer.r.nextInt(50, 150);
        this.potion = maxPotion;
    }

    public String getInfo() {
        return String.format("%s Potion: %d", super.getInfo(), this.potion);
    }
}
