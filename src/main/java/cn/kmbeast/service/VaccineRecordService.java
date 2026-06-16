package cn.kmbeast.service;

import cn.kmbeast.pojo.dto.query.extend.VaccineRecordQueryDto;
import cn.kmbeast.pojo.entity.VaccineRecord;

import java.util.List;

/**
 * 疫苗记录Service接口
 */
public interface VaccineRecordService {

    /**
     * 新增疫苗记录
     *
     * @param vaccineRecord 疫苗记录实体
     */
    void insert(VaccineRecord vaccineRecord);

    /**
     * 根据ID删除疫苗记录
     *
     * @param id 主键ID
     */
    void deleteById(Long id);

    /**
     * 更新疫苗记录
     *
     * @param vaccineRecord 疫苗记录实体
     */
    void update(VaccineRecord vaccineRecord);

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