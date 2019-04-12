package io.java.a.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class CourseApiApp {
 
    public static void main(String[] args)  {
        SpringApplication.run(CourseApiApp.class, args);
    }
}
