import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Square {
    static int mw = 0;

    public Square(int i){
        this.mw=i;
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("각진(네모)형 헤어스타일");
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

        ImageIcon squareimg0 = null;
        ImageIcon squareimg0_e = null;
        if(mw==1){  //남자
            squareimg0 = new ImageIcon(Main.class.getResource("img/square00.jpg"));
            squareimg0_e = new ImageIcon(squareimg0.getImage().getScaledInstance((int)(squareimg0.getIconWidth()/3.5),(int)(squareimg0.getIconHeight()/3.5),Image.SCALE_DEFAULT));
        }else{  //여자
            squareimg0 = new ImageIcon(Main.class.getResource("img/square0.jpg"));
            squareimg0_e = new ImageIcon(squareimg0.getImage().getScaledInstance((int)(squareimg0.getIconWidth()/3.5),(int)(squareimg0.getIconHeight()/3.5),Image.SCALE_DEFAULT));
        }
        JLabel lbsquare0 = new JLabel(squareimg0_e);
        lbsquare0.setBounds(130,110,170,170);     //레이블 위치

        JLabel title = new JLabel("각진(네모)형");
        title.setFont(new Font("한컴 윤고딕 240",Font.BOLD,36));    //font
        title.setBounds(340,-20,600,300);    //레이블 위치

        JLabel rec = new JLabel();
        rec.setText("<html>- 단발 굵은 S컬펌, 미디엄 길이 레이어드 C컬펌과<br>&nbsp;&nbsp;애교머리에 자연스럽게 웨이브를 준 스타일<br>" +
                "가르마: 7:3 이나 8:2 (청순하고 선한 이미지를 부각)</html>");
        rec.setFont(new Font("한컴 윤고딕 240",Font.PLAIN,25));     //font
        rec.setBounds(340,55,600,300);    //레이블 위치

        JLabel warning = new JLabel();
        warning.setText("* 피해야 할 스타일 : 5:5 정가르마, 반듯한 일자 앞머리");
        warning.setFont(new Font("한컴 윤고딕 240",Font.PLAIN,23));
        warning.setForeground(Color.RED);
        warning.setBounds(340,115,600,300);    //레이블 위치

        ImageIcon squareimg1 = null;
        ImageIcon squareimg1_e = null;
        if(mw==1){  //남자
            squareimg1 = new ImageIcon(Main.class.getResource("img/square11.jpg"));
            squareimg1_e = new ImageIcon(squareimg1.getImage().getScaledInstance((int)(squareimg1.getIconWidth()/1.5),(int)(squareimg1.getIconHeight()/1.5),Image.SCALE_DEFAULT));
        }else{  //여자
            squareimg1 = new ImageIcon(Main.class.getResource("img/square1.jpg"));
            squareimg1_e = new ImageIcon(squareimg1.getImage().getScaledInstance((int)(squareimg1.getIconWidth()/2),(int)(squareimg1.getIconHeight()/2),Image.SCALE_DEFAULT));
        }
        JLabel lbsquare1 = new JLabel(squareimg1_e);
        lbsquare1.setBounds(40,310,205,205);     //레이블 위치

        ImageIcon squareimg2 = null;
        ImageIcon squareimg2_e = null;
        if(mw==1){  //남자
            squareimg2 = new ImageIcon(Main.class.getResource("img/square22.jpg"));
            squareimg2_e = new ImageIcon(squareimg2.getImage().getScaledInstance((int)(squareimg2.getIconWidth()/2),(int)(squareimg2.getIconHeight()/2),Image.SCALE_DEFAULT));
        }else{  //여자
            squareimg2 = new ImageIcon(Main.class.getResource("img/square2.jpg"));
            squareimg2_e = new ImageIcon(squareimg2.getImage().getScaledInstance((int)(squareimg2.getIconWidth()/2.3),(int)(squareimg2.getIconHeight()/2.3),Image.SCALE_DEFAULT));
        }
        JLabel lbsquare2 = new JLabel(squareimg2_e);
        lbsquare2.setBounds(275,310,205,205);     //레이블 위치

        ImageIcon squareimg3 = null;
        ImageIcon squareimg3_e = null;
        if(mw==1){  //남자
            squareimg3 = new ImageIcon(Main.class.getResource("img/square33.jpg"));
            squareimg3_e = new ImageIcon(squareimg3.getImage().getScaledInstance((int)(squareimg3.getIconWidth()/3),(int)(squareimg3.getIconHeight()/3),Image.SCALE_DEFAULT));
        }else{  //여자
            squareimg3 = new ImageIcon(Main.class.getResource("img/square3.jpg"));
            squareimg3_e = new ImageIcon(squareimg3.getImage().getScaledInstance((int)(squareimg3.getIconWidth()/3),(int)(squareimg3.getIconHeight()/3),Image.SCALE_DEFAULT));
        }
        JLabel lbsquare3 = new JLabel(squareimg3_e);
        lbsquare3.setBounds(515,310,205,205);     //레이블 위치

        ImageIcon squareimg4 = null;
        ImageIcon squareimg4_e = null;
        if(mw==1){  //남자
            squareimg4 = new ImageIcon(Main.class.getResource("img/square44.jpg"));
            squareimg4_e = new ImageIcon(squareimg4.getImage().getScaledInstance((int)(squareimg4.getIconWidth()/1.3),(int)(squareimg4.getIconHeight()/1.3),Image.SCALE_DEFAULT));
        }else{  //여자
            squareimg4 = new ImageIcon(Main.class.getResource("img/square4.jpg"));
            squareimg4_e = new ImageIcon(squareimg4.getImage().getScaledInstance((int)(squareimg4.getIconWidth()/2.7),(int)(squareimg4.getIconHeight()/2.7),Image.SCALE_DEFAULT));
        }
        JLabel lbsquare4 = new JLabel(squareimg4_e);
        lbsquare4.setBounds(750,310,205,205);     //레이블 위치

        panel.add(back);
        panel.add(home);
        panel.add(lbsquare0);
        panel.add(title);
        panel.add(rec);
        panel.add(warning);
        panel.add(lbsquare1);
        panel.add(lbsquare2);
        panel.add(lbsquare3);
        panel.add(lbsquare4);
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
