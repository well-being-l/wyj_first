package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.AnimalMapper;
import cn.kmbeast.pojo.dto.query.extend.AnimalQueryDto;
import cn.kmbeast.pojo.entity.Animal;
import cn.kmbeast.pojo.vo.AnimalVO;
import cn.kmbeast.service.AnimalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Resource
    private AnimalMapper animalMapper;

    @Override
    public void insert(Animal animal) {
        animalMapper.insert(animal);
    }

    @Override
    public void update(Animal animal) {
        animalMapper.update(animal);
    }

    @Override
    public void batchDelete(List<Integer> ids) {
        animalMapper.batchDelete(ids);
    }

    @Override
    public Animal getById(Integer id) {
        return animalMapper.getById(id);
    }

    @Override
    public List<AnimalVO> query(AnimalQueryDto queryDto) {
        return animalMapper.query(queryDto);
    }

    @Override
    public Integer queryCount(AnimalQueryDto queryDto) {
        return animalMapper.queryCount(queryDto);
    }
}
