package chap5;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/chap05/response")
public class ResponseTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n")     //참고. 이렇게 작성하기 불편하여 jsp가 만들어짐
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>")
                .append("<h1>servlet response</h1>")
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

        out.print(sb);
        out.flush();
        out.close();

    }
}
