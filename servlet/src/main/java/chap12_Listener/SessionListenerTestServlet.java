package chap12_Listener;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/chap12/session")
public class SessionListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*설명. 사용자가 입력한 값을 꺼내 DB에서 일치하는 회원을 찾고(로그인 성공) 해당 회원 정보를 세션에 담는 느낌의 예제이다. */
        System.out.println("session listener 확인용 서블릿");
        HttpSession session = req.getSession();

        session.setAttribute("userName","honggildong");
        session.setAttribute("age",20);
        session.setAttribute("gender","M");
        session.setAttribute("userName","hong");
        //설명. 객체를 담고 제거해보기
        session.setAttribute("user",new UserDTO("hongildong",20));
        session.removeAttribute("user");
        session.invalidate();
    }
}
