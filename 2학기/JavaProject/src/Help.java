import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Help {
    public static void main(String[] args) {
        JFrame frame = new JFrame("프로그램 사용법");
        JPanel panel = new JPanel();
        panel.setLayout(null);

        ImageIcon homeimg = new ImageIcon(Main.class.getResource("img/home.png"));
        ImageIcon homeimg_e = new ImageIcon(homeimg.getImage().getScaledInstance(homeimg.getIconWidth()/10,homeimg.getIconHeight()/10,Image.SCALE_DEFAULT));
        JButton home = new JButton(homeimg_e);
        home.setCursor(new Cursor(Cursor.HAND_CURSOR));     //커서 바꾸기
        home.setBackground(Color.decode("#FBE9E7"));
        home.setBorderPainted(false);   //버튼 border 제거
        home.setBounds(50,40,50,50);

        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main m = new Main();
                m.main(args);
                frame.dispose();
            }
        });

        JLabel title = new JLabel("<html>&nbsp;모두의 헤어 사용법</html>");
        title.setFont(new Font("한컴 윤고딕 240",Font.BOLD,48));
        title.setOpaque(true);  //배경색 지정하기 전 해야함
        title.setForeground(Color.WHITE);
        title.setBackground(Color.decode("#FFAB91"));
        title.setBounds(260,50,450,70);

        JLabel how = new JLabel("<html>&nbsp;&nbsp;1. \"머리스타일 추천받기\" 누르세요.<br>" +
                "&nbsp;&nbsp;2. 이름을 입력하고 성별을 선택하세요.<br>" +
                "&nbsp;&nbsp;3. 추천받고 싶은 방법을 선택하여 누르세요.<br>" +
                "&nbsp;&nbsp;4. \"얼굴형별 머리스타일\"을 선택한 경우<br>" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(1) 머리의 어느 부분을 추천받을지 선택하세요.<br>" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(2) 자신의 얼굴형을 선택하세요.<br>" +
                "&nbsp;&nbsp;5. \"얼굴길이별 머리스타일\"을 선택한 경우<br>" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(1) 귀 밑부터 턱끝 길이를 입력하세요.<br>" +
                "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(2) 단발이 어울리는지 장발이 어울리는지 알려줍니다.<br>" +
                "&nbsp;&nbsp;6. 자신의 얼굴형에 어울리는 머리스타일을 알려줍니다.<br>" +
                "</html>");
        how.setFont(new Font("한컴 윤고딕 230",Font.PLAIN,30));
        how.setOpaque(true);
        how.setForeground(Color.WHITE);
        how.setBackground(Color.decode("#FFAB91"));
        how.setBounds(120,160,750,350);

        panel.add(home);
        panel.add(title);
        panel.add(how);
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