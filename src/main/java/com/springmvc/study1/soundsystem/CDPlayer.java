package com.springmvc.study1.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{
    private CompactDisc cd;
    //用于构造器
    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd=cd;
    }
    //用于setter方法,也可以用于其他任何方法
    @Autowired
    public void setCompactDisc(CompactDisc cd){
        this.cd=cd;
    }
    //比如这个一般方法，spring也会尝试满足方法参数上所声明的依赖（就是说注入的是这个方法的参数需要的类？？）
    //这个装配的过程可能会抛出种种异常
    //required = false,这个参数为false的话，spring如果自动装配失败了，就让这个bean就这样未装配了，当然这种情况，这个属性就是null了
    @Autowired(required = false)
    public void insertDisc(CompactDisc cd){
        this.cd=cd;
    }

    public void play(){
        cd.play();
    }
}
