package chap12_Listener;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener, ServletContextAttributeListener {
    public ContextListener() {
        /*설명. context가 생성될 때 변화를 감지하는 리스터 인스턴스가 함께 생성*/
        System.out.println("context listner 인스턴스 생성");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        /*설명. context에 속성 추가될 때 동작*/
        System.out.println("context attribute added!");
    }
    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        /*설명. context에 속성 제거될 때 동작*/
        System.out.println("context attribute removed!");
    }
    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        /*설명. context에 속성 변경될 때 동작*/
        System.out.println("context attribute replaced!");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        /*설명. context가 생성될 때 생성자 호출 이후 동작하는 메서드*/
        System.out.println("context init!");

    }
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        /*설명. context가 소멸될 때 동작하는 메서드*/
        System.out.println("context destroyed! ");
    }

}
