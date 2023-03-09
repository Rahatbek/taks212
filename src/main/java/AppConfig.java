import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public Cat getCat() {
        Cat cal = new Cat();
        cal.setMessage("I'm a message from Cal.class");
        return cal;
    }
}