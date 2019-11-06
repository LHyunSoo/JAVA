import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Long {
    static int mw = 0;

    public Long(int i){
        this.mw=i;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("긴형 헤어스타일");
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

        ImageIcon longimg0 = null;
        ImageIcon longimg0_e = null;
        if(mw==1){  //남자
            longimg0 = new ImageIcon(Main.class.getResource("img/long00.jpg"));
            longimg0_e = new ImageIcon(longimg0.getImage().getScaledInstance((int)(longimg0.getIconWidth()/3.5),(int)(longimg0.getIconHeight()/3.5),Image.SCALE_DEFAULT));
        }else{  //여자
            longimg0 = new ImageIcon(Main.class.getResource("img/long0.jpg"));
            longimg0_e = new ImageIcon(longimg0.getImage().getScaledInstance((int)(longimg0.getIconWidth()/3.5),(int)(longimg0.getIconHeight()/3.5),Image.SCALE_DEFAULT));
        }
        JLabel lblong0 = new JLabel(longimg0_e);
        lblong0.setBounds(130,110,170,170);     //레이블 위치

        JLabel title = new JLabel("긴형");
        title.setFont(new Font("한컴 윤고딕 240",Font.BOLD,36));    //font
        title.setBounds(340,-20,600,300);    //레이블 위치

        JLabel rec = new JLabel();
        if(mw==1) {  //남자
            rec.setText("<html>- 앞머리를 살짝 내려 이마를 답답하지 않게<br>&nbsp;&nbsp;자연스럽게 가리는 스타일</html>");
        }else {
            rec.setText("<html>- 볼륨감 있는 반 곱슬 느낌의 스타일이나<br>&nbsp;&nbsp;꽉찬 뱅 앞머리나 시스루 뱅으로 시선을 분산시키나<br>&nbsp;&nbsp;옆머리에 볼륨을 넣는 스타일<br>" +
                    "- 가르마: 8:2</html>");
        }
        rec.setFont(new Font("한컴 윤고딕 240",Font.PLAIN,25));     //font
        rec.setBounds(340,55,600,300);    //레이블 위치

        JLabel warning = new JLabel();
        if(mw==1) {  //남자
        }else { //여자
            warning.setText("* 피해야 할 스타일 : 촥 달라 붙는 생머리");
            warning.setFont(new Font("한컴 윤고딕 240", Font.PLAIN, 23));
            warning.setForeground(Color.RED);
            warning.setBounds(340, 115, 600, 300);    //레이블 위치
        }

        ImageIcon longimg1 = null;
        ImageIcon longimg1_e = null;
        if(mw==1){  //남자
            longimg1 = new ImageIcon(Main.class.getResource("img/long11.jpg"));
            longimg1_e = new ImageIcon(longimg1.getImage().getScaledInstance((int)(longimg1.getIconWidth()/1.5),(int)(longimg1.getIconHeight()/1.5),Image.SCALE_DEFAULT));
        }else{  //여자
            longimg1 = new ImageIcon(Main.class.getResource("img/long1.jpg"));
            longimg1_e = new ImageIcon(longimg1.getImage().getScaledInstance((int)(longimg1.getIconWidth()/2.3),(int)(longimg1.getIconHeight()/2.3),Image.SCALE_DEFAULT));
        }
        JLabel lblong1 = new JLabel(longimg1_e);
        lblong1.setBounds(40,310,205,205);     //레이블 위치

        ImageIcon longimg2 = null;
        ImageIcon longimg2_e =null;
        if(mw==1){  //남자
            longimg2 = new ImageIcon(Main.class.getResource("img/long22.jpg"));
            longimg2_e = new ImageIcon(longimg2.getImage().getScaledInstance((int)(longimg2.getIconWidth()/2),(int)(longimg2.getIconHeight()/2),Image.SCALE_DEFAULT));
        }else{  //여자
            longimg2 = new ImageIcon(Main.class.getResource("img/long2.jpg"));
            longimg2_e = new ImageIcon(longimg2.getImage().getScaledInstance((int)(longimg2.getIconWidth()/2.3),(int)(longimg2.getIconHeight()/2.3),Image.SCALE_DEFAULT));
        }
        JLabel lblong2 = new JLabel(longimg2_e);
        lblong2.setBounds(275,310,205,205);     //레이블 위치

        ImageIcon longimg3 = null;
        ImageIcon longimg3_e = null;
        if(mw==1){  //남자
            longimg3 = new ImageIcon(Main.class.getResource("img/long33.jpg"));
            longimg3_e = new ImageIcon(longimg3.getImage().getScaledInstance((int)(longimg3.getIconWidth()/2),(int)(longimg3.getIconHeight()/2),Image.SCALE_DEFAULT));
        }else{  //여자
            longimg3 = new ImageIcon(Main.class.getResource("img/long3.jpg"));
            longimg3_e = new ImageIcon(longimg3.getImage().getScaledInstance((int)(longimg3.getIconWidth()/3.5),(int)(longimg3.getIconHeight()/3.5),Image.SCALE_DEFAULT));
        }
        JLabel lblong3 = new JLabel(longimg3_e);
        lblong3.setBounds(515,310,205,205);     //레이블 위치

        ImageIcon longimg4 = null;
        ImageIcon longimg4_e = null;
        if(mw==1){  //남자
            longimg4 = new ImageIcon(Main.class.getResource("img/long44.jpg"));
            longimg4_e = new ImageIcon(longimg4.getImage().getScaledInstance((int)(longimg4.getIconWidth()/2),(int)(longimg4.getIconHeight()/2),Image.SCALE_DEFAULT));
        }else{  //여자
            longimg4 = new ImageIcon(Main.class.getResource("img/long4.jpg"));
            longimg4_e = new ImageIcon(longimg4.getImage().getScaledInstance((int)(longimg4.getIconWidth()/3),(int)(longimg4.getIconHeight()/3),Image.SCALE_DEFAULT));
        }
        JLabel lblong4 = new JLabel(longimg4_e);
        lblong4.setBounds(750,310,205,205);     //레이블 위치

        panel.add(back);
        panel.add(home);
        panel.add(lblong0);
        panel.add(title);
        panel.add(rec);
        panel.add(warning);
        panel.add(lblong1);
        panel.add(lblong2);
        panel.add(lblong3);
        panel.add(lblong4);
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
