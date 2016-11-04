package cn.com.yves.spring.xmlLoad;

/**
 * java bean PoJo
 * 
 * @author Yves He
 * 
 */
public class HelloWorldBean {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
}