



import java.sql.*;  

public class MySqlCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			// here store is database name, root is username and password
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "1234");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+" "+rs.getInt(4));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
