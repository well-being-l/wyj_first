package cn.kmbeast.mapper;

import cn.kmbeast.pojo.dto.query.extend.AidApplicationQueryDto;
import cn.kmbeast.pojo.entity.AidApplication;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 援助申请Mapper接口
 */
@Mapper
public interface AidApplicationMapper {

    /**
     * 新增援助申请
     *
     * @param aidApplication 援助申请实体
     * @return 影响行数
     */
    int insert(AidApplication aidApplication);

    /**
     * 根据ID删除援助申请
     *
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 更新援助申请
     *
     * @param aidApplication 援助申请实体
     * @return 影响行数
     */
    int update(AidApplication aidApplication);

    /**
     * 审核援助申请
     *
     * @param aidApplication 援助申请实体
     * @return 影响行数
     */
    int audit(AidApplication aidApplication);

    /**
     * 根据ID查询援助申请
     *
     * @param id 主键ID
     * @return 援助申请实体
     */
    AidApplication getById(Long id);

    /**
     * 条件查询援助申请列表
     *
     * @param queryDto 查询条件
     * @return 援助申请列表
     */
    List<AidApplication> query(AidApplicationQueryDto queryDto);

    /**
     * 条件查询援助申请总数
     *
     * @param queryDto 查询条件
     * @return 总数
     */
    Integer queryCount(AidApplicationQueryDto queryDto);
}