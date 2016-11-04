package cn.com.yves.spring.xmlLoad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 三种不同的加载方式来加载 spring配置文件 获取bean; ApplicationContext 接口的三个常用子实现
 * 
 * @author Yves He
 * 
 */
public class Test {

	public static void main(String[] args) {

		/* 1.FileSystemXmlApplicationContext */
		// xmlLoad1();

		/* 2.ClassPathXmlApplicationContext */
		xmlLoad2();

		/* 3.WebXmlApplicationContext */
		// xmlLoad3();
	}

	private static void xmlLoad1() {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"D:/Data/MyEclipse 10_JDBC/spring/src/cn/com/yves/spring/xmlLoad/config/Beans.xml");

		HelloWorldBean obj = (HelloWorldBean) context.getBean("helloWorld");

		obj.getMessage();
	}

	private static void xmlLoad2() {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"cn/com/yves/spring/xmlLoad/config/Beans.xml");
		// 此种方式是相对classPath

		HelloWorldBean obj = (HelloWorldBean) context.getBean("helloWorld");

		obj.getMessage();
	}

//	private static void xmlLoad3() {
//		ApplicationContext context = new WebXmlApplicationContext(
//				"config/Beans.xml");// 默认路径是classPaht : 注意: 也可以自己写一个绝对路径
//
//		// getBean()方法里面放的是xml中bean下id属性
//		HelloWorldBean obj = (HelloWorldBean) context.getBean("helloWorld");
//
//		obj.getMessage();
//	}

}