package cn.kmbeast.controller;

import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.AdoptionApplicationQueryDto;
import cn.kmbeast.pojo.entity.AdoptionApplication;
import cn.kmbeast.service.AdoptionApplicationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 领养申请控制器（对应前端adoption.js接口）
 */
@RestController
@RequestMapping("/adoption")
public class AdoptionController {

    @Resource
    private AdoptionApplicationService adoptionApplicationService;

    /**
     * 查询领养申请列表
     *
     * @param queryDto 查询条件
     * @return 领养申请列表（带分页）
     */
    @PostMapping("/query")
    public Result<List<AdoptionApplication>> query(@RequestBody(required = false) AdoptionApplicationQueryDto queryDto) {
        if (queryDto == null) {
            queryDto = new AdoptionApplicationQueryDto();
        }
        List<AdoptionApplication> list = adoptionApplicationService.query(queryDto);
        Integer total = adoptionApplicationService.queryCount(queryDto);
        return ApiResult.success(list, total);
    }

    /**
     * 根据ID获取领养申请
     *
     * @param id 主键ID
     * @return 领养申请实体
     */
    @GetMapping("/{id}")
    public Result<AdoptionApplication> getById(@PathVariable Long id) {
        AdoptionApplication adoptionApplication = adoptionApplicationService.getById(id);
        return ApiResult.success(adoptionApplication);
    }

    /**
     * 新增领养申请
     *
     * @param adoptionApplication 领养申请实体
     * @return 操作结果
     */
    @PostMapping
    public Result<String> insert(@RequestBody AdoptionApplication adoptionApplication) {
        adoptionApplicationService.insert(adoptionApplication);
        return ApiResult.success("新增成功");
    }

    /**
     * 修改领养申请
     *
     * @param adoptionApplication 领养申请实体
     * @return 操作结果
     */
    @PutMapping
    public Result<String> update(@RequestBody AdoptionApplication adoptionApplication) {
        adoptionApplicationService.update(adoptionApplication);
        return ApiResult.success("更新成功");
    }

    /**
     * 删除领养申请
     *
     * @param id 主键ID
     * @return 操作结果
     */
    @DeleteMapping("/{id}")
    public Result<String> deleteById(@PathVariable Long id) {
        adoptionApplicationService.deleteById(id);
        return ApiResult.success("删除成功");
    }

    /**
     * 审核领养申请
     *
     * @param adoptionApplication 包含审核信息的领养申请实体
     * @return 操作结果
     */
    @PostMapping("/audit")
    public Result<String> audit(@RequestBody AdoptionApplication adoptionApplication) {
        adoptionApplicationService.update(adoptionApplication);
        return ApiResult.success("审核成功");
    }

    /**
     * 完成领养
     *
     * @param adoptionApplication 包含完成信息的领养申请实体
     * @return 操作结果
     */
    @PostMapping("/complete")
    public Result<String> complete(@RequestBody AdoptionApplication adoptionApplication) {
        adoptionApplicationService.update(adoptionApplication);
        return ApiResult.success("领养完成");
    }
}