import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExam {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        Button b1 = new Button("버튼");
        JPanel p = new JPanel();
        p.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        f.add(p);
        f.setSize(300,150);
        f.setVisible(true);
    }
}
