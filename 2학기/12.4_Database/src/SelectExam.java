import java.sql.Connection;
import java.util.ArrayList;

public class SelectExam {
    private static DBHelper dbHelper = null;
    private static Connection conn = null;

    public static void main(String[] args) {
        dbHelper = DBHelper.getInstance();
        conn = dbHelper.open();
        if (conn != null){
            System.out.println("DB 연결 Success!!");
        }else{
            System.out.println("DB 연결 Fail..");
        }

        //조회
        ArrayList<T1> t1List = new ArrayList<>();
        t1List = dbHelper.select();
        for(T1 item : t1List){
            System.out.println(item);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        //추가
        T1 newT1 = new T1();
        newT1.setName("이진우");
        newT1.setMonth(9);
        newT1.setDay(13);
        newT1.setBirth_option("0913");
        newT1.setPhone("010-2004-0913");
        newT1.setGroup1(1);
        newT1.setGroup2(2);
        newT1.setGroup3(3);
        newT1.setGroup4(4);
        dbHelper.insert(newT1);

        //조회
        t1List = new ArrayList<>();
        t1List = dbHelper.select();
        for(T1 item : t1List){
            System.out.println(item);
        }

        dbHelper.close();
    }
}
