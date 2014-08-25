package com.vedroid.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        IMessageRenderer mr = ctx.getBean("renderer", IMessageRenderer.class);
        mr.render();
    }
}
