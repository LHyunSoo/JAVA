import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Length {
    public static void main(String[] args) {
        JFrame frame = new JFrame("얼굴형 선택");
        JPanel panel = new JPanel();
        panel.setLayout(null);  //layout null

        ImageIcon backimg = new ImageIcon(Main.class.getResource("img/back.png"));
        ImageIcon backimg_e = new ImageIcon(backimg.getImage().getScaledInstance(backimg.getIconWidth() / 11, backimg.getIconHeight() / 11, Image.SCALE_DEFAULT));
        JButton back = new JButton(backimg_e);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));     //커서 바꾸기
        back.setBackground(Color.decode("#FBE9E7"));
        back.setBorderPainted(false);   //버튼 border 제거
        back.setBounds(50, 40, 50, 50);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RecomWay rw = new RecomWay();
                rw.main(args);
                frame.dispose();
            }
        });

        ImageIcon homeimg = new ImageIcon(Main.class.getResource("img/home.png"));
        ImageIcon homeimg_e = new ImageIcon(homeimg.getImage().getScaledInstance(homeimg.getIconWidth() / 10, homeimg.getIconHeight() / 10, Image.SCALE_DEFAULT));
        JButton home = new JButton(homeimg_e);
        home.setCursor(new Cursor(Cursor.HAND_CURSOR));     //커서 바꾸기
        home.setBackground(Color.decode("#FBE9E7"));
        home.setBorderPainted(false);   //버튼 border 제거
        home.setBounds(105, 40, 50, 50);

        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main m = new Main();
                m.main(args);
                frame.dispose();
            }
        });

        JLabel lblength = new JLabel("길이를 입력해주세요!");
        lblength.setFont(new Font("한컴 윤고딕 240",Font.BOLD,40));
        lblength.setOpaque(true);  //배경색 지정하기 전 해야함
        lblength.setForeground(Color.WHITE);
        lblength.setBackground(Color.decode("#FFAB91"));
        lblength.setBounds(300,100,380,60);

        ImageIcon shorttest = new ImageIcon(Main.class.getResource("img/bangtest.jpg"));
        ImageIcon shorttest_e = new ImageIcon(shorttest.getImage().getScaledInstance((int)(shorttest.getIconWidth()/1.5),(int)(shorttest.getIconHeight()/1.5),Image.SCALE_DEFAULT));
        JLabel lbst = new JLabel(shorttest_e);
        lbst.setBounds(50,200,400,300);     //레이블 위치

        JLabel lblh1 = new JLabel("<html><b>귀 밑부터 턱 끝까지</b></html>");
        lblh1.setFont(new Font("한컴 윤고딕 240",Font.PLAIN,25));
        lblh1.setBounds(460,240,500,50);

        JLabel lblh2 = new JLabel("* 왼쪽의 사진처럼 길이를 잰 후 입력해주세요.");
        lblh2.setFont(new Font("한컴 윤고딕 240",Font.PLAIN,23));
        lblh2.setBounds(460,280,500,50);

        JTextField tflength = new JTextField("JTextField");
        tflength.setText("길이를 입력해주세요.");
        tflength.setFont(new Font("한컴 윤고딕 230",Font.PLAIN,20));
        tflength.setForeground(Color.gray);
        tflength.setBounds(470,345,210,40);

        tflength.addFocusListener(new FocusListener() {    //관심받기
            @Override
            public void focusGained(FocusEvent e) {
                if(tflength.getText().equals("길이를 입력해주세요.")){
                    tflength.setText("");
                    tflength.setForeground(Color.black);
                }
            }
            //다른 곳을 클릭했을 때
            @Override
            public void focusLost(FocusEvent e) {           //관심잃기
                //tflength가 비어있을 때
                if(tflength.getText().equals("")) {
                    tflength.setText("길이를 입력해주세요.");
                }
            }
        });

        JLabel cm = new JLabel("CM");
        cm.setFont(new Font("한컴 윤고딕 240",Font.BOLD,25));
        cm.setBounds(690,350,60,40);

        JButton next = new JButton("다음");
        next.setFont(new Font("한컴 윤고딕 240",Font.BOLD,20));     //font
        next.setCursor(new Cursor(Cursor.HAND_CURSOR));     //커서 바꾸기
        next.setBorderPainted(false);   //버튼 border 제거
        next.setForeground(Color.WHITE);
        next.setBackground(Color.decode("#FFAB91"));    //버튼 색
        next.setBounds(770,410,120,60);     //버튼 위치

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();    //현재 창 닫기
            }
        });

        panel.add(back);
        panel.add(home);
        panel.add(lbst);
        panel.add(lblength);
        panel.add(lblh1);
        panel.add(lblh2);
        panel.add(tflength);
        panel.add(cm);
        panel.add(next);
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
