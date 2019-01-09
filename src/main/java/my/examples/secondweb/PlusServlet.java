package my.examples.secondweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PlusServlet", urlPatterns = "/plus")
public class PlusServlet extends HttpServlet {
 @Override
 protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
     // request 정보중 파라미터 "val1"을 val1str으로 저장
     String val1str = req.getParameter("val1");
     String val2str = req.getParameter ("val2");
     // val1 초기화
     int a=0;
     int b = 0;

     //val1str의 값을 Integer로 형변환해서 val1에 저장
     a = Integer.parseInt(val1str);
     b= Integer.parseInt(val2str);

     resp.setContentType("text/html");
     PrintWriter out = resp.getWriter();
out.println(a+b);

 }
}
