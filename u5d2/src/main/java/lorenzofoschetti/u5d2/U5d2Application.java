package lorenzofoschetti.u5d2;

import lorenzofoschetti.u5d2.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5d2Application {

    public static void main(String[] args) {

        SpringApplication.run(U5d2Application.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5d2Application.class);

        SpringApplication.run(U5d2Application.class, args);
        Menu menu = context.getBean(Menu.class);
        System.out.println(menu);
    }

}
