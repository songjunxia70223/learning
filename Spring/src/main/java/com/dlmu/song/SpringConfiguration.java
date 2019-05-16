package com.dlmu.song;

import com.dlmu.song.manual.Chinese;
import com.dlmu.song.manual.Japanese;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.dlmu.song")
@EnableAspectJAutoProxy
public class SpringConfiguration {
    @Bean
    public Chinese getChinese(){

        return new Chinese();
    }
    @Bean
    public Japanese getJapanese(){
        return new Japanese();
    }
}
