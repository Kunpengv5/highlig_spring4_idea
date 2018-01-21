package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


@Configuration  //声明当前是一个配置类
@ComponentScan("com.wisely.highlight_spring4.ch1.di")  //自动扫描报名下所有使用@Serivce、@Component、@Respository和@Controller的类，并注册为Bean
public class Diconfig {

}
