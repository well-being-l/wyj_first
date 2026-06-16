package cn.kmbeast.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 系统公告实体类
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Notice {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 公告标题
     */
    private String title;

    /**
     * 公告内容
     */
    private String content;

    /**
     * 发布者ID
     */
    private Long publisherId;

    /**
     * 发布者姓名
     */
    private String publisherName;

    /**
     * 发布时间
     */
    private LocalDateTime publishTime;

    /**
     * 状态（active/inactive）
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