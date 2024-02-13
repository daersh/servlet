package chap3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

@WebServlet("/querystring")
public class QueryStringServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name= req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        Date birthday = Date.valueOf(req.getParameter("birthday"));
        String gender = req.getParameter("gender");
        String national = req.getParameter("national");
        String []hobbies =req.getParameterValues("hobbies");             //참고. 배열은 이렇게 받음

        printRequest(name, age, birthday, gender, national, hobbies);
    }

    private static void printRequest(String name, int age, Date birthday, String gender, String national, String[] hobbies) {
        System.out.println("name: " + name);
        System.out.println("age = " + age);
        System.out.println("birthday = " + birthday);
        System.out.println("gender = " + gender);
        System.out.println("national = " + national);
        System.out.println("hobbies = " + Arrays.toString(hobbies));
    }
}
