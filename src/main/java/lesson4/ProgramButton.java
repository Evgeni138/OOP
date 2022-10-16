package lesson4;

import java.util.ArrayList;

public class ProgramButton {
    public static void main(String[] args) {
        Frame form = new Frame("NewUI");
        form.setBounds(0, 0, 200, 100);
        Button1 btn = new Button1("Hello world");
        Button1 btn2 = new Button1("hello world 2");
        btn.addActionListener(new BtnClick());
        btn2.addActionListener(new BtnClick2());

        form.addComponent(btn);
        form.addComponent(btn2);

        btn.click();
        btn2.click();
        btn.click();
        btn.click();
        btn2.click();



    }
}

interface Action {
    void actionPerformed();
}

interface ButtonClickAction extends Action { // ?
}

abstract class Component {
    String text;

    protected int width;
    protected int height;
    protected int top;
    protected int left;
    protected ArrayList<Action> actions; // ??

    public Component(String text) {
        this.text = text;
        actions = new ArrayList<>();
    }

    public void setBounds(int top, int left, int width, int height) {
        this.width = width;
        this.height = height;
        this.top = top;
        this.left = left;
    }

    public void addActionListener(Action action) { // ???
        actions.add(action);
    }

    public void click() { // ????
    }
}

class Frame extends Component {

    private ArrayList<Component> components;

    public Frame(String text) {
        super(text);
        components = new ArrayList<>();
    }

    public void addComponent(Component c) {
        if (c == this)
            new Exception();
        components.add(c);
    }
}

class Button1 extends Component {

    public Button1(String text) {
        super(text);
    }

    @Override
    public void click() {
        for (Action action : actions) {
            if (action instanceof ButtonClickAction) {
                action.actionPerformed();
            }
        }
    }

}

class BtnClick implements ButtonClickAction {

    @Override
    public void actionPerformed() {
        String msg = "hello world";
        System.out.println(msg);
    }

}

class BtnClick2 implements ButtonClickAction {

    @Override
    public void actionPerformed() {
        String msg = "hello world 2";
        System.out.println(msg);
    }
}
