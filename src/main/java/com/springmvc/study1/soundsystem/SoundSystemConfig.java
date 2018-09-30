package com.springmvc.study1.soundsystem;

import com.springmvc.study1.CDPlayerConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//这是一个更高级别的配置类，把两个配置类组合在一起
@Configuration
@Import({CDPlayerConfig.class ,CDConfig.class })
public class SoundSystemConfig {
}
