package cn.kmbeast.mapper;

import cn.kmbeast.pojo.dto.query.extend.FeedPointQueryDto;
import cn.kmbeast.pojo.entity.FeedPoint;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FeedPointMapper {

    void insert(FeedPoint feedPoint);

    void update(FeedPoint feedPoint);

    void batchDelete(@Param("ids") List<Integer> ids);

    FeedPoint getById(Integer feedId);

    List<FeedPoint> query(FeedPointQueryDto queryDto);

    Integer queryCount(FeedPointQueryDto queryDto);
}
