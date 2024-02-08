package chap1;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

/** <h1>서블릿 라이프 사이클</h1>
 * 서블릿은 초기화, 서비스(get,post..), destroy 과정을 거친다.
 * 사이클은 초기화 메서드를 통해 초기화를 진행한 후 서비스 메서드를 수행하다가 서비스(기능) 종료 시 destroy 메소드가 작동된다.
 * 서비스에는 doGet, doPost와 같은 메서드들이 해당한다.
 * @init(): 서블릿 요청이 최초인 경우 서블릿 객체를 생성하고 자동으로 호출하게 되는 메소드이다.
 *@service(): 서블릿에서 요청, 응답을 처리하는 메서드이다. 서블릿 컨테이너에 의해 호출되며 최초 요청 시에만 init() 이후에 동작하고,
 * 두번째 요청부터는 서비스 메서드만 호출하게 된다.<br>
 * response는 누가 요청했는지 되돌아 갈 곳에 대한 정보가 담겨 있다.
 * @destroy(): 컨테이너가 종료될 때 호출하는 메소드이다. 주로 자원을 반납하는 용도로 사용된다.
* */
@WebServlet()
public class XmlLifeCycleTestServlet extends HttpServlet {
    /** <h1>LifeCycleTestServlet</h1>
     * xml에서 서블릿으로 등록되어 jpa에서 xml을 통해 등록된 서블릿을 호출하여 접근할 수 있다.
     * */
    public XmlLifeCycleTestServlet() {
        System.out.println("xml 기본 생성자 실행..");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("xml 매핑 init() 메서드 호출");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("xml 매핑 service() 메서드 호출");
    }

    @Override
    public void destroy() {
        System.out.println("xml 매핑 destroy() 메서드 호출");
    }
}
