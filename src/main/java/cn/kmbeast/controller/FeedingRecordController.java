package cn.kmbeast.controller;

import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.FeedingRecordQueryDto;
import cn.kmbeast.pojo.entity.FeedingRecord;
import cn.kmbeast.service.FeedingRecordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 投喂记录控制器
 */
@RestController
@RequestMapping("/feedingRecord")
public class FeedingRecordController {

    @Resource
    private FeedingRecordService feedingRecordService;

    /**
     * 新增投喂记录
     *
     * @param feedingRecord 投喂记录实体
     * @return 操作结果
     */
    @PostMapping
    public Result<String> insert(@RequestBody FeedingRecord feedingRecord) {
        feedingRecordService.insert(feedingRecord);
        return ApiResult.success("新增成功");
    }

    /**
     * 根据ID删除投喂记录
     *
     * @param id 主键ID
     * @return 操作结果
     */
    @DeleteMapping("/{id}")
    public Result<String> deleteById(@PathVariable Long id) {
        feedingRecordService.deleteById(id);
        return ApiResult.success("删除成功");
    }

    /**
     * 批量删除投喂记录
     *
     * @param ids 主键ID列表
     * @return 操作结果
     */
    @DeleteMapping("/batch")
    public Result<String> batchDelete(@RequestBody List<Long> ids) {
        feedingRecordService.batchDelete(ids);
        return ApiResult.success("批量删除成功");
    }

    /**
     * 更新投喂记录
     *
     * @param feedingRecord 投喂记录实体
     * @return 操作结果
     */
    @PutMapping
    public Result<String> update(@RequestBody FeedingRecord feedingRecord) {
        feedingRecordService.update(feedingRecord);
        return ApiResult.success("更新成功");
    }

    /**
     * 根据ID查询投喂记录
     *
     * @param id 主键ID
     * @return 投喂记录实体
     */
    @GetMapping("/{id}")
    public Result<FeedingRecord> getById(@PathVariable Long id) {
        FeedingRecord feedingRecord = feedingRecordService.getById(id);
        return ApiResult.success(feedingRecord);
    }

    /**
     * 条件查询投喂记录列表
     *
     * @param queryDto 查询条件
     * @return 投喂记录列表（带分页）
     */
    @PostMapping("/query")
    public Result<List<FeedingRecord>> query(@RequestBody(required = false) FeedingRecordQueryDto queryDto) {
        if (queryDto == null) {
            queryDto = new FeedingRecordQueryDto();
        }
        List<FeedingRecord> list = feedingRecordService.query(queryDto);
        Integer total = feedingRecordService.queryCount(queryDto);
        return ApiResult.success(list, total);
    }
}
