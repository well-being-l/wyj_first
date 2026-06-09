package cn.kmbeast.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalVO {

    private Integer id;

    private String name;

    private String gender;

    private String age;

    private String type;

    private String personality;

    private Integer healthStatus;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime foundTime;

    private Integer submitterId;

    private String submitterName;

    private String location;

    private String image;

    private String remark;
}
