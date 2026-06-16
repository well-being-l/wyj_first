package cn.kmbeast.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 领养申请实体类
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdoptionApplication {

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
     * 申请人电话
     */
    private String applicantPhone;

    /**
     * 申请人地址
     */
    private String applicantAddress;

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
     * 申请原因
     */
    private String applicationReason;

    /**
     * 居住条件
     */
    private String livingCondition;

    /**
     * 是否有其他宠物
     */
    private Integer hasOtherPets;

    /**
     * 家庭成员数量
     */
    private Integer familyMembers;

    /**
     * 工作情况
     */
    private String workSituation;

    /**
     * 状态（pending-待审核，approved-已通过，rejected-已拒绝，completed-已完成）
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
     * 审核备注
     */
    private String auditRemark;

    /**
     * 领养时间
     */
    private LocalDateTime adoptionTime;

    /**
     * 领养合同编号
     */
    private String adoptionContractNo;

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