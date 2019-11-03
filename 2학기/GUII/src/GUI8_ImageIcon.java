import javax.swing.*;
import java.awt.*;

public class GUI8_ImageIcon {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Components");
        JPanel panel = new JPanel();
        ImageIcon iijpg = new ImageIcon(GUI8_ImageIcon.class.getResource("img/Instargram.jpg"));
        ImageIcon iijpg_edit = new ImageIcon(iijpg.getImage().getScaledInstance(iijpg.getIconWidth()/10,iijpg.getIconHeight()/10,Image.SCALE_DEFAULT));
        JLabel lbii = new JLabel(iijpg);
        JLabel lbiie = new JLabel(iijpg_edit);

        panel.add(lbii);
        panel.add(lbiie);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
