package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.AdoptionApplicationMapper;
import cn.kmbeast.pojo.dto.query.extend.AdoptionApplicationQueryDto;
import cn.kmbeast.pojo.entity.AdoptionApplication;
import cn.kmbeast.service.AdoptionApplicationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 领养申请Service实现类
 */
@Service
public class AdoptionApplicationServiceImpl implements AdoptionApplicationService {

    @Resource
    private AdoptionApplicationMapper adoptionApplicationMapper;

    @Override
    public void insert(AdoptionApplication adoptionApplication) {
        adoptionApplicationMapper.insert(adoptionApplication);
    }

    @Override
    public void deleteById(Long id) {
        adoptionApplicationMapper.deleteById(id);
    }

    @Override
    public void update(AdoptionApplication adoptionApplication) {
        adoptionApplicationMapper.update(adoptionApplication);
    }

    @Override
    public AdoptionApplication getById(Long id) {
        return adoptionApplicationMapper.getById(id);
    }

    @Override
    public List<AdoptionApplication> query(AdoptionApplicationQueryDto queryDto) {
        return adoptionApplicationMapper.query(queryDto);
    }

    @Override
    public Integer queryCount(AdoptionApplicationQueryDto queryDto) {
        return adoptionApplicationMapper.queryCount(queryDto);
    }
}