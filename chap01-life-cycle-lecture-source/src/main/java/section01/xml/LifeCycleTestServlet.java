package section01.xml;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;


/** <h1>서블릿 라이프 사이클</h1>
 * init() -> service() 반복(doGet() || doPost() 동작) -> destroy();
 * */
public class LifeCycleTestServlet extends HttpServlet {
    /**<h2>기본생성자</h2>*/
    public LifeCycleTestServlet() {
        System.out.println("xml 기본 생성자 실행!");
    }

    /**<h2>init()</h2>
     * 서블릿 요청이 최초인 경우 서블릿 객체를 새엇ㅇ하고 자동으로 호출하게 되는 메소드
     * */
    @Override
    public void init(ServletConfig config)throws ServletException{
        System.out.println("xml 매핑 init() method 호출");
    }

    /**
     * <h2>destroy()</h2>
     * 컨테이너가 종료될 때 호출하는 메소드이며 주로 자원을 반납하는 용도로 사용된다.
     * */
    @Override
    public void destroy(){
        System.out.println("xml 매핑 destroy() 호출");
    }

    /**
     * <h2>service()</h2>
     * servlet에서 요청과 응답을 처리하는 메서드<br>
     * 서블릿 컨테이너에 의해 호출되며 최초 요청 시에만 init() 이후에 동작하고, 두 번째 요청부터는 바로 service()만 호출하게 된다.<br>
     * response: 누가 요청했는지 되돌아 갈 곳에 대한 정보가 담겨 있다.
     * */
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("xml mapping service() method start....");
    }

}
