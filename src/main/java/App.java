import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(applicationContext.getBean("helloworld").equals(applicationContext.getBean("helloworld")));
        System.out.println( applicationContext.getBean("cat").equals( applicationContext.getBean("cat")));

    }
}