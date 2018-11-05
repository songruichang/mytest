package cn.itcast.test;

import cn.itcast.service.BookService;
import cn.itcast.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        BookService service = (BookService)ac.getBean("bookServiceImpl");

        service.saveBook();
    }
}
