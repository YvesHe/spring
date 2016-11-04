package cn.com.yves.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * hello 包下,主要是一个关于spring的hello demo用于快速入门.
 * 
 * @author Yves He
 * 
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"cn\\com\\yves\\spring\\hello\\config\\Beans.xml");// 默认路径是classPaht
																	// : 注意:
																	// 也可以自己写一个绝对路径

		// getBean()方法里面放的是xml中bean下id属性
		HelloWorldBean obj = (HelloWorldBean) context.getBean("helloWorld");

		obj.getMessage();
	}
}