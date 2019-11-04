import javax.swing.*;
import java.awt.*;

public class SampleProject {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Components");
        JPanel panel = new JPanel();

        frame.add(panel);

        Dimension frameSize = frame.getSize(); // 프레임 사이즈
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // 모니터 사이즈
        frame.setLocation((screenSize.width - frameSize.width)/4, (screenSize.height - frameSize.height)/5); // 화면 중앙
        frame.setPreferredSize(new Dimension(1000,600));    //프레임 크기
        frame.setResizable(false);  //프레임 크기 조절 불가

        panel.setBackground(Color.decode("#FBE9E7"));   //패널 배경색
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
