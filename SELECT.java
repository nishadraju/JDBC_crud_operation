package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SELECT {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");

		String query = "select *from productt";
		PreparedStatement ps = con.prepareStatement(query);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String colur = rs.getString("colur");
			String price = rs.getString("price");

			System.out.println(id + " " + name + " " + colur + " " + price);

		}

	}
}
