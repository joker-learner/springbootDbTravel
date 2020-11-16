package com.lc.mapper;

import com.lc.pojo.Depts;
import com.lc.pojo.Node;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SysDeptsMapper {

    List<Map<String, Object>> findAllObject();

    int deleteDepById(Integer id);

    List<Node> findZtreeDepe();

    int saveDeptObject(Depts deptsObject);

    int updateDeptObject(Depts deptsObject);
}