package section03.status;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/status")
public class StatusCodeTestServlet extends HttpServlet {
    public StatusCodeTestServlet() {}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //설명. 에러 상태, 메시지 전송
//        resp.sendError(404,"없는 페이지입니다. 경로 확인해주세요");
        resp.sendError(500,"서버 내부 오류. 서버 오류는 서버 개발자 잘못이고, 개발자는 우리"); //500은 개발자 잘못

    }
}