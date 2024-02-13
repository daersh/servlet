package chap3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/formdata")
public class FormDataServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //        req.setCharacterEncoding("UTF-8");  // 참고. 옛날 톰캣(9버전 이하)들은 이걸 해야 한글 지원해주니 알아만 둘 것
        //설명. 키 값을 통해 파라미터들을 하나씩 꺼내는 과정은 GET과 동일
        String name = req.getParameter("name");
        //설명. 요청으로 넘어오는 파라미터들의 키 값들을 한번에 확인하기 위함.
        Enumeration<String> names =  req.getParameterNames();
        while (names.hasMoreElements()){
            System.out.println("names = " + names.nextElement());
        }
    }
}

