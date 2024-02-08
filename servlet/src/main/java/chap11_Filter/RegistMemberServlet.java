package chap11_Filter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/member/regist")
public class RegistMemberServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userID =req.getParameter("userId");
        String password=req.getParameter("password");
        String name = req.getParameter("name");
        System.out.println("userID = " + userID);
        System.out.println("password = " + password);
        System.out.println("name = " + name);
    }
}