package cn.kmbeast.controller;

import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.MedicalRecordQueryDto;
import cn.kmbeast.pojo.entity.MedicalRecord;
import cn.kmbeast.service.MedicalRecordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 医疗记录控制器
 */
@RestController
@RequestMapping("/medicalRecord")
public class MedicalRecordController {

    @Resource
    private MedicalRecordService medicalRecordService;

    /**
     * 新增医疗记录
     *
     * @param medicalRecord 医疗记录实体
     * @return 操作结果
     */
    @PostMapping
    public Result<String> insert(@RequestBody MedicalRecord medicalRecord) {
        medicalRecordService.insert(medicalRecord);
        return ApiResult.success("新增成功");
    }

    /**
     * 根据ID删除医疗记录
     *
     * @param id 主键ID
     * @return 操作结果
     */
    @DeleteMapping("/{id}")
    public Result<String> deleteById(@PathVariable Long id) {
        medicalRecordService.deleteById(id);
        return ApiResult.success("删除成功");
    }

    /**
     * 批量删除医疗记录
     *
     * @param ids 主键ID列表
     * @return 操作结果
     */
    @DeleteMapping("/batch")
    public Result<String> batchDelete(@RequestBody List<Long> ids) {
        medicalRecordService.batchDelete(ids);
        return ApiResult.success("批量删除成功");
    }

    /**
     * 更新医疗记录
     *
     * @param medicalRecord 医疗记录实体
     * @return 操作结果
     */
    @PutMapping
    public Result<String> update(@RequestBody MedicalRecord medicalRecord) {
        medicalRecordService.update(medicalRecord);
        return ApiResult.success("更新成功");
    }

    /**
     * 根据ID查询医疗记录
     *
     * @param id 主键ID
     * @return 医疗记录实体
     */
    @GetMapping("/{id}")
    public Result<MedicalRecord> getById(@PathVariable Long id) {
        MedicalRecord medicalRecord = medicalRecordService.getById(id);
        return ApiResult.success(medicalRecord);
    }

    /**
     * 条件查询医疗记录列表
     *
     * @param queryDto 查询条件
     * @return 医疗记录列表（带分页）
     */
    @PostMapping("/query")
    public Result<List<MedicalRecord>> query(@RequestBody(required = false) MedicalRecordQueryDto queryDto) {
        if (queryDto == null) {
            queryDto = new MedicalRecordQueryDto();
        }
        List<MedicalRecord> list = medicalRecordService.query(queryDto);
        Integer total = medicalRecordService.queryCount(queryDto);
        return ApiResult.success(list, total);
    }
}