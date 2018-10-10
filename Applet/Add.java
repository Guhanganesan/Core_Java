import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Add")
public class Add extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String x = req.getParameter("x");
		String y =req.getParameter("y");
		
		int i =Integer.parseInt(x);
		int j =Integer.parseInt(y);
		
		int k=i+j;
		
		PrintWriter out = res.getWriter();
		out.println(k);
		
	}
}



Procedure:-

1. Install Eclispe JEE 
2. Install Tomcat apache server
3. Open Eclipse on JEE Perpective
4. Click Servers in console 
5. Expand Apache
6. Select tomcat version 7
7. Next
8. Go and copy the tomcat path ( Should copy the path before bin )
9. Paste this path in tomcat installation
10. Next
11. Finish
12. Check console (tomcat v 7 and start )
13. Double click for changing the port

