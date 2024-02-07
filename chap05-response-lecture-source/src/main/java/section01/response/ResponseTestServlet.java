package section01.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {
    public ResponseTestServlet() {}

    /**
     * <h2>SERVLET</h2>
     *  @<h3>서블릿의기능또는사용목적</h3>
     *  @1.요청받기: http method GET/POST 요청에 따른 파라미터로 전다 받은 데이터를 꺼낼 수 있다.
     *  @2.비즈니스로직처리: DB접속과 CRUD에 대한 로직 처리 시작 부분 -> 서비스 게층 호출(MVC2구조 기반)
     *  @3.응답하기: 문자열을 통한 동적인 웹(HTML)페이지를 만ㄴ들어서 스트림을 통해 내보낼 수 있다.(SSR기술 [반대는 CSR?])
     * */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder responseBuilder = new StringBuilder();
        responseBuilder.append("<!DOCTYPE html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>")
                .append("<h1>하servlet response</h1>")
                .append("</body>")
                .append("</html>");

//        resp.setContentType("text/plain");                 //참고. 이 옵션 넣으면 위 코드로 웹으로 변환 안되고 그냥 출력됨
        // 목차. 톰캣 10버전 이전
        //설명. 1.MIME 타입과 인코딩 방식을 response 객체를 이용하여 따로 설정
        //resp.setContentType("text/html");                 //참고. 이 옵션 넣으면 위 코드로 웹으로 변환 안되고 그냥 출력됨
        //resp.setCharacterEncoding("UTF-8");
        //설명. 2.한번에 설정
        //resp.setContentType("text/html; charset=UTF-8");

        // 목차. 톰캣 10버전 이후
        // 설명. MIME 타입만 명시해도 인코딩 방식도 UTF-8로 적용된다.
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter(); //참고. 위 setcontentType과 순서 바뀌어도 왠지 모르겠는데 잘 적용됨

        out.print(responseBuilder);
        out.flush();
        out.close();
    }
}
