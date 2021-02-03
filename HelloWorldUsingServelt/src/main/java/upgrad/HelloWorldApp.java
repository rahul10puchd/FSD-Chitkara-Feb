package upgrad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication  /*this defines that you are using SpringBoot here to create a web application.
Spring Boot comes with an embedded Tomcat server, which provides you with the servlet container.*/

@ServletComponentScan   /*this annotation tells your application class to look for the servlet class
 you have created annotated with @WebServlet.*/

public class HelloWorldApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApp.class, args);
    }
}
