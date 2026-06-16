package cn.kmbeast.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 审核DTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditDto {

    /**
     * 申请ID
     */
    private Long id;

    /**
     * 审核状态（approved-通过，rejected-拒绝）
     */
    private String status;

    /**
     * 审核人ID
     */
    private Long auditorId;

    /**
     * 审核人姓名
     */
    private String auditorName;
}