package cn.kmbeast.controller;

import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.NoticeQueryDto;
import cn.kmbeast.pojo.entity.Notice;
import cn.kmbeast.service.NoticeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 系统公告控制器
 */
@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Resource
    private NoticeService noticeService;

    /**
     * 新增公告
     *
     * @param notice 公告实体
     * @return 操作结果
     */
    @PostMapping
    public Result<String> insert(@RequestBody Notice notice) {
        noticeService.insert(notice);
        return ApiResult.success("新增成功");
    }

    /**
     * 根据ID删除公告
     *
     * @param id 主键ID
     * @return 操作结果
     */
    @DeleteMapping("/{id}")
    public Result<String> deleteById(@PathVariable Long id) {
        noticeService.deleteById(id);
        return ApiResult.success("删除成功");
    }

    /**
     * 批量删除公告
     *
     * @param ids 主键ID列表
     * @return 操作结果
     */
    @DeleteMapping("/batch")
    public Result<String> batchDelete(@RequestBody List<Long> ids) {
        noticeService.batchDelete(ids);
        return ApiResult.success("批量删除成功");
    }

    /**
     * 更新公告
     *
     * @param notice 公告实体
     * @return 操作结果
     */
    @PutMapping
    public Result<String> update(@RequestBody Notice notice) {
        noticeService.update(notice);
        return ApiResult.success("更新成功");
    }

    /**
     * 根据ID查询公告
     *
     * @param id 主键ID
     * @return 公告实体
     */
    @GetMapping("/{id}")
    public Result<Notice> getById(@PathVariable Long id) {
        Notice notice = noticeService.getById(id);
        return ApiResult.success(notice);
    }

    /**
     * 条件查询公告列表
     *
     * @param queryDto 查询条件
     * @return 公告列表（带分页）
     */
    @PostMapping("/query")
    public Result<List<Notice>> query(@RequestBody(required = false) NoticeQueryDto queryDto) {
        if (queryDto == null) {
            queryDto = new NoticeQueryDto();
        }
        List<Notice> list = noticeService.query(queryDto);
        Integer total = noticeService.queryCount(queryDto);
        return ApiResult.success(list, total);
    }
}