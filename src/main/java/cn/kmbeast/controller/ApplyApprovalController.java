package cn.kmbeast.controller;

import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.ApplyApprovalQueryDto;
import cn.kmbeast.pojo.entity.ApplyApproval;
import cn.kmbeast.service.ApplyApprovalService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/applyApproval")
public class ApplyApprovalController {

    @Resource
    private ApplyApprovalService applyApprovalService;

    @PostMapping
    public Result<String> add(@RequestBody ApplyApproval applyApproval) {
        if (applyApproval.getApplyNo() == null || applyApproval.getApplyNo().isEmpty()) {
            String applyNo = "SP2026" + String.format("%03d",
                    applyApproval.getId() != null ? applyApproval.getId() : 1);
            applyApproval.setApplyNo(applyNo);
        }
        if (applyApproval.getApplyTime() == null) {
            applyApproval.setApplyTime(LocalDateTime.now());
        }
        if (applyApproval.getStatus() == null) {
            applyApproval.setStatus("待审核");
        }
        applyApprovalService.insert(applyApproval);
        return ApiResult.success();
    }

    @PutMapping
    public Result<String> update(@RequestBody ApplyApproval applyApproval) {
        applyApprovalService.update(applyApproval);
        return ApiResult.success();
    }

    @DeleteMapping
    public Result<String> delete(@RequestBody List<Integer> ids) {
        applyApprovalService.batchDelete(ids);
        return ApiResult.success();
    }

    @GetMapping("/{id}")
    public Result<ApplyApproval> getById(@PathVariable Integer id) {
        ApplyApproval applyApproval = applyApprovalService.getById(id);
        return ApiResult.success(applyApproval);
    }

    @PostMapping("/query")
    public Result<List<ApplyApproval>> query(@RequestBody ApplyApprovalQueryDto queryDto) {
        List<ApplyApproval> list = applyApprovalService.query(queryDto);
        Integer total = applyApprovalService.queryCount(queryDto);
        return ApiResult.success(list, total);
    }
}
