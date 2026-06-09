package cn.kmbeast.service;

import cn.kmbeast.pojo.dto.query.extend.AnimalQueryDto;
import cn.kmbeast.pojo.entity.Animal;
import cn.kmbeast.pojo.vo.AnimalVO;

import java.util.List;

public interface AnimalService {

    void insert(Animal animal);

    void update(Animal animal);

    void batchDelete(List<Integer> ids);

    Animal getById(Integer id);

    List<AnimalVO> query(AnimalQueryDto queryDto);

    Integer queryCount(AnimalQueryDto queryDto);
}
