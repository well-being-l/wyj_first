package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.FeedPointMapper;
import cn.kmbeast.pojo.dto.query.extend.FeedPointQueryDto;
import cn.kmbeast.pojo.entity.FeedPoint;
import cn.kmbeast.service.FeedPointService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FeedPointServiceImpl implements FeedPointService {

    @Resource
    private FeedPointMapper feedPointMapper;

    @Override
    public void insert(FeedPoint feedPoint) {
        feedPointMapper.insert(feedPoint);
    }

    @Override
    public void update(FeedPoint feedPoint) {
        feedPointMapper.update(feedPoint);
    }

    @Override
    public void batchDelete(List<Integer> ids) {
        feedPointMapper.batchDelete(ids);
    }

    @Override
    public FeedPoint getById(Integer feedId) {
        return feedPointMapper.getById(feedId);
    }

    @Override
    public List<FeedPoint> query(FeedPointQueryDto queryDto) {
        return feedPointMapper.query(queryDto);
    }

    @Override
    public Integer queryCount(FeedPointQueryDto queryDto) {
        return feedPointMapper.queryCount(queryDto);
    }
}
