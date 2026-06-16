package cn.kmbeast.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 投喂记录实体类
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeedingRecord {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 投喂者ID
     */
    private Long feederId;

    /**
     * 投喂者姓名
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
     * 动物名称
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
     * 投喂点名称
     */
    private String pointName;

    /**
     * 投喂时间
     */
    private LocalDateTime feedingTime;

    /**
     * 食物类型
     */
    private String foodType;

    /**
     * 食物数量
     */
    private String foodAmount;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String notes;

    /**
     * 照片（JSON格式）
     */
    private String photos;

    /**
     * 审核历史（JSON格式）
     */
    private String auditHistory;

    /**
     * 是否已删除
     */
    private Integer isDeleted;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
