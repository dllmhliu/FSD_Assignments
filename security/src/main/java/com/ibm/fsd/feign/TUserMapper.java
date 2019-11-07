package com.ibm.fsd.feign;

import com.ibm.fsd.dto.TUser;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface TUserMapper {
    long countByExample(TUserCriteria example);

    int deleteByExample(TUserCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExampleWithRowbounds(TUserCriteria example, RowBounds rowBounds);

    List<TUser> selectByExample(TUserCriteria example);

    TUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserCriteria example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserCriteria example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
}