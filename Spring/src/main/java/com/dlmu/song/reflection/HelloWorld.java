package com.dlmu.song.reflection;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    @MyAnnotation(hello = "helloworld")
    private String hello;
    @MyAnnotation(hello = "你好世界")
    private String world;
}
