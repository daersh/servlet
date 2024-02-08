package chap10_Session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/session")
public class SessionHandlerServlet extends HttpServlet {
    public SessionHandlerServlet() {}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

        /*설명.
           요청이 서블릿으로 들어올 때 HttpServletRequest 에는 JSESSIONID라는 값이 헤덩와
           함께 포함되어 넘어온다. 그럼 해당 JSESSIONID에 맞는 HTTPSession 객체를 생성하여
           헤당 사용자를 위한 전용 저장 공간을 제공하게 된다.
           (요청을 보낸 사람 전용 세션 저장 공간을 생성한다.)
         */
        HttpSession session = req.getSession();
        /*목차 1. 세션 시간 default 확인 = 1800 */
        System.out.println("세션 객체의 default 유지 시간(초): "+session.getMaxInactiveInterval());   //결과. 1800(30분)
        /*목차 2. 세션 시간 10분으로 변경 후 유지시간 확인*/
        session.setMaxInactiveInterval(60*10);
        System.out.println("세션 객체의 default 유지 시간(초): "+session.getMaxInactiveInterval());   //결과. 1800(30분)
        /*목차 3. 세션 아이디 확인*/
        System.out.println("session id: "+ session.getId());

        /*목차 3. 세션 속성 설정*/
        session.setAttribute("firstName",firstName);
        session.setAttribute("lastName",lastName);

        /*목차 4. 리다이렉트 후 세션 확인하기 위함 */
        resp.sendRedirect("SessionRedirect");

    }
}
