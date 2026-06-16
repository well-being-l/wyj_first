package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.FeedingRecordMapper;
import cn.kmbeast.pojo.dto.query.extend.FeedingRecordQueryDto;
import cn.kmbeast.pojo.entity.FeedingRecord;
import cn.kmbeast.service.FeedingRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 投喂记录Service实现类
 */
@Service
public class FeedingRecordServiceImpl implements FeedingRecordService {

    @Resource
    private FeedingRecordMapper feedingRecordMapper;

    @Override
    public void insert(FeedingRecord feedingRecord) {
        feedingRecordMapper.insert(feedingRecord);
    }

    @Override
    public void deleteById(Long id) {
        feedingRecordMapper.deleteById(id);
    }

    @Override
    public void batchDelete(List<Long> ids) {
        feedingRecordMapper.batchDelete(ids);
    }

    @Override
    public void update(FeedingRecord feedingRecord) {
        feedingRecordMapper.update(feedingRecord);
    }

    @Override
    public FeedingRecord getById(Long id) {
        return feedingRecordMapper.getById(id);
    }

    @Override
    public List<FeedingRecord> query(FeedingRecordQueryDto queryDto) {
        return feedingRecordMapper.query(queryDto);
    }

    @Override
    public Integer queryCount(FeedingRecordQueryDto queryDto) {
        return feedingRecordMapper.queryCount(queryDto);
    }
}
