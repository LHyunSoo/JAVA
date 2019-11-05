import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Info {
    public static void main(String[] args) {
        JFrame frame = new JFrame("정보 입력 화면");
        JPanel panel = new JPanel();
        panel.setLayout(null);

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
                Main m = new Main();
                m.main(args);
                frame.dispose();
            }
        });

        JLabel title = new JLabel("<html>정보를 입력해주세요!</html>");
        title.setFont(new Font("한컴 윤고딕 240",Font.BOLD,40));
        title.setOpaque(true);  //배경색 지정하기 전 해야함
        title.setForeground(Color.WHITE);
        title.setBackground(Color.decode("#FFAB91"));
        title.setBounds(300,100,380,60);

        JLabel lbname = new JLabel("이름");
        lbname.setFont(new Font("한컴 윤고딕 240",Font.PLAIN,30));
        lbname.setBounds(250,250,70,40);

        JTextField tfname = new JTextField("JTextField");
        tfname.setText("이름을 입력해주세요.");
        tfname.setFont(new Font("한컴 윤고딕 230",Font.PLAIN,25));
        tfname.setForeground(Color.gray);
        tfname.setBounds(400,250,350,40);

        tfname.addFocusListener(new FocusListener() {    //관심받기
            @Override
            public void focusGained(FocusEvent e) {
                if(tfname.getText().equals("이름을 입력해주세요.")){
                    tfname.setText("");
                    tfname.setForeground(Color.black);
                }
            }
            //다른 곳을 클릭했을 때
            @Override
            public void focusLost(FocusEvent e) {           //관심잃기
                //tfname이 비어있을 때
                if(tfname.getText().equals("")) {
                    tfname.setText("이름을 입력해주세요.");
                }
            }
        });

        JLabel lbgender = new JLabel("성별");
        lbgender.setFont(new Font("한컴 윤고딕 240",Font.PLAIN,30));
        lbgender.setBounds(250,370,70,40);

        JRadioButton rdw = new JRadioButton("<html>&nbsp;여자</html>");
        rdw.setFont(new Font("한컴 윤고딕 240",Font.PLAIN,25));
        JRadioButton rdm = new JRadioButton("<html>&nbsp;남자</html>");
        rdm.setFont(new Font("한컴 윤고딕 240",Font.PLAIN,25));
        rdw.setOpaque(true);
        rdm.setOpaque(true);
        rdw.setBackground(Color.decode("#FBE9E7"));
        rdm.setBackground(Color.decode("#FBE9E7"));
        rdw.setBounds(420,370,90,40);
        rdm.setBounds(610,370,90,40);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdw);
        buttonGroup.add(rdm);
        rdw.setSelected(true);  //Default 선택 "여자"

        JButton next = new JButton("다음");
        next.setFont(new Font("한컴 윤고딕 240",Font.BOLD,20));     //font
        next.setCursor(new Cursor(Cursor.HAND_CURSOR));     //커서 바꾸기
        next.setBorderPainted(false);   //버튼 border 제거
        next.setBackground(Color.decode("#FFAB91"));    //버튼 색
        next.setBounds(780,450,120,60);     //버튼 위치

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RecomWay rw = new RecomWay();
                rw.main(args);
                frame.dispose();    //현재 창 닫기
            }
        });

        panel.add(back);
        panel.add(lbname);
        panel.add(tfname);
        panel.add(lbgender);
        panel.add(rdw);
        panel.add(rdm);
        panel.add(next);
        panel.add(title);
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