package com.example.demo.mapper;

import com.example.demo.po.Swiperdatas;
import com.example.demo.po.SwiperdatasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwiperdatasMapper {
    int countByExample(SwiperdatasExample example);

    int deleteByExample(SwiperdatasExample example);

    int deleteByPrimaryKey(Integer swId);

    int insert(Swiperdatas record);

    int insertSelective(Swiperdatas record);

    List<Swiperdatas> selectByExample(SwiperdatasExample example);

    Swiperdatas selectByPrimaryKey(Integer swId);

    int updateByExampleSelective(@Param("record") Swiperdatas record, @Param("example") SwiperdatasExample example);

    int updateByExample(@Param("record") Swiperdatas record, @Param("example") SwiperdatasExample example);

    int updateByPrimaryKeySelective(Swiperdatas record);

    int updateByPrimaryKey(Swiperdatas record);
}