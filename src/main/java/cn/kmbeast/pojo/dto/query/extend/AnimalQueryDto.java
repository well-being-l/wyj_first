package cn.kmbeast.pojo.dto.query.extend;

import cn.kmbeast.pojo.dto.query.base.QueryDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AnimalQueryDto extends QueryDto {

    private String name;

    private String gender;

    private String type;

    private Integer healthStatus;

    private Integer submitterId;
}
