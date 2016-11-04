package cn.com.yves.spring.hello;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * 测试类
 * 
 * @author Yves He
 * 
 */
public class Test2 {
	public static void main(String[] args) {
		// 改方法已经过时了
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"cn\\com\\yves\\spring\\hello\\config\\Beans.xml"));
		HelloWorldBean obj = (HelloWorldBean) factory.getBean("helloWorld");
		obj.getMessage();
	}
}