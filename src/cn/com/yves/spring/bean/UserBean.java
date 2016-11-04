package cn.com.yves.spring.bean;

/**
 * java bean PoJo
 * 
 * @author Yves He
 * 
 */
public class UserBean {

    private String name;
    private int age;
    private String message;

    /* 在xml中的生命周期配置中配置调用即可, 方法名可以随便取,对应即可. */
    /*
     * 第二种方式是: UserBean直接实现两个接口
     * InitializingBean和DisposableBean达到同样效果,这样要执行的操作在写在覆盖的方法里面即可
     * ,就不需要在xml中配置了,但是对spring框架的依耐性就很高了
     */
    // 该类用来类加载的初始化的方法,带有 void 无参数方法
    public void init() {
        System.out.println("UserBean 调用初始化方法.");
    }

    // 该类用来类实例销毁时 调用的方法,带有 void 无参数方法
    public void destroy() {
        System.out.println("UserBean 调用销毁方法.");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void getName() {
        System.out.println("Your name : " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}