package cn.kmbeast.pojo.dto.query.extend;

import cn.kmbeast.pojo.dto.query.base.QueryDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 援助申请查询DTO
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AidApplicationQueryDto extends QueryDto {

    /**
     * 申请人ID
     */
    private Long applicantId;

    /**
     * 申请人姓名（模糊查询）
     */
    private String applicantName;

    /**
     * 动物ID
     */
    private Long animalId;

    /**
     * 动物名称（模糊查询）
     */
    private String animalName;

    /**
     * 援助类型
     */
    private String aidType;

    /**
     * 状态
     */
    private String status;
}