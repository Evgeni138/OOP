package lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonUI {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Form1 form = new Form1();
        form.setVisible(true);
    }
}

class Form1 extends JFrame {
    private JButton btn = new JButton("Тык");

    public Form1() {
        super("Р¤РѕСЂРјР° 1");
        this.setBounds(0, 0, 200, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container co = this.getContentPane();
        btn.addActionListener(new BtnClick());
        co.add(btn);
    }

    class BtnClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String msg = "hello world";
            JOptionPane.showMessageDialog(null, msg, "РўРє", WIDTH);
        }
    }
}
