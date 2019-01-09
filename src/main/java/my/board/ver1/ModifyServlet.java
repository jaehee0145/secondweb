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

@WebServlet(name = "ModifyServlet", urlPatterns = "/board/modify")
public class ModifyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Board> list = new ArrayList<>();
        Board b1 = new Board(1, "Jaehee", "즐거운 Java", "Java는 정말 즐겁습니다 :-) ");
        list.add(b1);
        req.setAttribute("list", list);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/modify.jsp");
        requestDispatcher.forward(req, resp);


    }
}
