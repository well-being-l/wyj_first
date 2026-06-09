package cn.kmbeast.context;

import java.util.HashMap;
import java.util.Map;

public class LocalThreadHolder {

    private static final ThreadLocal<Map<String, Object>> USER_HOLDER = new ThreadLocal<>();

    public static void setUserId(Integer userId, String userRole) {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        map.put("userRole", userRole);
        USER_HOLDER.set(map);
    }

    public static Integer getUserId() {
        Map<String, Object> map = USER_HOLDER.get();
        return map != null ? (Integer) map.get("userId") : null;
    }

    public static String getRoleId() {
        Map<String, Object> map = USER_HOLDER.get();
        return map != null ? (String) map.get("userRole") : null;
    }

    public static void clear() {
        USER_HOLDER.remove();
    }

}
