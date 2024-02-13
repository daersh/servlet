package chap7;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/chap07/print")
public class PrintLoginSuccessServlet extends HttpServlet {
    /*
    * 중요. 포워딩이 post로 오면 post로만 , get으로 오면 get으로만 처리할 것
    * */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("++++ 포워딩 된서블릿에서 넘겨받은 request 객체에 담긴 값 확인 ++++");
        System.out.println("이름: "+ req.getAttribute("userName"));
        System.out.println("아이디: "+ req.getParameter("userId"));
        System.out.println("비밀번호: "+ req.getParameter("password"));

        StringBuilder responseText = new StringBuilder();
        String userName = (String)req.getAttribute("userName");
        responseText.append("<h3 align=\"center\">\n")
                .append(userName)
                .append("님 환영합니다.</h3>");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print(responseText);
        out.flush();
        out.close();
    }
}
