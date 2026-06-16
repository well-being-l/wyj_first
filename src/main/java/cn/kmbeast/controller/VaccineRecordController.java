package cn.kmbeast.controller;

import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.VaccineRecordQueryDto;
import cn.kmbeast.pojo.entity.VaccineRecord;
import cn.kmbeast.service.VaccineRecordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 疫苗记录控制器
 */
@RestController
@RequestMapping("/vaccineRecord")
public class VaccineRecordController {

    @Resource
    private VaccineRecordService vaccineRecordService;

    /**
     * 新增疫苗记录
     *
     * @param vaccineRecord 疫苗记录实体
     * @return 操作结果
     */
    @PostMapping
    public Result<String> insert(@RequestBody VaccineRecord vaccineRecord) {
        vaccineRecordService.insert(vaccineRecord);
        return ApiResult.success("新增成功");
    }

    /**
     * 根据ID删除疫苗记录
     *
     * @param id 主键ID
     * @return 操作结果
     */
    @DeleteMapping("/{id}")
    public Result<String> deleteById(@PathVariable Long id) {
        vaccineRecordService.deleteById(id);
        return ApiResult.success("删除成功");
    }

    /**
     * 更新疫苗记录
     *
     * @param vaccineRecord 疫苗记录实体
     * @return 操作结果
     */
    @PutMapping
    public Result<String> update(@RequestBody VaccineRecord vaccineRecord) {
        vaccineRecordService.update(vaccineRecord);
        return ApiResult.success("更新成功");
    }

    /**
     * 根据ID查询疫苗记录
     *
     * @param id 主键ID
     * @return 疫苗记录实体
     */
    @GetMapping("/{id}")
    public Result<VaccineRecord> getById(@PathVariable Long id) {
        VaccineRecord vaccineRecord = vaccineRecordService.getById(id);
        return ApiResult.success(vaccineRecord);
    }

    /**
     * 条件查询疫苗记录列表
     *
     * @param queryDto 查询条件
     * @return 疫苗记录列表（带分页）
     */
    @PostMapping("/query")
    public Result<List<VaccineRecord>> query(@RequestBody(required = false) VaccineRecordQueryDto queryDto) {
        if (queryDto == null) {
            queryDto = new VaccineRecordQueryDto();
        }
        List<VaccineRecord> list = vaccineRecordService.query(queryDto);
        Integer total = vaccineRecordService.queryCount(queryDto);
        return ApiResult.success(list, total);
    }
}