package cn.kmbeast.mapper;

import cn.kmbeast.pojo.dto.query.extend.VaccineRecordQueryDto;
import cn.kmbeast.pojo.entity.VaccineRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 疫苗记录Mapper接口
 */
@Mapper
public interface VaccineRecordMapper {

    /**
     * 新增疫苗记录
     *
     * @param vaccineRecord 疫苗记录实体
     * @return 影响行数
     */
    int insert(VaccineRecord vaccineRecord);

    /**
     * 根据ID删除疫苗记录
     *
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 更新疫苗记录
     *
     * @param vaccineRecord 疫苗记录实体
     * @return 影响行数
     */
    int update(VaccineRecord vaccineRecord);

    /**
     * 根据ID查询疫苗记录
     *
     * @param id 主键ID
     * @return 疫苗记录实体
     */
    VaccineRecord getById(Long id);

    /**
     * 条件查询疫苗记录列表
     *
     * @param queryDto 查询条件
     * @return 疫苗记录列表
     */
    List<VaccineRecord> query(VaccineRecordQueryDto queryDto);

    /**
     * 条件查询疫苗记录总数
     *
     * @param queryDto 查询条件
     * @return 总数
     */
    Integer queryCount(VaccineRecordQueryDto queryDto);
}