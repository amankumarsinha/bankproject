package bankproj;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class kyc
 */
@WebServlet("/kyc")
public class kyc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public kyc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session =request.getSession();
		String name=session.getAttribute("username").toString();
		 String pan=request.getParameter("pan");
		 String aadhar=request.getParameter("aadhar");
		 String passport=request.getParameter("passport");
		 String dl=request.getParameter("dl");
         enterdetails(pan,aadhar,name,passport,dl);
       
         response.sendRedirect("welcome.jsp");
         
         
	}
         void enterdetails(String pan,String aadhar,String name,String passport,String dl)
         {
        	 String sql="insert into details values(?,?,?,?,?)";
    		String url="jdbc:mysql://localhost:3306/loginuser";
       		String username="root";
       		String password="root";
       		try
       		{
       			Class.forName("com.mysql.cj.jdbc.Driver");
       			Connection con=DriverManager.getConnection(url,username,password);
       			PreparedStatement st=con.prepareStatement(sql);
       			st.setString(1, name);
       			st.setString(2, pan);
       			st.setString(3,aadhar);
       			st.setString(4,passport);
       			st.setString(5,dl);
       			int i=st.executeUpdate();
       			System.out.print(i);
       		}
       		catch(Exception e)
       		{
       			System.out.print("wrong");
       			e.printStackTrace();
       		}
       		
         }
}
