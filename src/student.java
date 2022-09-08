import java.sql.*;

public class student {

	public static void main(String[] args) {
	
		String jdbcDriver="com.mysql.cj.jdbc.Driver";
		String jdbcUr1="jdbc:mysql://localhost/yangjung?serverTimezone=UTC";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
				String sql="select * from student";
		try {
			Class.forName(jdbcDriver);
			conn=DriverManager.getConnection(jdbcUr1,"root", "1234");
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("hakbun"));
				System.out.println(rs.getInt("hakbun"));
				
			}
					System.out.println("databass 연결 성공");
		}catch(Exception e) {
			System.out.println("database 연결 실패");
			e.printStackTrace();
		}
		}
	
}



