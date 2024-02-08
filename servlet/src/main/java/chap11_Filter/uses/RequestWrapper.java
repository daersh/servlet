package chap11_Filter.uses;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class RequestWrapper extends HttpServletRequestWrapper {
    public RequestWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String key) {
        String value = "";
        if("password".equals(key)){
            System.out.println("진행중....");
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            value = passwordEncoder.encode(super.getParameter("password"));

        }else{
            value = super.getParameter(key);
        }

        System.out.println("value = " + value);
        return value;
    }
}
