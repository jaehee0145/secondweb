package my.examples.secondweb;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//@WebServlet(name = "BoardListServlet", urlPatterns = "/board/list")
public class BoardListServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //request 객체가 key, value 값을 저장
        req.setAttribute("count", 100);
        List<Board> list = new ArrayList<>();
        list.add (new Board(808L, "name", "ps"));
        req.setAttribute("list", list);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/list.jsp");
        requestDispatcher.forward(req, resp);



    }
}
