package bankproj.details;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loandetails
 */
@WebServlet("/loandetails")
public class loandetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loandetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		    String url="jdbc:mysql://localhost:3306/loginuser";
			 String username="root";
			  String password="root";
			 String sql="insert into loginuser.loandetails values(?,?,?,?,?,?,?,?,?,?)";
			 
			 try 
			 {
				 Class.forName("com.mysql.cj.jdbc.Driver");
				 Connection conn=DriverManager.getConnection(url,username,password);
				 PreparedStatement ps=conn.prepareStatement(sql);
				 ps.setInt(1,Integer.parseInt(request.getParameter("goldcarrot")));
				 ps.setFloat(2,Float.parseFloat(request.getParameter("weight")));
				 ps.setString(3,request.getParameter("jwellers"));
				 ps.setString(4,request.getParameter("address"));
				 ps.setString(5,request.getParameter("account_holder_name"));
				 ps.setString(6,request.getParameter("acctype"));
				 ps.setString(7,request.getParameter("account_number"));
				 ps.setInt(8,Integer.parseInt(request.getParameter("ifsc_code")));
				 ps.setString(9,request.getParameter("bank_name"));
				 ps.setString(10,request.getParameter("branch_name"));
				 
				
				 ps.executeUpdate();
			 }
			 catch(Exception e)
			 {
				 System.out.print(e);
				 response.sendRedirect("welcome.jsp");
				 
			 }
			int kn= Integer.parseInt(request.getParameter("account_number"))+1007;
			 HttpSession session=request.getSession();
			 session.setAttribute("kn",kn);
			 
			 response.sendRedirect("welcome.jsp");
			 
	}
	

}
