package belajar.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class MainApplicationClass extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(MainApplicationClass.class, args);
    }

}
