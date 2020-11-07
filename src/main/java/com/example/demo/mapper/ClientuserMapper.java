package com.example.demo.mapper;

import com.example.demo.po.Clientuser;
import com.example.demo.po.ClientuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientuserMapper {
	
    int countByExample(ClientuserExample example);

    int deleteByExample(ClientuserExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(Clientuser record);

    int insertSelective(Clientuser record);
    List<Clientuser>selectByLimit(ClientuserExample example);

    List<Clientuser> selectByExample(ClientuserExample example);

    Clientuser selectByPrimaryKey(Integer uId);
    
    Clientuser selectByUserno(Integer uno);

    int updateByExampleSelective(@Param("record") Clientuser record, @Param("example") ClientuserExample example);

    int updateByExample(@Param("record") Clientuser record, @Param("example") ClientuserExample example);

    int updateByPrimaryKeySelective(Clientuser record);

    int updateByPrimaryKey(Clientuser record);
}