package cn.kmbeast.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 医疗记录实体类
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MedicalRecord {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 动物ID
     */
    private Long animalId;

    /**
     * 动物名称
     */
    private String animalName;

    /**
     * 医院名称
     */
    private String hospitalName;

    /**
     * 医生姓名
     */
    private String doctorName;

    /**
     * 诊断结果
     */
    private String diagnosis;

    /**
     * 治疗方案
     */
    private String treatment;

    /**
     * 费用
     */
    private BigDecimal cost;

    /**
     * 治疗日期
     */
    private LocalDateTime treatmentDate;

    /**
     * 状态
     */
    private String status;

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