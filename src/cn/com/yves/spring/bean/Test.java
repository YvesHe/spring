package cn.com.yves.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * bean 作用域
 * 
 * @author Yves He
 * 
 */
public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "cn/com/yves/spring/bean/config/Beans.xml");
        // 此种方式是相对classPath

        /* Bean 作用域的讨论 */

        // 1.单例模式singleton: 两次同一个对象,结果相同
        UserBean obj1 = (UserBean) context.getBean("helloWorld");
        UserBean obj2 = (UserBean) context.getBean("helloWorld");
        System.out.println(obj1 == obj2);// true
        obj1.getMessage();// 两次结果一样
        obj2.getMessage();

        // 2.典型模式prototype: 每次都是不同的对象,结果不同
        UserBean obj3 = (UserBean) context.getBean("helloWorld");
        UserBean obj4 = (UserBean) context.getBean("helloWorld");
        System.out.println(obj3 == obj4);// false

        obj1.getMessage();// 两次结果一样,以为xml中配置了properties属性
        obj2.getMessage();

        obj1.setName("yves");// 两次结果不一样
        obj1.getName();// yves
        obj2.getName(); // null

        // 关闭context来触发执行UserBean的destroy方法,不然不会触发.
        // 特别注意:只有当bean的scope属性为singleton时，也就是以单例模式创建bean，bean的销毁才由SpringContainer管理，才会执行destroy方法。
        ((ClassPathXmlApplicationContext) context).close();
    }
}