package com.springmvc.study1;

import com.springmvc.study1.soundsystem.CompactDisc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//配置方法1：使用配置类
@Configuration
//使用@ComponentScan注解，在spring中启用组件扫描，默认扫描和本配置类相同的包，查找用@Componet注解的类
@ComponentScan(basePackageClasses = {CompactDisc.class})
public class CDPlayerConfig {
}
