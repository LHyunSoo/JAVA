import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecomWay {
    public static void main(String[] args) {
        JFrame frame = new JFrame("헤어스타일 추천 방법");
        JPanel panel = new JPanel();
        panel.setLayout(null);  //layout null

        ImageIcon backimg = new ImageIcon(Main.class.getResource("img/back.png"));
        ImageIcon backimg_e = new ImageIcon(backimg.getImage().getScaledInstance(backimg.getIconWidth()/11,backimg.getIconHeight()/11,Image.SCALE_DEFAULT));
        JButton back = new JButton(backimg_e);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));     //커서 바꾸기
        back.setBackground(Color.decode("#FBE9E7"));
        back.setBorderPainted(false);   //버튼 border 제거
        back.setBounds(50,40,50,50);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Info f = new Info();
                f.main(args);
                frame.dispose();
            }
        });

        ImageIcon homeimg = new ImageIcon(Main.class.getResource("img/home.png"));
        ImageIcon homeimg_e = new ImageIcon(homeimg.getImage().getScaledInstance(homeimg.getIconWidth()/10,homeimg.getIconHeight()/10,Image.SCALE_DEFAULT));
        JButton home = new JButton(homeimg_e);
        home.setCursor(new Cursor(Cursor.HAND_CURSOR));     //커서 바꾸기
        home.setBackground(Color.decode("#FBE9E7"));
        home.setBorderPainted(false);   //버튼 border 제거
        home.setBounds(105,40,50,50);

        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main m = new Main();
                m.main(args);
                frame.dispose();
            }
        });

        JLabel title = new JLabel("<html>추천 방법을 선택해주세요!</html>");
        title.setFont(new Font("한컴 윤고딕 240",Font.BOLD,40));
        title.setOpaque(true);  //배경색 지정하기 전 해야함
        title.setForeground(Color.WHITE);
        title.setBackground(Color.decode("#FFAB91"));
        title.setBounds(260,100,470,60);

        ImageIcon faceshapeimg = new ImageIcon(Main.class.getResource("img/faceshape.png"));
        ImageIcon faceshapeimg_e = new ImageIcon(faceshapeimg.getImage().getScaledInstance(faceshapeimg.getIconWidth()/3,faceshapeimg.getIconHeight()/3,Image.SCALE_DEFAULT));
        JLabel faceshape = new JLabel(faceshapeimg_e);
        faceshape.setBounds(230,210,180,180);

        ImageIcon lengthimg = new ImageIcon(Main.class.getResource("img/length.png"));
        ImageIcon lengthimg_e = new ImageIcon(lengthimg.getImage().getScaledInstance(lengthimg.getIconWidth()/3,lengthimg.getIconHeight()/3,Image.SCALE_DEFAULT));
        JLabel length = new JLabel(lengthimg_e);
        length.setBounds(580,210,180,180);

        JButton recomFaceshape = new JButton("얼굴형별 헤어스타일");
        recomFaceshape.setFont(new Font("한컴 윤고딕 240",Font.BOLD,20));     //font
        recomFaceshape.setCursor(new Cursor(Cursor.HAND_CURSOR));     //커서 바꾸기
        recomFaceshape.setBorder(new MatteBorder(3,3,3,3,(Color.decode("#FF8A65"))));   //버튼 border 굵기와 색 설정
        recomFaceshape.setBackground(Color.decode("#FBE9E7"));    //버튼 배경색
        recomFaceshape.setBounds(210,420,210,70);    //버튼 위치

        recomFaceshape.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FaceShape fs = new FaceShape(0);
                fs.main(args);
                frame.dispose();
            }
        });

        JButton recomLength = new JButton("얼굴길이별 헤어스타일");
        recomLength.setFont(new Font("한컴 윤고딕 240",Font.BOLD,20));     //font
        recomLength.setCursor(new Cursor(Cursor.HAND_CURSOR));     //커서 바꾸기
        recomLength.setBorder(new MatteBorder(3,3,3,3,(Color.decode("#FF8A65"))));   //버튼 border 굵기와 색 설정
        recomLength.setBackground(Color.decode("#FBE9E7"));    //버튼 배경색
        recomLength.setBounds(560,420,230,70);    //버튼 위치

        recomLength.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Length l = new Length();
                l.main(args);
                frame.dispose();
            }
        });

        panel.add(back);
        panel.add(home);
        panel.add(title);
        panel.add(faceshape);
        panel.add(length);
        panel.add(recomFaceshape);
        panel.add(recomLength);
        frame.add(panel);

        Dimension frameSize = frame.getSize(); // 프레임 사이즈
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // 모니터 사이즈
        frame.setLocation((screenSize.width - frameSize.width)/4, (screenSize.height - frameSize.height)/5); // 화면 중앙
        frame.setPreferredSize(new Dimension(1000,600));    //프레임 크기
        frame.setResizable(false);  //프레임 크기 조절 불가

        panel.setBackground(Color.decode("#FBE9E7"));   //배경색
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
