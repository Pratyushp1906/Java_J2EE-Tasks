package com.wipro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.myConfig.MyConfiguration;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Student student = (Student)context.getBean("xyz");
        System.out.println(student);

    }
}
