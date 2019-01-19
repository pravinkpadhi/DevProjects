package com.example.hello.firsthello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MainController {

    @GetMapping("/welcome")
    public String firstController(@RequestParam("name") String name){
        log.debug("Called main controller method firstController with input : {}", name);
        if(StringUtils.isEmpty(name)){
            return "My world my rules. Enter name to continue";
        }
        return name + " :-Welcome to the world of Spring boot";
    }
}
