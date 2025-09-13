package Crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int id=3;
		String name="cemlepen";
	     String colur="blue";
		String price="30";
			
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		PreparedStatement ps=con.prepareStatement("insert into productt values('"+id+"','"+name+"','"+colur+"','"+price+"')");
		int i=ps.executeUpdate();
		if(i>0) {
			System.out.println("inserted");
			
			
		}else{
		
		System.out.println("faild");
		
		
		
		}
	}
	}

