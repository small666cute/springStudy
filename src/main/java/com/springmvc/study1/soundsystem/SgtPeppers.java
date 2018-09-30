package com.springmvc.study1.soundsystem;

import com.springmvc.study1.soundsystem.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//使用这个注解，表示这个类作为组件类，spring就会给你创建bean了,()里为bean标识的名称
@Component("lonelyHeartsCLUB")
public class SgtPeppers implements CompactDisc {
    private String title="Sgt. Pepper's 的一首歌";
    private String artist="这是一个创作者";
    public void play(){
        System.out.println("playing"+title+"by"+artist);
    }
    //@Bean告诉spring这个方法将会返回一个对象，要把这个对象注册为spring上下文的bean
    /*@Bean(name="lonelyHeartsClubBand")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }*/
    /*@Bean
    public CompactDisc randomBeatlesCD(){
        int choice=(int)Math.floor(Math.random()*4);
        if(choice==0){
            return new SgtPeppers();
        }else {
            return new SgtPeppers();
        }
    }*/
    //创建一个bean实例，它的名字和次方法的名字（cdPlayer()）相同
    /*@Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }*/
}
