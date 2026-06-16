package cn.kmbeast.mapper;

import cn.kmbeast.pojo.dto.query.extend.MedicalRecordQueryDto;
import cn.kmbeast.pojo.entity.MedicalRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 医疗记录Mapper接口
 */
@Mapper
public interface MedicalRecordMapper {

    /**
     * 新增医疗记录
     *
     * @param medicalRecord 医疗记录实体
     * @return 影响行数
     */
    int insert(MedicalRecord medicalRecord);

    /**
     * 根据ID删除医疗记录
     *
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 批量删除医疗记录
     *
     * @param ids 主键ID列表
     * @return 影响行数
     */
    int batchDelete(List<Long> ids);

    /**
     * 更新医疗记录
     *
     * @param medicalRecord 医疗记录实体
     * @return 影响行数
     */
    int update(MedicalRecord medicalRecord);

    /**
     * 根据ID查询医疗记录
     *
     * @param id 主键ID
     * @return 医疗记录实体
     */
    MedicalRecord getById(Long id);

    /**
     * 条件查询医疗记录列表
     *
     * @param queryDto 查询条件
     * @return 医疗记录列表
     */
    List<MedicalRecord> query(MedicalRecordQueryDto queryDto);

    /**
     * 条件查询医疗记录总数
     *
     * @param queryDto 查询条件
     * @return 总数
     */
    Integer queryCount(MedicalRecordQueryDto queryDto);
}