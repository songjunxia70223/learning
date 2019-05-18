package com.dlmu.test;

import com.dlmu.song.mybatis.model.Mybatis;
import com.dlmu.song.mybatis.mapper.MybatisMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MybatisTest extends Junit{
    @Autowired(required = false)
    MybatisMapper mybatisMapper;
    @Test
    public void test(){
        List<Mybatis> mybatisList=mybatisMapper.getAllMybatis();
        for (Mybatis mybatis : mybatisList) {
            System.out.println(mybatis.getName());
        }
    }
}
