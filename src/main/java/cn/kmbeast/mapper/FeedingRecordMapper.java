package cn.kmbeast.mapper;

import cn.kmbeast.pojo.dto.query.extend.FeedingRecordQueryDto;
import cn.kmbeast.pojo.entity.FeedingRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 投喂记录Mapper接口
 */
@Mapper
public interface FeedingRecordMapper {

    /**
     * 新增投喂记录
     *
     * @param feedingRecord 投喂记录实体
     * @return 影响行数
     */
    int insert(FeedingRecord feedingRecord);

    /**
     * 根据ID删除投喂记录
     *
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 批量删除投喂记录
     *
     * @param ids 主键ID列表
     * @return 影响行数
     */
    int batchDelete(List<Long> ids);

    /**
     * 更新投喂记录
     *
     * @param feedingRecord 投喂记录实体
     * @return 影响行数
     */
    int update(FeedingRecord feedingRecord);

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
