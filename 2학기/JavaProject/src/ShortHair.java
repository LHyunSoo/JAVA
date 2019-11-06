import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShortHair {
    static double d;

    public ShortHair(double d){
        this.d=d;
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("단발이 어울리는지");
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
                Length l = new Length();
                l.main(args);
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

        JLabel lblength = new JLabel();
        if(d <= 5.715){ //단발이 나음
            lblength.setText("<html>&nbsp;당장 단발하러 미용실로 ㄱㄱ!!</html>");
        }else{  //장발이 나음
            lblength.setText("단발병엔 이 사진이 최고지 ㅎㅎ");
        }
        lblength.setFont(new Font("한컴 윤고딕 240",Font.BOLD,40));
        lblength.setOpaque(true);  //배경색 지정하기 전 해야함
        lblength.setForeground(Color.WHITE);
        lblength.setBackground(Color.decode("#FFAB91"));
        lblength.setBounds(200,100,570,60);

        ImageIcon img1 = null;
        ImageIcon img2 = null;
        ImageIcon img3 = null;
        ImageIcon img1_e = null;
        ImageIcon img2_e = null;
        ImageIcon img3_e = null;
        if(d <= 5.715){ //단발이 나음
            img1 = new ImageIcon(Main.class.getResource("img/goshort1.jpg"));
            img1_e = new ImageIcon(img1.getImage().getScaledInstance((int)(img1.getIconWidth()/1.5),(int)(img1.getIconHeight()/1.5),Image.SCALE_DEFAULT));
            img2 = new ImageIcon(Main.class.getResource("img/goshort2.jpg"));
            img2_e = new ImageIcon(img2.getImage().getScaledInstance((int)(img2.getIconWidth()/3),(int)(img2.getIconHeight()/3),Image.SCALE_DEFAULT));
            img3 = new ImageIcon(Main.class.getResource("img/goshort3.jpg"));
            img3_e = new ImageIcon(img3.getImage().getScaledInstance((int)(img3.getIconWidth()/1.5),(int)(img3.getIconHeight()/1.5),Image.SCALE_DEFAULT));
        }else{  //장발이 나음
            img1 = new ImageIcon(Main.class.getResource("img/noshort1.jpg"));
            img1_e = new ImageIcon(img1.getImage().getScaledInstance((int)(img1.getIconWidth()/1.5),(int)(img1.getIconHeight()/1.5),Image.SCALE_DEFAULT));
            img2 = new ImageIcon(Main.class.getResource("img/noshort2.jpg"));
            img2_e = new ImageIcon(img2.getImage().getScaledInstance((int)(img2.getIconWidth()/1.5),(int)(img2.getIconHeight()/1.5),Image.SCALE_DEFAULT));
            img3 = new ImageIcon(Main.class.getResource("img/noshort3.jpg"));
            img3_e = new ImageIcon(img3.getImage().getScaledInstance((int)(img3.getIconWidth()/1.2),(int)(img3.getIconHeight()/1.2),Image.SCALE_DEFAULT));
        }
        JLabel lbimg1 = new JLabel(img1_e);
        JLabel lbimg2 = new JLabel(img2_e);
        JLabel lbimg3 = new JLabel(img3_e);
        lbimg1.setBounds(40,200,300,300);     //레이블 위치
        lbimg2.setBounds(350,200,300,300);     //레이블 위치
        lbimg3.setBounds(660,200,300,300);     //레이블 위치

        panel.add(back);
        panel.add(home);
        panel.add(lblength);
        panel.add(lbimg1);
        panel.add(lbimg2);
        panel.add(lbimg3);
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
