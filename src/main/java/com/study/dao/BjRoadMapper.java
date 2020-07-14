package com.study.dao;

import com.study.bean.BjRoad;
import com.study.bean.BjRoadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BjRoadMapper {
    long countByExample(BjRoadExample example);

    int deleteByExample(BjRoadExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BjRoad record);

    int insertSelective(BjRoad record);

    List<BjRoad> selectByExample(BjRoadExample example);

    BjRoad selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BjRoad record, @Param("example") BjRoadExample example);

    int updateByExample(@Param("record") BjRoad record, @Param("example") BjRoadExample example);

    int updateByPrimaryKeySelective(BjRoad record);

    int updateByPrimaryKey(BjRoad record);
}