package com.example.demo.mapper;

import com.example.demo.po.Categoryindex;
import com.example.demo.po.CategoryindexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryindexMapper {
    int countByExample(CategoryindexExample example);

    int deleteByExample(CategoryindexExample example);

    int deleteByPrimaryKey(Integer caId);

    int insert(Categoryindex record);

    int insertSelective(Categoryindex record);

    List<Categoryindex> selectByExample(CategoryindexExample example);

    Categoryindex selectByPrimaryKey(Integer caId);

    int updateByExampleSelective(@Param("record") Categoryindex record, @Param("example") CategoryindexExample example);

    int updateByExample(@Param("record") Categoryindex record, @Param("example") CategoryindexExample example);

    int updateByPrimaryKeySelective(Categoryindex record);

    int updateByPrimaryKey(Categoryindex record);
}