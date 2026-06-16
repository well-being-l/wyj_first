package cn.kmbeast.controller;

import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.FeedPointQueryDto;
import cn.kmbeast.pojo.entity.FeedPoint;
import cn.kmbeast.service.FeedPointService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/feedPoint")
public class FeedPointController {

    @Resource
    private FeedPointService feedPointService;

    @PostMapping("/query")
    public Result<List<FeedPoint>> query(@RequestBody FeedPointQueryDto queryDto) {
        List<FeedPoint> list = feedPointService.query(queryDto);
        Integer total = feedPointService.queryCount(queryDto);
        return ApiResult.success(list, total);
    }

    @PutMapping
    public Result<String> update(@RequestBody FeedPoint feedPoint) {
        feedPointService.update(feedPoint);
        return ApiResult.success("操作成功");
    }

    @PostMapping
    public Result<String> add(@RequestBody FeedPoint feedPoint) {
        if (feedPoint.getStatus() == null) {
            feedPoint.setStatus("normal");
        }
        feedPointService.insert(feedPoint);
        return ApiResult.success("添加成功");
    }

    @DeleteMapping
    public Result<String> delete(@RequestBody List<Integer> ids) {
        feedPointService.batchDelete(ids);
        return ApiResult.success("删除成功");
    }

    @GetMapping("/{id}")
    public Result<FeedPoint> getById(@PathVariable Integer id) {
        FeedPoint feedPoint = feedPointService.getById(id);
        return ApiResult.success(feedPoint);
    }
}