package chap5;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

@WebServlet("/chap05/responseHeader")
public class ResponseHeaderPrintServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //참고. response객체를 생성할 때에는 MIME 타입 및 인코딩 고려할 것
        resp.setContentType("text/html");// 설명. 미리 한글 인코딩 시켜둠

        /*목차 1. 현재 시간 출력하기*/
        PrintWriter out = resp.getWriter();
        long curentTime = System.currentTimeMillis();
        out.print("<h1>"+ curentTime +"</h1>");
        out.print("<h1>"+ new java.util.Date(curentTime)+"</h1>");
        out.flush();
        out.close();

        /*목차 2. response 객체의 헤더 값에 대한 ket,value 값을 한번에 확인해보기*/
        Collection<String> responseHeaders = resp.getHeaderNames();
        Iterator<String> iter = responseHeaders.iterator();
        while (iter.hasNext()){
            String headerName= iter.next();
            System.out.println(headerName+": "+resp.getHeader(headerName));
        }    }
}
