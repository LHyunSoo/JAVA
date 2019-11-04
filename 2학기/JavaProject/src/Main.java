import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("모두의 헤어");
        JPanel panel = new JPanel();
        panel.setLayout(null);

        ImageIcon mainimg = new ImageIcon(Main.class.getResource("img/main.png"));
        ImageIcon mainimg_e = new ImageIcon(mainimg.getImage().getScaledInstance((int)((double)mainimg.getIconWidth()/2.5),(int)((double)mainimg.getIconHeight()/2.5),Image.SCALE_DEFAULT));
        JLabel mlbi = new JLabel(mainimg_e);
        mlbi.setBounds(100,80,220,250);

        JLabel title = new JLabel("모(毛)두(頭)의 헤어");
        title.setFont(new Font("한컴 윤고딕 240",Font.BOLD,40));
        title.setBounds(350,25,600,300);
        JLabel mean = new JLabel();
        mean.setText("<html> : 모발 모(毛)와 머리 두(頭)를 합쳐,<br>머리스타일을 모든 사람들에게 추천해 준다는 것을 의미</html>");
        mean.setFont(new Font("한컴 윤고딕 240",Font.PLAIN,22));
        mean.setBounds(350,100,600,300);

        JButton recom = new JButton("<html><center>머리스타일<br>추천받기</center></html>");
        recom.setFont(new Font("한컴 윤고딕 240",Font.BOLD,20));
        recom.setBackground(Color.decode("#FFAB91"));
        recom.setBounds(210,360,200,70);
        JButton help = new JButton("프로그램 사용법");
        help.setFont(new Font("한컴 윤고딕 240",Font.BOLD,20));
        help.setBackground(Color.decode("#FFAB91"));
        help.setBounds(580,360,200,70);

        help.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        panel.add(mlbi);
        panel.add(title);
        panel.add(mean);
        panel.add(recom);
        panel.add(help);
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
