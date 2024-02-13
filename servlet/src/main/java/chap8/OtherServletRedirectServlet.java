package chap8;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/chap08/otherservlet")
public class OtherServletRedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("test","abc");
        //설명.
        // 리다이렉트 시켰을 때 여기 정보들도 같이 딸려가는지? -> null뜸
        //   이유: 리다이렉트는 클라이언트에 다시 재전송 하라는 것이기 때문에
        //        처음 요청했던 데이터는 리다이렉 대상에 갈 수 없다.
        //>결과.리다이렉트 이후 오는 서블릿은 기존과 다른 새로운 req,resp 객체로 온다!!<
        //설명. 리다이렉트에서 전달 방법
        // 다른 서블릿으로 갈 때 뒤에 ?parameter 추가하면 어느정도 전달 가능!
        resp.sendRedirect("redirect?test=abc");
    }
}
