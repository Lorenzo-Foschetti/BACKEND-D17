package lorenzofoschetti.u5d2;

import lorenzofoschetti.u5d2.entities.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5d2Application.class);

        SpringApplication.run(U5d2Application.class, args);
        Menu menu = context.getBean(Menu.class);
        System.out.println(menu);
    }
}
