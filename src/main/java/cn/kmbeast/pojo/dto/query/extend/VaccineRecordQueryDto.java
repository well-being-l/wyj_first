package cn.kmbeast.pojo.dto.query.extend;

import cn.kmbeast.pojo.dto.query.base.QueryDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 疫苗记录查询DTO
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class VaccineRecordQueryDto extends QueryDto {

    /**
     * 动物ID
     */
    private Long animalId;

    /**
     * 动物名称（模糊查询）
     */
    private String animalName;

    /**
     * 疫苗名称（模糊查询）
     */
    private String vaccineName;

    /**
     * 疫苗类型
     */
    private String vaccineType;
}