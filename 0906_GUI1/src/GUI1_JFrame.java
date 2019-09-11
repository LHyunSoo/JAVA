import javax.swing.*;
import java.awt.*;

public class GUI1_JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창 이름");
        Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
        int 화w = dimen.width;
        int 화h = dimen.height;
        int 창w = 400;
        int 창h = 200;

        frame.setPreferredSize(new Dimension(창w,창h));
        frame.setLocation((화w-창w)/2,(화h-창h)/2);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("어쩌다 금요일 ㄱㅇㄷ");
        JButton button = new JButton("오늘 회식감");

        panel.add(label);
        panel.add(button);
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //그냥 끄겠다
    }
}
