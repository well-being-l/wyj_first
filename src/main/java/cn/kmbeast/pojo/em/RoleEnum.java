package cn.kmbeast.pojo.em;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RoleEnum {

    ADMIN("admin", "管理员"),
    VOLUNTEER("volunteer", "志愿者"),
    STUDENT("student", "学生");

    private final String role;
    private final String name;

    public static String getName(String role) {
        for (RoleEnum value : RoleEnum.values()) {
            if (value.getRole().equals(role)) {
                return value.name;
            }
        }
        return null;
    }

}
