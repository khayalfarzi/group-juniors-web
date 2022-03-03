package az.iktlab.groupjuniorsweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class GroupJuniorsWebApplication {

    public static void main(String[] args) {

        SpringApplication.run(GroupJuniorsWebApplication.class, args);

    }

    @PostConstruct
    public static void postCons() {
        System.out.println("Post constructor running");
    }
}