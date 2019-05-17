package com.dlmu.test;

import com.dlmu.song.reflection.HelloWorld;
import com.dlmu.song.reflection.MyAnnotation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.lang.reflect.Field;

public class AnnotationTest extends Junit {
    @Autowired
    HelloWorld hello;

    @Test
    public void annotationTest() {
        Field fd[] = hello.getClass().getDeclaredFields();
        for (Field field : fd) {
            System.out.println(field);
            MyAnnotation my = field.getAnnotation(MyAnnotation.class);
            if (my != null) {
                System.out.println("hello is " + my.hello());
            }
        }
    }
}
