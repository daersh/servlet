package section01.servicemethod;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet ("/request-service")
public class ServiceMethodTestServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("req = " + req);
        System.out.println("resp = " + resp);
        HttpServletRequest httpServletRequest = (HttpServletRequest) req;
        HttpServletResponse HttpServletResponse = (HttpServletResponse) resp;
        String httpMethod = httpServletRequest.getMethod();
        System.out.println("요청 방식: " + httpMethod);
        if("GET".equals(httpMethod)){
            doGet(httpServletRequest,HttpServletResponse);
        }else if("POST".equals(httpMethod)){
            doPost(httpServletRequest,HttpServletResponse);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청을 처리할 메소드 호출 됨...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST 요청을 처리할 메소드 호출 됨...");
    }
}
