package com.dlmu.song.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Proxy {
    @Pointcut("execution(* com.dlmu.song.aop.Subject.study())")
    public void study() {
    }

    @Pointcut("execution(* com.dlmu.song.aop.Club.play())")
    public void play() {
    }

    @Before("study()")
    public void studyStartTime() {
        System.out.println("在8点开始学习");
    }

    @After("study()")
    public void studyEndTime() {
        System.out.println("在18点放学");
    }

    @Before("play()")
    public void playStartTime() {
        System.out.println("在20点开始玩游戏");
    }

    @After("play()")
    public void playEndTime() {
        System.out.println("在22点停止打游戏上床睡觉");
    }
}
