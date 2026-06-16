package cn.kmbeast.pojo.dto.query.extend;

import cn.kmbeast.pojo.dto.query.base.QueryDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 投喂记录查询DTO
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class FeedingRecordQueryDto extends QueryDto {

    /**
     * 投喂者ID
     */
    private Long feederId;

    /**
     * 投喂者姓名（模糊查询）
     */
    private String feederName;

    /**
     * 投喂者角色
     */
    private String feederRole;

    /**
     * 动物ID
     */
    private Long animalId;

    /**
     * 动物名称（模糊查询）
     */
    private String animalName;

    /**
     * 动物类型
     */
    private String animalType;

    /**
     * 投喂点ID
     */
    private Long pointId;

    /**
     * 投喂点名称（模糊查询）
     */
    private String pointName;

    /**
     * 食物类型
     */
    private String foodType;

    /**
     * 状态
     */
    private String status;
}
