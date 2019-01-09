package my.board.ver1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListServlet", urlPatterns = "/board/list")
public class ListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Board> list = new ArrayList<>();
        list.add(new Board(1,"jaehee", "즐거운 Java"));
        list.add(new Board(2, "재희", "너무너무 재밌다"));
        req.setAttribute("list", list);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/list.jsp");
        requestDispatcher.forward(req, resp);


    }
}
