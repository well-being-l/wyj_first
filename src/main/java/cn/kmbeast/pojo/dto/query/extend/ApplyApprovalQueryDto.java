package cn.kmbeast.pojo.dto.query.extend;

import cn.kmbeast.pojo.dto.query.base.QueryDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ApplyApprovalQueryDto extends QueryDto {

    private String applyNo;

    private String animalName;

    private String userRealName;

    private Integer userId;

    private String status;
}
