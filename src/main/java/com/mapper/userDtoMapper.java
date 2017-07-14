package com.mapper;

import com.dto.userDto;
import com.dto.userDtoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userDtoMapper {
    int countByExample(userDtoExample example);

    int deleteByExample(userDtoExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(userDto record);

    int insertSelective(userDto record);

    List<userDto> selectByExample(userDtoExample example);

    userDto selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") userDto record, @Param("example") userDtoExample example);

    int updateByExample(@Param("record") userDto record, @Param("example") userDtoExample example);

    int updateByPrimaryKeySelective(userDto record);

    int updateByPrimaryKey(userDto record);
}