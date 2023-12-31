package org.maven.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ref.xml");
        A a = (A) context.getBean("aref");
        System.out.println(a.getX());
        System.out.println(a.getOb().getY());
    }
}
