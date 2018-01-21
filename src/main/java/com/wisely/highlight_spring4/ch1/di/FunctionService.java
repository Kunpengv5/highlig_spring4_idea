package com.wisely.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;

@Service //使用Service声明当前类是Spring管理的一个Bean
//使用@Component @Service @Respository和@Controller是等效的
public class FunctionService {
    public String sayHello(String word){
        return  "Hello " + word + "!";
    }
}
