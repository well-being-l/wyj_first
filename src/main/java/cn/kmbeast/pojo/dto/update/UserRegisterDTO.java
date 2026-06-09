package cn.kmbeast.pojo.dto.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterDTO {
    private String username;

    private String gender;

    private Integer age;

    private String phone;

    private String password;

    private String role;

    private String avatar;

    private String remark;
}
