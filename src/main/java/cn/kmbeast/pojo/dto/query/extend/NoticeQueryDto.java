package cn.kmbeast.pojo.dto.query.extend;

import cn.kmbeast.pojo.dto.query.base.QueryDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 系统公告查询DTO
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class NoticeQueryDto extends QueryDto {

    /**
     * 公告标题（模糊查询）
     */
    private String title;

    /**
     * 发布者ID
     */
    private Long publisherId;

    /**
     * 发布者姓名（模糊查询）
     */
    private String publisherName;

    /**
     * 状态
     */
    private String status;
}