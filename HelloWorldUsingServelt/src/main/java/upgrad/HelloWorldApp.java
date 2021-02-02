package upgrad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class HelloWorldApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApp.class, args);
    }
}
