package cn.kmbeast.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 援助申请实体类
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AidApplication {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 申请人ID
     */
    private Long applicantId;

    /**
     * 申请人姓名
     */
    private String applicantName;

    /**
     * 动物ID
     */
    private Long animalId;

    /**
     * 动物名称
     */
    private String animalName;

    /**
     * 援助类型
     */
    private String aidType;

    /**
     * 援助金额
     */
    private BigDecimal aidAmount;

    /**
     * 申请原因
     */
    private String reason;

    /**
     * 状态（pending-待审核，approved-已通过，rejected-已拒绝）
     */
    private String status;

    /**
     * 审核时间
     */
    private LocalDateTime auditTime;

    /**
     * 审核人ID
     */
    private Long auditorId;

    /**
     * 审核人姓名
     */
    private String auditorName;

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