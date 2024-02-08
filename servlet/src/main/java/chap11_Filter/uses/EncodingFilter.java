package chap11_Filter.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter("/member/*")
public class EncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        /*설명 1. 우린 톰캣 10 버전인데 톰캣 10 버전은 기본 인코딩 설정이 UTF-8이기 때문에 안해줘도 됨*/
        /*설명 2. 요청이 POST 요청일 때는 UTF-8로 인코딩 설정을 사전 처리 해 주고 이후 필터나 서블릿으로 넘길 수 있다. */
//        if(httpServletRequest.getMethod().equals("POST")){// 중요. 만약 nullpointerException 발생 할 수 도 있기 때문에 반대로 할것
        if("POST".equals(httpServletRequest.getMethod())){
            httpServletRequest.setCharacterEncoding("UTF-8");
        }

        filterChain.doFilter(servletRequest,servletResponse);


    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
