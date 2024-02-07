package section01.othercite;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/othercite")
public class OtherCiteRedirectServlet extends HttpServlet {
    public OtherCiteRedirectServlet() {}
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get 요청 받으면 네이버사이트로 리다이렉");
        resp.sendRedirect("http://www.naver.com");
    }
}
