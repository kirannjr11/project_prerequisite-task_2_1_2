import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld1 = applicationContext.getBean("getHelloWorld", HelloWorld.class);
        HelloWorld helloWorld2 = applicationContext.getBean("getHelloWorld", HelloWorld.class);
        System.out.println("Comparing the helloworld beans: " + (helloWorld1 == helloWorld2) );

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println("Comparing the Cat beans: " +(cat1 == cat2));
    }
}