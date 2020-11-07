package com.example.demo.mapper;

import com.example.demo.po.Borrowrecord;
import com.example.demo.po.BorrowrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowrecordMapper {
	List<Borrowrecord> selectByborrow (Integer uNo,String bookName);
    int countByExample(BorrowrecordExample example);

    int deleteByExample(BorrowrecordExample example);

    int deleteByPrimaryKey(Integer bohuaiId);

    int insert(Borrowrecord record);

    int insertSelective(Borrowrecord record);

    List<Borrowrecord> selectByExample(BorrowrecordExample example);

    Borrowrecord selectByPrimaryKey(Integer bohuaiId);

    int updateByExampleSelective(@Param("record") Borrowrecord record, @Param("example") BorrowrecordExample example);

    int updateByExample(@Param("record") Borrowrecord record, @Param("example") BorrowrecordExample example);

    int updateByPrimaryKeySelective(Borrowrecord record);

    int updateByPrimaryKey(Borrowrecord record);
}