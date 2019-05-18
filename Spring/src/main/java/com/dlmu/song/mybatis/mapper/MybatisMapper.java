package com.dlmu.song.mybatis.mapper;

import com.dlmu.song.mybatis.model.Mybatis;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MybatisMapper {
    @Select("select * from mybatis")
    List<Mybatis> getAllMybatis();
}
