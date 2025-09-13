package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
		PreparedStatement ps = con.prepareStatement("delete from productt where id=?");
		ps.setInt(1, 1);
		int i = ps.executeUpdate();
		if (i > 0) {
			System.out.println("deleted");

		} else {

			System.out.println("faild");

		}
	}
}
