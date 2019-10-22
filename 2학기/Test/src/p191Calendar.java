import javax.swing.*;
import java.awt.*;

public class p191Calendar {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calendar");
        JPanel p = new JPanel();

        Choice month = new Choice();
        for(int i = 1; i<=12; i++){
            month.add(Integer.toString(i));
        }

        Choice day = new Choice();
//        switch (month){
//            case "1":
//            case "3":
//            case "5":
//            case "7":
//            case "8":
//            case "10":
//            case "12":
//                for(int i = 1; i<=31; i++){
//                    day.add(Integer.toString(i));
//                }
//            case "4":
//            case "6":
//            case "9":
//            case "11":
//                for(int i = 1; i<=30; i++){
//                    day.add(Integer.toString(i));
//                }
//            case "2":
//                for(int i = 1; i<=28; i++){
//                    day.add(Integer.toString(i));
//                }
//        }
    }
}
