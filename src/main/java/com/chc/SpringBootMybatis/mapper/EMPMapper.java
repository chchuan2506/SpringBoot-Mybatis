package com.chc.SpringBootMybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.chc.SpringBootMybatis.entity.EMP;

public interface EMPMapper {
	@Select("SELECT * FROM EMP")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "ename", column = "ename"),
            @Result(property = "age", column = "age")
    })
    List<EMP> getAll();
}
