import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FaceShape {
    static int mw = 0;

    public FaceShape(int i){
        this.mw=i;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("얼굴형 선택");
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
                if(mw==1) {
                    Info f = new Info();
                    f.main(args);
                }else{
                    RecomWay rw = new RecomWay();
                    rw.main(args);
                }
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

        JLabel title = new JLabel("얼굴형을 선택해주세요!");
        title.setFont(new Font("한컴 윤고딕 240",Font.BOLD,40));
        title.setOpaque(true);  //배경색 지정하기 전 해야함
        title.setForeground(Color.WHITE);
        title.setBackground(Color.decode("#FFAB91"));
        title.setBounds(270,100,420,60);

        ImageIcon longimg = new ImageIcon(Main.class.getResource("img/lo.png"));
        ImageIcon longimg_e = new ImageIcon(longimg.getImage().getScaledInstance((int)(longimg.getIconWidth()/1.5),(int)(longimg.getIconHeight()/1.5),Image.SCALE_DEFAULT));
        JLabel lonng = new JLabel(longimg_e);
        lonng.setBounds(100,210,180,180);

        JButton recomlong = new JButton("긴형");
        recomlong.setFont(new Font("한컴 윤고딕 240",Font.BOLD,20));     //font
        recomlong.setCursor(new Cursor(Cursor.HAND_CURSOR));     //커서 바꾸기
        recomlong.setBorder(new MatteBorder(3,3,3,3,(Color.decode("#FF8A65"))));   //버튼 border 굵기와 색 설정
        recomlong.setBackground(Color.decode("#FBE9E7"));    //버튼 배경색
        recomlong.setBounds(120,420,140,70);    //버튼 위치

        recomlong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Long l = new Long(mw);
                l.main(args);
                frame.dispose();
            }
        });

        ImageIcon circleimg = new ImageIcon(Main.class.getResource("img/ci.png"));
        ImageIcon circleimg_e = new ImageIcon(circleimg.getImage().getScaledInstance((int)(circleimg.getIconWidth()/1.5),(int)(circleimg.getIconHeight()/1.5),Image.SCALE_DEFAULT));
        JLabel circle = new JLabel(circleimg_e);
        circle.setBounds(290,210,180,180);

        JButton recomcircle = new JButton("둥근형");
        recomcircle.setFont(new Font("한컴 윤고딕 240",Font.BOLD,20));     //font
        recomcircle.setCursor(new Cursor(Cursor.HAND_CURSOR));     //커서 바꾸기
        recomcircle.setBorder(new MatteBorder(3,3,3,3,(Color.decode("#FF8A65"))));   //버튼 border 굵기와 색 설정
        recomcircle.setBackground(Color.decode("#FBE9E7"));    //버튼 배경색
        recomcircle.setBounds(310,420,140,70);    //버튼 위치

        recomcircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Circle c = new Circle(mw);
                c.main(args);
                frame.dispose();
            }
        });

        ImageIcon triangleimg = new ImageIcon(Main.class.getResource("img/tr.png"));
        ImageIcon triangleimg_e = new ImageIcon(triangleimg.getImage().getScaledInstance((int)(triangleimg.getIconWidth()/1.5),(int)(triangleimg.getIconHeight()/1.5),Image.SCALE_DEFAULT));
        JLabel triangle = new JLabel(triangleimg_e);
        triangle.setBounds(490,210,180,180);

        JButton recomtriangle = new JButton("역삼각형");
        recomtriangle.setFont(new Font("한컴 윤고딕 240",Font.BOLD,20));     //font
        recomtriangle.setCursor(new Cursor(Cursor.HAND_CURSOR));     //커서 바꾸기
        recomtriangle.setBorder(new MatteBorder(3,3,3,3,(Color.decode("#FF8A65"))));   //버튼 border 굵기와 색 설정
        recomtriangle.setBackground(Color.decode("#FBE9E7"));    //버튼 배경색
        recomtriangle.setBounds(510,420,140,70);    //버튼 위치

        recomtriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Triangle t = new Triangle(mw);
                t.main(args);
                frame.dispose();
            }
        });

        ImageIcon squareimg = new ImageIcon(Main.class.getResource("img/sq.png"));
        ImageIcon squareimg_e = new ImageIcon(squareimg.getImage().getScaledInstance((int)(squareimg.getIconWidth()/1.5),(int)(squareimg.getIconHeight()/1.5),Image.SCALE_DEFAULT));
        JLabel square = new JLabel(squareimg_e);
        square.setBounds(700,210,180,180);

        JButton recomsquare = new JButton("각진(네모)형");
        recomsquare.setFont(new Font("한컴 윤고딕 240",Font.BOLD,20));     //font
        recomsquare.setCursor(new Cursor(Cursor.HAND_CURSOR));     //커서 바꾸기
        recomsquare.setBorder(new MatteBorder(3,3,3,3,(Color.decode("#FF8A65"))));   //버튼 border 굵기와 색 설정
        recomsquare.setBackground(Color.decode("#FBE9E7"));    //버튼 배경색
        recomsquare.setBounds(720,420,140,70);    //버튼 위치

        recomsquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Square s = new Square(mw);
                s.main(args);
                frame.dispose();
            }
        });

        panel.add(back);
        panel.add(home);
        panel.add(title);
        panel.add(lonng);
        panel.add(circle);
        panel.add(triangle);
        panel.add(square);
        panel.add(recomlong);
        panel.add(recomcircle);
        panel.add(recomtriangle);
        panel.add(recomsquare);
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
