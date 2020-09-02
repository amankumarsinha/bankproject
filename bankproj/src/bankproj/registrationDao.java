package bankproj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class registrationDao 
{
	   private  String url="jdbc:mysql://localhost:3306/loginuser";
		private String username="root";
		 private String password="root";
		 public void loadDriver()
		 {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 }
		 public Connection getconnection()
		 {
			 Connection con=null;
		try
		{
		
		 con=DriverManager.getConnection(url,username,password);
		}	
		catch(Exception e)
		{
			System.out.print("wrong");
			e.printStackTrace();
		}
		return con;
	 }
		 public String insert(member mem)throws Exception
		 {
			loadDriver();
			 Connection con=getconnection();
			 String res="data succesfully stored";
			 String sql="insert into loginuser.login values(?,?,?)";
			 try {
			 PreparedStatement ps=con.prepareStatement(sql);
			 ps.setString(1,mem.getName());
			 ps.setString(2,mem.getPass());
			 ps.setString(3,mem.getEmail());
			 
			 ps.executeUpdate();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 res="not enterd succesfully";
			 
		 }
		return res;
			 
		 }
		
}
