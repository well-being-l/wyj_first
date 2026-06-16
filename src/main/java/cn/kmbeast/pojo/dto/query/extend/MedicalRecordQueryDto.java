package cn.kmbeast.pojo.dto.query.extend;

import cn.kmbeast.pojo.dto.query.base.QueryDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 医疗记录查询DTO
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MedicalRecordQueryDto extends QueryDto {

    /**
     * 动物ID
     */
    private Long animalId;

    /**
     * 动物名称（模糊查询）
     */
    private String animalName;

    /**
     * 医院名称（模糊查询）
     */
    private String hospitalName;

    /**
     * 医生姓名（模糊查询）
     */
    private String doctorName;

    /**
     * 诊断结果（模糊查询）
     */
    private String diagnosis;

    /**
     * 状态
     */
    private String status;
}