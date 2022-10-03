package lesson4;

public abstract class Button {
    private String name;
    private Integer positionX;
    private Integer positionY;
    private Integer demensionsX;
    private Integer demensionsY;
    private String cond;

    public Button(String name,
                  Integer positionX,
                  Integer positionY,
                  Integer demensionsX,
                  Integer demensionsY)
    {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.demensionsY = demensionsX;
        this.demensionsY = demensionsY;

    };


    public String getName() {
        return name;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public Integer getDemensionsX() {
        return demensionsX;
    }

    public Integer getDemensionsY() {
        return demensionsY;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    public void setDemensionsX(Integer demensionsX) {
        this.demensionsX = demensionsX;
    }

    public void setDemensionsY(Integer demensionsY) {
        this.demensionsY = demensionsY;
    }

    public void printHello(int count){
        if (count == 1) System.out.println("Hello");
        else System.out.println("Press 1");
    }
}
