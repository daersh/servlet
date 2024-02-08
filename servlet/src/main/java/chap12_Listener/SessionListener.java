package chap12_Listener;

import chap10_Session.SessionHandlerServlet;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.*;

@WebListener
public class SessionListener implements HttpSessionListener, HttpSessionAttributeListener {
    public SessionListener() {
        System.out.println("session listener !");
    }

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

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session listener 인스턴스 생성");
        System.out.println("생성된 세션 id: "+ se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session listener 인스턴스 제거");
    }

}
