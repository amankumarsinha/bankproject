package bankproj;

import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpCookie;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//import loginDao.loginDao;

import java.sql.*;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialversionUId=1L;
	
	public login()
	{
		super();
	}
	
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
    {
        
            String pass=req.getParameter("pass");
            
            String uname=req.getParameter("uname");
           // loginDao dao=new loginDao();
            
            try {
				if(check(uname, pass))
				{
					HttpSession session=req.getSession();
					session.setAttribute("username", uname);
					res.sendRedirect("welcome.jsp");
  
              }
				else
				{ 
					System.out.print("wrong");
					res.sendRedirect("login.jsp");
				}
		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    }
    public boolean check(String uname,String pass)throws Exception
   	{
   		String sql="select * from login where name=? and pass=?";
   		String url="jdbc:mysql://localhost:3306/loginuser";
   		String username="root";
   		String password="root";
   		try
   		{
   			Class.forName("com.mysql.cj.jdbc.Driver");
   			Connection con=DriverManager.getConnection(url,username,password);
   			PreparedStatement st=con.prepareStatement(sql);
   			st.setString(1, uname);
   			st.setString(2, pass);
   			ResultSet rs=st.executeQuery();
   			if(rs.next())
   			{
   				return true;
   			}
   		}
   		catch(Exception e)
   		{
   			System.out.print("wrong");
   			e.printStackTrace();
   		}
   		
   		
   		
   		return false;
   		
   	}
         

    
}
