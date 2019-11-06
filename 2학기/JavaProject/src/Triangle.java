import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Triangle {
    static int mw = 0;

    public Triangle(int i){
        this.mw=i;
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("역삼각형 헤어스타일");
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

        ImageIcon triangleimg0 = null;
        ImageIcon triangleimg0_e = null;
        if(mw==1){  //남자
            triangleimg0 = new ImageIcon(Main.class.getResource("img/triangle00.jpg"));
            triangleimg0_e = new ImageIcon(triangleimg0.getImage().getScaledInstance((int)(triangleimg0.getIconWidth()/3.5),(int)(triangleimg0.getIconHeight()/3.5),Image.SCALE_DEFAULT));
        }else{  //여자
            triangleimg0 = new ImageIcon(Main.class.getResource("img/triangle0.jpg"));
            triangleimg0_e = new ImageIcon(triangleimg0.getImage().getScaledInstance((int)(triangleimg0.getIconWidth()/4.8),(int)(triangleimg0.getIconHeight()/4.8),Image.SCALE_DEFAULT));
        }
        JLabel lbtriangle0 = new JLabel(triangleimg0_e);
        lbtriangle0.setBounds(130,110,170,170);     //레이블 위치

        JLabel title = new JLabel("역삼각형");
        title.setFont(new Font("한컴 윤고딕 240",Font.BOLD,36));    //font
        title.setBounds(340,-20,600,300);    //레이블 위치

        JLabel rec = new JLabel();
        rec.setText("<html>- C컬펌 또는 무거운 느낌의 굵은 S컬펌과<br>&nbsp;&nbsp;머리를 한쪽으로 넘겨 웨이브를 준 스타일<br>" +
                "- 가르마: 1:9 (섹시하고 도회적인 이미지를 부각)</html>");
        rec.setFont(new Font("한컴 윤고딕 240",Font.PLAIN,25));     //font
        rec.setBounds(340,55,600,300);    //레이블 위치

        JLabel warning = new JLabel();
        warning.setText("* 피해야 할 스타일 : 답답해 보이는 앞머리");
        warning.setFont(new Font("한컴 윤고딕 240",Font.PLAIN,23));
        warning.setForeground(Color.RED);
        warning.setBounds(340,115,600,300);    //레이블 위치

        ImageIcon triangleimg1 = null;
        ImageIcon triangleimg1_e = null;
        if(mw==1){  //남자
            triangleimg1 = new ImageIcon(Main.class.getResource("img/triangle11.jpg"));
            triangleimg1_e = new ImageIcon(triangleimg1.getImage().getScaledInstance((int)(triangleimg1.getIconWidth()/6),(int)(triangleimg1.getIconHeight()/6),Image.SCALE_DEFAULT));
        }else{  //여자
            triangleimg1 = new ImageIcon(Main.class.getResource("img/triangle1.jpg"));
            triangleimg1_e = new ImageIcon(triangleimg1.getImage().getScaledInstance((int)(triangleimg1.getIconWidth()/2.3),(int)(triangleimg1.getIconHeight()/2.3),Image.SCALE_DEFAULT));
        }
        JLabel lbtriangle1 = new JLabel(triangleimg1_e);
        lbtriangle1.setBounds(40,310,205,205);     //레이블 위치

        ImageIcon triangleimg2 = null;
        ImageIcon triangleimg2_e = null;
        if(mw==1){  //남자
            triangleimg2 = new ImageIcon(Main.class.getResource("img/triangle22.jpg"));
            triangleimg2_e = new ImageIcon(triangleimg2.getImage().getScaledInstance((int)(triangleimg2.getIconWidth()/1.5),(int)(triangleimg2.getIconHeight()/1.5),Image.SCALE_DEFAULT));
        }else{  //여자
            triangleimg2 = new ImageIcon(Main.class.getResource("img/triangle2.jpg"));
            triangleimg2_e = new ImageIcon(triangleimg2.getImage().getScaledInstance((int)(triangleimg2.getIconWidth()/2.5),(int)(triangleimg2.getIconHeight()/2.5),Image.SCALE_DEFAULT));
        }
        JLabel lbtriangle2 = new JLabel(triangleimg2_e);
        lbtriangle2.setBounds(275,310,205,205);     //레이블 위치

        ImageIcon triangleimg3 = null;
        ImageIcon triangleimg3_e = null;
        if(mw==1){  //남자
            triangleimg3 = new ImageIcon(Main.class.getResource("img/triangle33.png"));
            triangleimg3_e = new ImageIcon(triangleimg3.getImage().getScaledInstance((int)(triangleimg3.getIconWidth()/2.5),(int)(triangleimg3.getIconHeight()/2.5),Image.SCALE_DEFAULT));
        }else{  //여자
            triangleimg3 = new ImageIcon(Main.class.getResource("img/triangle3.jpg"));
            triangleimg3_e = new ImageIcon(triangleimg3.getImage().getScaledInstance((int)(triangleimg3.getIconWidth()/2.3),(int)(triangleimg3.getIconHeight()/2.3),Image.SCALE_DEFAULT));
        }
        JLabel lbtriangle3 = new JLabel(triangleimg3_e);
        lbtriangle3.setBounds(515,310,205,205);     //레이블 위치

        ImageIcon triangleimg4 = null;
        ImageIcon triangleimg4_e = null;
        if(mw==1){  //남자
            triangleimg4 = new ImageIcon(Main.class.getResource("img/triangle44.jpg"));
            triangleimg4_e = new ImageIcon(triangleimg4.getImage().getScaledInstance((int)(triangleimg4.getIconWidth()/3),(int)(triangleimg4.getIconHeight()/3),Image.SCALE_DEFAULT));
        }else{  //여자
            triangleimg4 = new ImageIcon(Main.class.getResource("img/triangle4.jpg"));
            triangleimg4_e = new ImageIcon(triangleimg4.getImage().getScaledInstance((int)(triangleimg4.getIconWidth()/2.5),(int)(triangleimg4.getIconHeight()/2.5),Image.SCALE_DEFAULT));
        }
        JLabel lbtriangle4 = new JLabel(triangleimg4_e);
        lbtriangle4.setBounds(750,310,205,205);     //레이블 위치

        panel.add(back);
        panel.add(home);
        panel.add(lbtriangle0);
        panel.add(title);
        panel.add(rec);
        panel.add(warning);
        panel.add(lbtriangle1);
        panel.add(lbtriangle2);
        panel.add(lbtriangle3);
        panel.add(lbtriangle4);
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
