import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Circle {
    static int mw = 0;

    public Circle(int i){
        this.mw=i;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("둥근형 헤어스타일");
        JPanel panel = new JPanel();
        panel.setLayout(null);  //layout null

        ImageIcon backimg = new ImageIcon(Main.class.getResource("img/back.png"));
        ImageIcon backimg_e = new ImageIcon(backimg.getImage().getScaledInstance(backimg.getIconWidth()/11,backimg.getIconHeight()/11, Image.SCALE_DEFAULT));
        JButton back = new JButton(backimg_e);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));     //커서 바꾸기
        back.setBackground(Color.decode("#FBE9E7"));
        back.setBorderPainted(false);   //버튼 border 제거
        back.setBounds(50,40,50,50);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FaceShape fs = new FaceShape(mw);
                fs.main(args);
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

        ImageIcon circleimg0 = null;
        ImageIcon circleimg0_e = null;
        if(mw==1){  //남자
            circleimg0 = new ImageIcon(Main.class.getResource("img/circle00.jpg"));
            circleimg0_e = new ImageIcon(circleimg0.getImage().getScaledInstance((int)(circleimg0.getIconWidth()/2),(int)(circleimg0.getIconHeight()/2),Image.SCALE_DEFAULT));
        }else{  //여자
            circleimg0 = new ImageIcon(Main.class.getResource("img/circle0.jpg"));
            circleimg0_e = new ImageIcon(circleimg0.getImage().getScaledInstance((int)(circleimg0.getIconWidth()/3.5),(int)(circleimg0.getIconHeight()/3.5),Image.SCALE_DEFAULT));
        }
        JLabel lbcircle0 = new JLabel(circleimg0_e);
        lbcircle0.setBounds(130,110,170,170);     //레이블 위치

        JLabel title = new JLabel("둥근형");
        title.setFont(new Font("한컴 윤고딕 240",Font.BOLD,36));    //font
        title.setBounds(340,-20,600,300);    //레이블 위치

        JLabel rec = new JLabel();
        rec.setText("<html>- 시각적으로 갸름하게 보여주는 레이어드 C컬펌,<br>&nbsp;&nbsp;뿌리볼륨펌, 턱선까지 오거나 미디엄보다 긴 기장<br>" +
                "- 가르마: 5:5 (세련되고 시크한 이미지를 부각)</html>");
        rec.setFont(new Font("한컴 윤고딕 240",Font.PLAIN,25));     //font
        rec.setBounds(340,55,600,300);    //레이블 위치

        JLabel warning = new JLabel();
        warning.setText("* 피해야 할 스타일 : 미디엄 길이, 곱슬머리(파마)");
        warning.setFont(new Font("한컴 윤고딕 240",Font.PLAIN,23));
        warning.setForeground(Color.RED);
        warning.setBounds(340,115,600,300);    //레이블 위치

        ImageIcon circleimg1 = null;
        ImageIcon circleimg1_e = null;
        if(mw==1){  //남자
            circleimg1 = new ImageIcon(Main.class.getResource("img/circle11.jpg"));
            circleimg1_e = new ImageIcon(circleimg1.getImage().getScaledInstance((int)(circleimg1.getIconWidth()/1.5),(int)(circleimg1.getIconHeight()/1.5),Image.SCALE_DEFAULT));
        }else{  //여자
            circleimg1 = new ImageIcon(Main.class.getResource("img/circle1.jpg"));
            circleimg1_e = new ImageIcon(circleimg1.getImage().getScaledInstance((int)(circleimg1.getIconWidth()/1),(int)(circleimg1.getIconHeight()/1),Image.SCALE_DEFAULT));
        }
        JLabel lbcircle1 = new JLabel(circleimg1_e);
        lbcircle1.setBounds(40,310,205,205);     //레이블 위치

        ImageIcon circleimg2 = null;
        ImageIcon circleimg2_e = null;
        if(mw==1){  //남자
            circleimg2 = new ImageIcon(Main.class.getResource("img/circle22.jpg"));
            circleimg2_e = new ImageIcon(circleimg2.getImage().getScaledInstance((int)(circleimg2.getIconWidth()/1.5),(int)(circleimg2.getIconHeight()/1.5),Image.SCALE_DEFAULT));
        }else{  //여자
            circleimg2 = new ImageIcon(Main.class.getResource("img/circle2.jpg"));
            circleimg2_e = new ImageIcon(circleimg2.getImage().getScaledInstance((int)(circleimg2.getIconWidth()/2.3),(int)(circleimg2.getIconHeight()/2.3),Image.SCALE_DEFAULT));
        }
        JLabel lbcircle2 = new JLabel(circleimg2_e);
        lbcircle2.setBounds(275,310,205,205);     //레이블 위치

        ImageIcon circleimg3 = null;
        ImageIcon circleimg3_e = null;
        if(mw==1){  //남자
            circleimg3 = new ImageIcon(Main.class.getResource("img/circle33.jpg"));
            circleimg3_e = new ImageIcon(circleimg3.getImage().getScaledInstance((int)(circleimg3.getIconWidth()/2.5),(int)(circleimg3.getIconHeight()/2.5),Image.SCALE_DEFAULT));
        }else {  //여자
            circleimg3 = new ImageIcon(Main.class.getResource("img/circle3.jpg"));
            circleimg3_e = new ImageIcon(circleimg3.getImage().getScaledInstance((int)(circleimg3.getIconWidth()/1.5),(int)(circleimg3.getIconHeight()/1.5),Image.SCALE_DEFAULT));
        }
        JLabel lbcircle3 = new JLabel(circleimg3_e);
        lbcircle3.setBounds(515,310,205,205);     //레이블 위치


        ImageIcon circleimg4 = null;
        ImageIcon circleimg4_e = null;
        if(mw==1){  //남자
            circleimg4 = new ImageIcon(Main.class.getResource("img/circle44.jpg"));
            circleimg4_e = new ImageIcon(circleimg4.getImage().getScaledInstance((int)(circleimg4.getIconWidth()/2.5),(int)(circleimg4.getIconHeight()/2.5),Image.SCALE_DEFAULT));
        }else{  //여자
            circleimg4 = new ImageIcon(Main.class.getResource("img/circle4.jpg"));
            circleimg4_e = new ImageIcon(circleimg4.getImage().getScaledInstance((int)(circleimg4.getIconWidth()/3),(int)(circleimg4.getIconHeight()/3),Image.SCALE_DEFAULT));
        }
        JLabel lbcircle4 = new JLabel(circleimg4_e);
        lbcircle4.setBounds(750,310,205,205);     //레이블 위치

        panel.add(back);
        panel.add(home);
        panel.add(lbcircle0);
        panel.add(title);
        panel.add(rec);
        panel.add(warning);
        panel.add(lbcircle1);
        panel.add(lbcircle2);
        panel.add(lbcircle3);
        panel.add(lbcircle4);
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
