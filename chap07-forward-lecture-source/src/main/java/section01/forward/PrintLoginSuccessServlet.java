package section01.forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/print")
public class PrintLoginSuccessServlet extends HttpServlet {
    public PrintLoginSuccessServlet() {}

    //설명.이전 서블릿이 doPost로 처리하다가 포워딩 되면 doPost받음(doGet은 doGet)
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("++++ 포워딩 된서블릿에서 넘겨받은 request 객체에 담긴 값 확인 ++++");
        System.out.println("이름: "+ req.getAttribute("userName"));
        System.out.println("아이디: "+ req.getParameter("userId"));
        System.out.println("비밀번호: "+ req.getParameter("password"));

    }
}
