package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.PreparedStatement;

public class loginDao {
	String sql="select * from login where uname=? and pass=?";
	String url="jdbc:mysql://localhost:3306/rim";
	String username="root";
	String password="rimzim@1506";
	public boolean check(String uname,String pass){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection(url,username,password);
			PreparedStatement st= con.prepareStatement(sql);
			st.setString(1,uname);
			st.setString(2,pass);
			ResultSet rs=st.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

}
