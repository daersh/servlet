package chap1;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

@WebServlet("/annotation-lifecycle")
public class AnnotationLifeCycleTestServlet extends HttpServlet {
    public AnnotationLifeCycleTestServlet() {}
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
