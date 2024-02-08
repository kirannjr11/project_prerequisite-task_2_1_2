import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("hello world");
        return helloWorld;
    }


    @Bean(name = "cat")
    @Scope("prototype")
    public Cat getCat() {
        return new Cat("fluffy");
    }
}