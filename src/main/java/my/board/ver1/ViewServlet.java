package my.board.ver1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ViewServlet", urlPatterns = "/board/view")
public class ViewServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Board> list = new ArrayList<>();
        list.add(new Board(1, "Jaehee", "Java", "JSTL forEach 사용시 Getter가 필수!"));

        req.setAttribute("list", list);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/view.jsp");
        requestDispatcher.forward(req, resp);


    }
}
