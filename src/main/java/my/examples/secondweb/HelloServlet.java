package my.examples.secondweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
 @Override
 protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
     resp.setContentType("text/html");
     PrintWriter out = resp.getWriter();

     out.println("<html>");
     out.println("<head><title>hello</title></head>");
     out.println("<body>");
     out.println("<h1> h1- hello</h1>");
     out.println("</body>");
     out.println("</html>");
 }


}
