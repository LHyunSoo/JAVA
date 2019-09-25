import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
        JLabel labelResult = new JLabel("Result");

        //기본값(?) 지정
        checkBox.setSelected(true);
        radioButton.setSelected(true);
        textField.setText("전화번호를 입력하세요.");

        //textField를 클릭했을 때
        textField.addFocusListener(new FocusListener() {    //관심받기
            @Override
            public void focusGained(FocusEvent e) {
                if(textField.getText().equals("전화번호를 입력하세요.")){
                    textField.setText("");
                }
            }

            //다른 곳을 클릭했을 때
            @Override
            public void focusLost(FocusEvent e) {           //관심잃기
                //textField가 비어있을 때
                if(textField.getText().equals("")) {
                    textField.setText("전화번호를 입력하세요.");
                }
            }
        });

        //button을 누르면 실행
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = "";
                result += label.getText();
                result += button.getText();
                result += checkBox.isSelected();
                result += checkBox1.isSelected();
                result += radioButton.isSelected();
                result += radioButton1.isSelected();
                result += textField.getText();
                result += textArea.getText();
                result += comboBox.getSelectedIndex();
                result += comboBox.getSelectedItem();
                //labelResult가 result로 바뀔 수 있게 set
                labelResult.setText(result);
            }
        });

        //Item이 눌리면 무조건 이곳으로 들어옴(Item에 따라 달리 실행)
        ItemListener il = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == checkBox) {
                    System.out.println("JCheckbox: " + checkBox.isSelected());
                } else if (e.getSource() == checkBox1) {
                    System.out.println("JCheckbox: " + checkBox1.isSelected());
                } else if (e.getSource() == radioButton) {
                    System.out.println("JCheckbox: " + radioButton.isSelected());
                } else if (e.getSource() == radioButton1) {
                    System.out.println("JCheckbox: " + radioButton1.isSelected());
                } else if (e.getSource() == comboBox) {
                    System.out.println("JCheckbox: " + comboBox.getSelectedItem());
                }
            }
        };
        checkBox.addItemListener(il);
        checkBox1.addItemListener(il);
        radioButton.addItemListener(il);
        radioButton1.addItemListener(il);
        comboBox.addItemListener(il);

        panel.add(label);
        panel.add(button);
        panel.add(checkBox);
        panel.add(checkBox1);
        panel.add(radioButton);
        panel.add(radioButton1);
        panel.add(textField);
        panel.add(textArea);
        panel.add(comboBox);
        panel.add(labelResult);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600,400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
