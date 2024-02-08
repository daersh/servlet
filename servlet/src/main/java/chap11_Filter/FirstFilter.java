package chap11_Filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * <h1>Filter</h1>
 * WebFilter 어노테이션에 url 경로를 넣어 해당 요청 시 필터가 동작한다.
 * <br>
 * '/*'은 모든 요청 경로를 의미한다.
 * */
@WebFilter("/first/*")
public class FirstFilter implements Filter {
    public FirstFilter() {
        System.out.println("FirstFilter.FirstFilter 인스턴스 생성");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FirstFilter.init 호출");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        /*목차 1.다음 필터 또는 서블릿으로 가기 전 전처리를 위한 코드를 여기에 작성*/
        System.out.println("FirstFilter.doFilter 호출");

        /*목차 2.FilterChain 에 제공하는 doFilter 를 활용하여 다음 필터 또는 서블릿으로 진행시킬 수 있다.*/
        filterChain.doFilter(servletRequest,servletResponse);

        /*목차 3.서블릿에서 클라로 다기 전 후처리를 위한 코드를 여기에 작성*/
        System.out.println("서블릿 다녀온 후");
    }

    @Override
    public void destroy() {
        System.out.println("FirstFilter.destroy 호출");
    }
}
