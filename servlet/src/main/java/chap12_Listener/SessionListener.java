package chap12_Listener;

import chap10_Session.SessionHandlerServlet;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.*;

@WebListener
public class SessionListener implements HttpSessionListener, HttpSessionAttributeListener/*, HttpSessionBindingListener*/ {
    /*설명. 세션은 주로 객체를 담기 위해 사용한다.!!*/
    public SessionListener() {
        System.out.println("session listener !");
    }
    /*목차 1. HttpSessionListener*/
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("session attribute added!");
        System.out.println("session 추가 된 속성: " +event.getName()+", "+event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("session attribute removed!");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("session attribute replaced!");
    }
    /*목차 2. HttpSessionAttributeListener*/
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session listener 인스턴스 생성");
        System.out.println("생성된 세션 id: "+ se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session listener 인스턴스 제거");
    }

    /*목차 3.HttpSessionBindingListener*/
    // 해당 인터페이스(바인딩 인터페이스)는 SessionListen 가 아닌 세션에 담기는 타입의 클래스에 각각 정의해야 한다. (DTD 같은 곳에)
    /*@Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("bound");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("unbound");
    }*/
}
