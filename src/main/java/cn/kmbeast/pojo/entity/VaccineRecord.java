package cn.kmbeast.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 疫苗记录实体类
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VaccineRecord {

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
     * 疫苗名称
     */
    private String vaccineName;

    /**
     * 疫苗类型
     */
    private String vaccineType;

    /**
     * 剂量
     */
    private String dose;

    /**
     * 接种日期
     */
    private LocalDateTime inoculationDate;

    /**
     * 下次接种日期
     */
    private LocalDateTime nextInoculationDate;

    /**
     * 兽医姓名
     */
    private String vetName;

    /**
     * 是否已删除
     */
    private Integer isDeleted;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;
}