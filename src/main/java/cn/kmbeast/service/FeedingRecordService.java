package cn.kmbeast.service;

import cn.kmbeast.pojo.dto.query.extend.FeedingRecordQueryDto;
import cn.kmbeast.pojo.entity.FeedingRecord;

import java.util.List;

/**
 * 投喂记录Service接口
 */
public interface FeedingRecordService {

    /**
     * 新增投喂记录
     *
     * @param feedingRecord 投喂记录实体
     */
    void insert(FeedingRecord feedingRecord);

    /**
     * 根据ID删除投喂记录
     *
     * @param id 主键ID
     */
    void deleteById(Long id);

    /**
     * 批量删除投喂记录
     *
     * @param ids 主键ID列表
     */
    void batchDelete(List<Long> ids);

    /**
     * 更新投喂记录
     *
     * @param feedingRecord 投喂记录实体
     */
    void update(FeedingRecord feedingRecord);

    /**
     * 根据ID查询投喂记录
     *
     * @param id 主键ID
     * @return 投喂记录实体
     */
    FeedingRecord getById(Long id);

    /**
     * 条件查询投喂记录列表
     *
     * @param queryDto 查询条件
     * @return 投喂记录列表
     */
    List<FeedingRecord> query(FeedingRecordQueryDto queryDto);

    /**
     * 条件查询投喂记录总数
     *
     * @param queryDto 查询条件
     * @return 总数
     */
    Integer queryCount(FeedingRecordQueryDto queryDto);
}
