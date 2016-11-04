package cn.com.yves.spring.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * 
 * 
 * @author Yves He
 * 
 */
public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "cn/com/yves/spring/beanpostprocessor/config/Beans.xml");
        UserBean userBean = (UserBean) context.getBean("userBean");
        userBean.getMessage();

        // 关闭context来触发执行UserBean的destroy方法,不然不会触发.
        // 特别注意:只有当bean的scope属性为singleton时，也就是以单例模式创建bean，bean的销毁才由SpringContainer管理，才会执行destroy方法。
        ((ClassPathXmlApplicationContext) context).close();

    }
}