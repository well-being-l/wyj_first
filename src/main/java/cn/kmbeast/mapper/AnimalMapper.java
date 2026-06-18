package cn.kmbeast.mapper;

import cn.kmbeast.pojo.dto.query.extend.AnimalQueryDto;
import cn.kmbeast.pojo.entity.Animal;
import cn.kmbeast.pojo.vo.AnimalVO;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface AnimalMapper {
    
    void insert(Animal animal);
    
    void update(Animal animal);
    
    void batchDelete(@Param("list") List<Integer> ids);
    
    Animal getById(@Param("id") Integer id);
    
    List<AnimalVO> query(@Param("queryDto") AnimalQueryDto queryDto);
    
    Integer queryCount(@Param("queryDto") AnimalQueryDto queryDto);
    
    List<Map<String, Object>> countByType();
    
    List<Map<String, Object>> countByLifeStatus();
}