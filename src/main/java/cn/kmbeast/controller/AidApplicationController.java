package cn.kmbeast.controller;

import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.AuditDto;
import cn.kmbeast.pojo.dto.query.extend.AidApplicationQueryDto;
import cn.kmbeast.pojo.entity.AidApplication;
import cn.kmbeast.service.AidApplicationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 援助申请控制器
 */
@RestController
@RequestMapping("/aidApplication")
public class AidApplicationController {

    @Resource
    private AidApplicationService aidApplicationService;

    /**
     * 新增援助申请
     *
     * @param aidApplication 援助申请实体
     * @return 操作结果
     */
    @PostMapping
    public Result<String> insert(@RequestBody AidApplication aidApplication) {
        aidApplicationService.insert(aidApplication);
        return ApiResult.success("新增成功");
    }

    /**
     * 根据ID删除援助申请
     *
     * @param id 主键ID
     * @return 操作结果
     */
    @DeleteMapping("/{id}")
    public Result<String> deleteById(@PathVariable Long id) {
        aidApplicationService.deleteById(id);
        return ApiResult.success("删除成功");
    }

    /**
     * 更新援助申请
     *
     * @param aidApplication 援助申请实体
     * @return 操作结果
     */
    @PutMapping
    public Result<String> update(@RequestBody AidApplication aidApplication) {
        aidApplicationService.update(aidApplication);
        return ApiResult.success("更新成功");
    }

    /**
     * 审核援助申请
     *
     * @param auditDto 审核信息
     * @return 操作结果
     */
    @PostMapping("/audit")
    public Result<String> audit(@RequestBody AuditDto auditDto) {
        aidApplicationService.audit(auditDto);
        return ApiResult.success("审核成功");
    }

    /**
     * 根据ID查询援助申请
     *
     * @param id 主键ID
     * @return 援助申请实体
     */
    @GetMapping("/{id}")
    public Result<AidApplication> getById(@PathVariable Long id) {
        AidApplication aidApplication = aidApplicationService.getById(id);
        return ApiResult.success(aidApplication);
    }

    /**
     * 条件查询援助申请列表
     *
     * @param queryDto 查询条件
     * @return 援助申请列表（带分页）
     */
    @PostMapping("/query")
    public Result<List<AidApplication>> query(@RequestBody(required = false) AidApplicationQueryDto queryDto) {
        if (queryDto == null) {
            queryDto = new AidApplicationQueryDto();
        }
        List<AidApplication> list = aidApplicationService.query(queryDto);
        Integer total = aidApplicationService.queryCount(queryDto);
        return ApiResult.success(list, total);
    }
}