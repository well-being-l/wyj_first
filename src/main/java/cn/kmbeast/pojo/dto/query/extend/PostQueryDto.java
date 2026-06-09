package cn.kmbeast.pojo.dto.query.extend;

import cn.kmbeast.pojo.dto.query.base.QueryDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PostQueryDto extends QueryDto {

    private String title;

    private String publisherUsername;

    private Integer publisherId;

    private String status;
}
