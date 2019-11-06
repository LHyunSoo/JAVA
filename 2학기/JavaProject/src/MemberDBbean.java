import java.sql.*;

public class MemberDBbean {
    Connection conn;
    PreparedStatement pstmt;
    String sql;
    ResultSet rs;

    public MemberDBbean() {
        try {
            conn = DBConnection.getConnection();
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("드라이버 로딩 및 connection 오류");
        }
    } //드라이버 연결

    public void insert(MemberBean mb) {
        sql = "insert into recomhair(name, leng, gender, shape) values (?, ?, ?, ?)"; //SQL문
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mb.getName()); //쿼리 실행 form 생성 완료
            pstmt.setInt(2, mb.getLeng());
            pstmt.setString(3, mb.getGender());
            pstmt.setString(4, mb.getShape());
            pstmt.executeUpdate(); //쿼리문을 실행시키는 부분
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("데이터베이스 입력 오류");
        } //쿼리문 실행 준비 (insert문 실행), executeQuery문은 select문 실행

    } //tbl레지스터에 insert

    public MemberBean selectMember(String name) {	//select문 테이블에서 데이터를 가져오는데,
        System.out.println(name);
        MemberBean mb = new MemberBean();
        sql = "select * from recomhair where name=?"; //SQL문
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            rs = pstmt.executeQuery(); //쿼리문을 실행시키는 부분

            if(rs.next()) {
                mb.setName(rs.getString("name"));
                mb.setLeng(rs.getInt("leng"));
                mb.setGender(rs.getString("gender"));
                mb.setShape(rs.getString("shape"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println("데이터 불러오기 오류");
        } //쿼리문 실행 준비 (insert문 실행), executeQuery문은 select문 실행
        return mb;
    }

    public void freeConn() {
        if(pstmt!=null) {
            try {
                pstmt.close();
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
        if(conn!=null) {
            try {
                conn.close();
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
