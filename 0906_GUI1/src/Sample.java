import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample {
    public static void main(String[] args) {
        String[] jinwoo = {"이진우","해남이","콩알이","라이언","또치","어린왕자"};
        JFrame frame = new JFrame("Components");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("JLable");
        JButton button = new JButton("JButton");
        JCheckBox checkBox = new JCheckBox("JCheckBox");
        JCheckBox checkBox1 = new JCheckBox("JCheckBox1");
        JRadioButton radioButton = new JRadioButton("미성년자");
        JRadioButton radioButton1 = new JRadioButton("성인");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton);
        buttonGroup.add(radioButton1);
        JTextField textField = new JTextField("JTextField");
        JTextArea textArea = new JTextArea(3,30);
        JComboBox comboBox = new JComboBox(jinwoo);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("Clicked");
            }
        });

        panel.add(label);
        panel.add(button);
        panel.add(checkBox);
        panel.add(checkBox1);
        panel.add(radioButton);
        panel.add(radioButton1);
        panel.add(textField);
        panel.add(textArea);
        panel.add(comboBox);
        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
