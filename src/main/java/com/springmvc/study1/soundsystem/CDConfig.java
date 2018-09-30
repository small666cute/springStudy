package com.springmvc.study1.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//定义BlankDisc自己的配置类？？
@Configuration
public class CDConfig {
    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }
}
