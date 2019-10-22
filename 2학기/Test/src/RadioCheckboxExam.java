import javax.swing.*;
import java.awt.*;

public class RadioCheckboxExam extends Frame {
    public RadioCheckboxExam(){
        super("라디오버튼형");

        Panel p = new Panel();

        //Checkbox를 그룹으로 묶음. 그룹 내에서는 하나의 항목만 선택 가능
        CheckboxGroup g = new CheckboxGroup();
        Checkbox ra1 = new Checkbox("남자",g,true);
        Checkbox ra2 = new Checkbox("여자",g,false);

        p.add(ra1);
        p.add(ra2);
        add(p);

        setSize(400,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioCheckboxExam();
    }
}
