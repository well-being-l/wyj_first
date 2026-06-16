package cn.kmbeast.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FeedPoint {

    private Integer id;

    private String name;

    private String location;

    private String description;

    private String image;

    private String status;

    private String applyStatus;

    private Integer showToStudent;

    private Integer animalCount;

    private Integer todayFeedCount;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private Long submitterId;

    private String submitterName;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}