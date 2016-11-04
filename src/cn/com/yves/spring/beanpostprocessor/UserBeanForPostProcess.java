package cn.com.yves.spring.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * java bean PoJo
 * 
 * @author Yves He
 * 
 */
public class UserBeanForPostProcess implements BeanPostProcessor {

	/* 来自接口 BeanPostProcessor 未实现的两个方法 */
	@Override
	public Object postProcessAfterInitialization(Object obj, String mesasge)
			throws BeansException {// 实例化后将执行的方法
		System.out.println("实例化之后!" + mesasge);
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String mesasge)
			throws BeansException {// 实例化之前会执行的方法
		System.out.println("实例化之前!" + mesasge);
		return obj;
	}
}