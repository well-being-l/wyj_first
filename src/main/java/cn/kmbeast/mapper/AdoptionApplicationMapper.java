package cn.kmbeast.mapper;

import cn.kmbeast.pojo.dto.query.extend.AdoptionApplicationQueryDto;
import cn.kmbeast.pojo.entity.AdoptionApplication;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 领养申请Mapper接口
 */
@Mapper
public interface AdoptionApplicationMapper {

    /**
     * 新增领养申请
     *
     * @param adoptionApplication 领养申请实体
     * @return 影响行数
     */
    int insert(AdoptionApplication adoptionApplication);

    /**
     * 根据ID删除领养申请
     *
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 更新领养申请
     *
     * @param adoptionApplication 领养申请实体
     * @return 影响行数
     */
    int update(AdoptionApplication adoptionApplication);

    /**
     * 根据ID查询领养申请
     *
     * @param id 主键ID
     * @return 领养申请实体
     */
    AdoptionApplication getById(Long id);

    /**
     * 条件查询领养申请列表
     *
     * @param queryDto 查询条件
     * @return 领养申请列表
     */
    List<AdoptionApplication> query(AdoptionApplicationQueryDto queryDto);

    /**
     * 条件查询领养申请总数
     *
     * @param queryDto 查询条件
     * @return 总数
     */
    Integer queryCount(AdoptionApplicationQueryDto queryDto);
}