package com.example.hello.firsthello;

import com.example.hello.firsthello.controller.StudentController;
import com.example.hello.firsthello.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@SpringBootApplication(scanBasePackageClasses = {MainController.class, StudentController.class})
@EnableJpaRepositories(basePackageClasses = StudentRepository.class)
//@ComponentScan(basePackageClasses = MainController.class)
public class FirsthelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirsthelloApplication.class, args);
        log.debug("First spring boot application");
    }

}

