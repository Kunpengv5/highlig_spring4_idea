package com.wisely.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //使用Service声明当前类是Spring管理的一个Bean
//使用@Component @Service @Respository和@Controller是等效的
public class UseFunctionService {
    @Autowired //使用Autowired将FunctionService的一个实例注入到UseFunctionService中，让UseFunctionService具备FunctionService的功能。
            //此处使用@Inject注解或者@Resource注解是等效的
    FunctionService functionService;
    public String sayHello(String word){
        return  functionService.sayHello(word);
    }
}
