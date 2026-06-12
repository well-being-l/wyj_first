package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.AnimalMapper;
import cn.kmbeast.pojo.dto.query.extend.AnimalQueryDto;
import cn.kmbeast.pojo.entity.Animal;
import cn.kmbeast.pojo.vo.AnimalVO;
import cn.kmbeast.service.AnimalService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<AnimalVO> list = animalMapper.query(queryDto);
        // 设置状态文本描述
        for (AnimalVO vo : list) {
            vo.setHealthStatusText(getHealthStatusText(vo.getHealthStatus()));
            vo.setLifeStatusText(vo.getLifeStatus());
        }
        return list;
    }

    @Override
    public Integer queryCount(AnimalQueryDto queryDto) {
        return animalMapper.queryCount(queryDto);
    }

    @Override
    public Map<String, Integer> countByType() {
        List<Map<String, Object>> list = animalMapper.countByType();
        Map<String, Integer> result = new HashMap<>();
        for (Map<String, Object> item : list) {
            result.put((String) item.get("type"), ((Number) item.get("count")).intValue());
        }
        return result;
    }

    @Override
    public Map<String, Integer> countByLifeStatus() {
        List<Map<String, Object>> list = animalMapper.countByLifeStatus();
        Map<String, Integer> result = new HashMap<>();
        for (Map<String, Object> item : list) {
            result.put((String) item.get("life_status"), ((Number) item.get("count")).intValue());
        }
        return result;
    }

    private String getHealthStatusText(Integer status) {
        if (status == null) return "未知";
        switch (status) {
            case 0: return "健康";
            case 1: return "生病";
            case 2: return "治疗中";
            case 3: return "已康复";
            default: return "未知";
        }
    }
}