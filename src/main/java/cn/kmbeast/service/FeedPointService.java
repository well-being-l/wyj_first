package cn.kmbeast.service;

import cn.kmbeast.pojo.dto.query.extend.FeedPointQueryDto;
import cn.kmbeast.pojo.entity.FeedPoint;

import java.util.List;

public interface FeedPointService {

    void insert(FeedPoint feedPoint);

    void update(FeedPoint feedPoint);

    void batchDelete(List<Integer> ids);

    FeedPoint getById(Integer feedId);

    List<FeedPoint> query(FeedPointQueryDto queryDto);

    Integer queryCount(FeedPointQueryDto queryDto);
}