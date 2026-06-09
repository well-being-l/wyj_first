package cn.kmbeast.mapper;

import cn.kmbeast.pojo.dto.query.extend.AnimalQueryDto;
import cn.kmbeast.pojo.entity.Animal;
import cn.kmbeast.pojo.vo.AnimalVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnimalMapper {

    void insert(Animal animal);

    void update(Animal animal);

    void batchDelete(@Param("ids") List<Integer> ids);

    Animal getById(Integer id);



    List<AnimalVO> query(@Param("queryDto") AnimalQueryDto queryDto);
    Integer queryCount(@Param("queryDto") AnimalQueryDto queryDto);
}

