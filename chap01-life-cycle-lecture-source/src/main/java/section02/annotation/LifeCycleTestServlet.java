package section02.annotation;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * 목표<br><br>
 * 1. <br>
 */

@WebServlet(value = "/annotation-lifecycle")
public class LifeCycleTestServlet extends HttpServlet {

    public LifeCycleTestServlet() {
        System.out.println("annotation 방식 기본 생성자 실행!");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("annotation 매핑 init() method 호출");
    }

    @Override
    public void destroy() {
        System.out.println("annotation 매핑 destroy() 메소드 호출");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("annotation 매핑 service() 메소드 호출");

    }
}
