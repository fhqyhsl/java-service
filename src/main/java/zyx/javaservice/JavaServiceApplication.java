package zyx.javaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class JavaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaServiceApplication.class, args);
    }
    @GetMapping("/list")
    public List<String> list() {
        return List.of("Java", "Python", "JavaScript");
    }
}