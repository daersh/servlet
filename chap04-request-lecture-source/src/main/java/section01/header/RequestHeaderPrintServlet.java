package section01.header;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/headers")
public class RequestHeaderPrintServlet extends HttpServlet {
    public RequestHeaderPrintServlet() {}

    /**
         * <h2>Header</h2>
         * 요청시 전달되는 헤더가 어떤 정보들을 가지고 있는지 확인하기 위한 메서드이다. <br>
         * @헤더종류(4가지카테고리)_______
     * @1.General-Header: 요청 및 응답 모두에 적용되지만 최종적으로 body에 전송되는 것과는 관련이 없는 헤더이다.
     * @2.Request-Header: 패치 될 리소스나 클라이언트 자체에 대한 상세 정보를 포함하고 있는 헤더이다.
     * @3.Response-Header: 요청 위치나 서버 응답에 대한 부가적인 정보를 갖는 헤더이다.
     * @4.Entity-Header: 컨텐츠 길이나 MIME 타입과 같은 엔티팉 바디에 대한 상세 정보를 포함하는 헤더이다.
     * <br>(요청 및 응답 모두에서 사용되며, 메시지 바디의 컨텐츠를 나타내기에 GET요청은 해당되지 않는다.)
     * <br>(Content_length, Content-Type,Content-Language,Content-Encoding)
     *
     * */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Enumeration<String> headerNames= req.getHeaderNames();  // 설명. request의 헤더 이름들 저장
        while (headerNames.hasMoreElements()){                  //  출력
            System.out.println(headerNames.nextElement());
        }

    }

}
