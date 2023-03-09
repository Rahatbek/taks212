import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanSecond = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean == beanSecond);

        Cat firstCal = applicationContext.getBean(Cat.class);
        Cat secondCal = applicationContext.getBean(Cat.class);
        System.out.println(firstCal == secondCal);

        System.out.println(firstCal.hashCode());
        System.out.println(secondCal.hashCode());
    }
}