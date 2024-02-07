package section01.querystring;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

@WebServlet("/querystring")
public class QueryStringTestServlet extends HttpServlet {
    public QueryStringTestServlet() {}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name= req.getParameter("name");
        System.out.println("name: " + name );
        int age = Integer.parseInt(req.getParameter("age"));            //참고. 무조건 String 반환이기 때문에 변환 필요
        System.out.println("age = " + age);

        Date birthday = Date.valueOf(req.getParameter("birthday"));     //참고. java.sql.Date임
        System.out.println("birthday = " + birthday);

        String gender = req.getParameter("gender");
        System.out.println("gender = " + gender);
        String national = req.getParameter("national");
        System.out.println("national = " + national);
        String []hobbies =req.getParameterValues("hobbies");             //참고. 배열은 이렇게 받음
        System.out.println("hobbies = " + Arrays.toString(hobbies));

    }

}
