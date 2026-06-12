package cn.kmbeast.pojo.dto.query.extend;

import lombok.Data;

@Data
public class AnimalQueryDto {
    private String name;           // 动物名称（模糊查询）
    private String type;           // 类型（猫咪/狗狗）
    private String location;       // 位置（模糊查询）
    private String lifeStatus;     // 生命周期状态
    private Integer healthStatus;  // 健康状态
    private String gender;         // 性别
    private String color;          // 毛色
    private Integer submitterId;   // 提交人ID
    private String submitterName;  // 提交人姓名
    private Integer pageNum;       // 页码
    private Integer pageSize;      // 每页数量
}