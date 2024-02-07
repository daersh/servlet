package section01.forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/forward")
public class ReceiveInformationServlet extends HttpServlet {
    public ReceiveInformationServlet() {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId= req.getParameter("userId");
        String password= req.getParameter("password");
        System.out.println("userId = " + userId);
        System.out.println("password = " + password);
        /*설명.
            * 이 부분에서는 id와 pwd에 해당하는 유저의 정보를 select하고 확인하는 비즈니스 로직(BL)이 수행되어야 한다.
                *(이름을 조회해서 이름을 알게 된다.)
            * 우리는 제대로 조회 되었다는 가정하에 'xxx님 환영합니다'와 같은 메시지를 출력하는 화면을 만들어서 응답해보자.
            parameter : 브라우저(사용자)에서 넘어온 값
            attribute : 개발자가 코딩으로 설정하는 값
        * */
        req.setAttribute("userName","홍길동");

        /*설명. 화면을 만들어 응답 하는(화면 잘 만드는) 서블릿에 포워딩(위임)*/
        RequestDispatcher rd = req.getRequestDispatcher("print"); //설명. '/print' 요청을 받을 수 있는 서블릿 정보를 가지고 만들어짐
        rd.forward(req,resp);


    }
}
