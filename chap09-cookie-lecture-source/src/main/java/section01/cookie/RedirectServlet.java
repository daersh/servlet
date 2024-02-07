package section01.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    //리다이렉은 포워드와 달리 get 안맞춰도 되나봄
    /**
     * <h2>쿠키를 불러오는 방법</h2>
     * @1. 요청 헤드에서 쿠키 목록을 쿠키 배열 형태로 꺼낸다.
     * @2. 쿠키의 getName(), getValue()메서드를 통해 쿠키의 담긴 키,값 출력
     * */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie []cookies = req.getCookies();
        String firstName="";
        String lastName="";

        for(Cookie cookie: cookies){
            System.out.println(cookie.getName()+": "+cookie.getValue());
            if("firstName".equals(cookie.getName()))
                firstName=cookie.getValue();
            else if("lastName".equals(cookie.getName()))
                lastName=cookie.getValue();
        }
        StringBuilder responseText = new StringBuilder();
        responseText
                .append("<h3>당신의 이름은 "+firstName)
                .append("<br>당신의 성은 "+lastName)
                .append("</h3>");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print(responseText);
        out.flush();
        out.close();
    }
}
