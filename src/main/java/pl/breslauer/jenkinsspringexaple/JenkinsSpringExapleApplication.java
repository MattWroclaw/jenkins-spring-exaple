package pl.breslauer.jenkinsspringexaple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsSpringExapleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsSpringExapleApplication.class, args);
    }

    @GetMapping
    public String get(){
        return "Viva Wroclaw";
    }
}
