package chap10_Session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/delete")
public class DeleteSessionDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        System.out.println("attribute 만료 전 firstName: "+session.getAttribute("firstName"));
        System.out.println("attribute 만료 전 lastName: "+session.getAttribute("lastName"));

        //목차 1. 세션 무효화시키는 메서드 호출
        //설명. 세션이 이제 없어 담긴 데이터가 있을 수 없다. -> 로그아웃 기능을 구현할 때 사용
        // 현재 사용자 세션의 모든 데이터가 삭제되고 해당 세션은 더 이상 유효하지 않게 된다.
        session.invalidate();

        /*설명. 세션이 무효화되어 attribute를 가져올 수 없게 되고 500 에러 발생한다.*/
        System.out.println("attribute 만료 후 firstName: "+session.getAttribute("firstName"));
        System.out.println("attribute 만료 후 lastName: "+session.getAttribute("lastName"));

    }
}
