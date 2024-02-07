package section01.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cookie")
public class CookieHandlerServlet extends HttpServlet {
    public CookieHandlerServlet() {}
    /**
     * <h1>쿠키</h1>
     * @쿠키 (클라이언트의 브라우저에 저장)를 생성하고 사용하는 방법
     * @1. 쿠키 인스턴스를 생성한다.
     * @2. 해당 쿠키의 만료시간을 설정한다.
     * @3. 응답 헤더에 쿠키를 담는다.
     * @4. 응답한다.
     * */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fName = req.getParameter("firstName");
        String lName = req.getParameter("lastName");

        System.out.println("이름 = " + fName);
        System.out.println("성 = " + lName);
        //목차 1. 쿠키 인스턴스 생성
        Cookie firstNameCookie = new Cookie("firstName",fName);
        Cookie lastNameCookie = new Cookie("lastName",lName);
        //목차 2. 시간설정
        firstNameCookie.setMaxAge(60*60*24);    //초단위. 하루를 만료 시간으로 정해봄
        lastNameCookie.setMaxAge(60*60*12);    //초단위. 반나절을 만료 시간
        //목차 3. 응답헤더에 쿠키 담기
        resp.addCookie(firstNameCookie);
        resp.addCookie(lastNameCookie);

        resp.sendRedirect("redirect");
    }
}
