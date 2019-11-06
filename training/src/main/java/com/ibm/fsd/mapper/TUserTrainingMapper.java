package com.ibm.fsd.mapper;

import com.ibm.fsd.entity.TUserTrainingCriteria;
import com.ibm.fsd.entity.TUserTraining;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface TUserTrainingMapper {
    long countByExample(TUserTrainingCriteria example);

    int deleteByExample(TUserTrainingCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(TUserTraining record);

    int insertSelective(TUserTraining record);

    List<TUserTraining> selectByExampleWithRowbounds(TUserTrainingCriteria example, RowBounds rowBounds);

    List<TUserTraining> selectByExample(TUserTrainingCriteria example);

    TUserTraining selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TUserTraining record, @Param("example") TUserTrainingCriteria example);

    int updateByExample(@Param("record") TUserTraining record, @Param("example") TUserTrainingCriteria example);

    int updateByPrimaryKeySelective(TUserTraining record);

    int updateByPrimaryKey(TUserTraining record);
}