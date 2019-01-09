package my.board.ver1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "WriteServlet", urlPatterns = "/board/write")
public class WriteServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/write.jsp");
        requestDispatcher.forward(req, resp);
    }
}
