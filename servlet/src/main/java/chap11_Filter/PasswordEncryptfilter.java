package chap11_Filter;

import chap11_Filter.uses.RequestWrapper;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

import java.io.IOException;

@WebFilter("/member/*")
public class PasswordEncryptfilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("password filter 호출");
        /*설명. 기존 요청 객체에서 우리가 재정의한 요청 객체로 교체*/
        RequestWrapper wrapper = new RequestWrapper((HttpServletRequest)servletRequest);
        String password =  wrapper.getParameter("password");
        System.out.println("password = " + password);

        filterChain.doFilter(wrapper,servletResponse);

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
