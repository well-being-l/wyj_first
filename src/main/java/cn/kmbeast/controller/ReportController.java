package cn.kmbeast.controller;

import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/report")
public class ReportController {

    @Resource
    private DataSource dataSource;

    @GetMapping("/count/{id}")
    public Result<Map<String, Object>> count(@PathVariable Integer id) {
        Map<String, Object> result = new HashMap<>();
        try (Connection conn = dataSource.getConnection()) {

            String animalSql = "SELECT COUNT(*) FROM animal WHERE submitter_id = ?";
            try (PreparedStatement ps = conn.prepareStatement(animalSql)) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    result.put("animalSubmitted", rs.getInt(1));
                }
            }

            String approvalSql = "SELECT COUNT(*) FROM apply_approval WHERE user_id = ?";
            try (PreparedStatement ps = conn.prepareStatement(approvalSql)) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    result.put("approvalSubmitted", rs.getInt(1));
                }
            }

            String postSql = "SELECT COUNT(*) FROM post WHERE publisher_id = ?";
            try (PreparedStatement ps = conn.prepareStatement(postSql)) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    result.put("postPublished", rs.getInt(1));
                }
            }

        } catch (Exception e) {
            return ApiResult.error("统计查询失败: " + e.getMessage());
        }

        return ApiResult.success(result);
    }
}