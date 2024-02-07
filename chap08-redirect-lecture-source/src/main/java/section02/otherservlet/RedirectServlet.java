package section02.otherservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * <h2>1.Redirect 값 전달</h2>
 * redirect 시에는 request의 attribute 개념으로 다른 서블릿에게 값(상태)을 전달할 수 있다.<br>
 * 이유: 다음 서블릿으로 클라이언트가 새로 요청하면 기존 request와 response객체가 아닌 새로운
 * request와 response 객체가 만들어지며 요청하기 때문이다.<br>
 * 추가로 쿠키나 세션같은 공간을 활용하여 값 공유 가능하다.<br><br><br><br>
 *
 * <h2>2.포워딩 vs 리다이렉트</h2>
 * @포워딩: 요청, 응답 객체를 유지하여 요청 처리를 하고 싶다
 * @리다이렉트: 클라이언트가 새로고침을 할 때마다 처음 요청하는 서블릿을 다시 호출하게 하고 싶지 않다.(insert같은 경우)
 * @결론: 포워딩은 요청,응답을 활용하여 다음 서블릿으로 값을 넘길 수 있다. <br>
 * 리다이렉트는 쿼리 스트링 형태로 파라미터의 개념을활용하여 다음 서블릿으로 값을 넘겨 줄 수 있다.
 *
 *
 * */
@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //설명. 리다이렉트 이후 오는 서블릿은 기존과 다른 새로운 요청, 응답 객체로 온다.!
        System.out.println("리다이렉 이후 request의 attribute: "+req.getAttribute("test"));   //참고 null
        //설명. 파라미터가 넘어오면 request 객체가 달라져도 값이 전달되어 온다.
        System.out.println("리다이렉 이후 request의 parameter: "+req.getParameter("test"));    //참고. 파라미터로 받는것만 데이터 담김!!
    }
}
