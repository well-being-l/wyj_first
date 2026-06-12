package cn.kmbeast.controller;

import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.AnimalQueryDto;
import cn.kmbeast.pojo.entity.Animal;
import cn.kmbeast.pojo.vo.AnimalVO;
import cn.kmbeast.service.AnimalService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Resource
    private AnimalService animalService;

    /**
     * 新增动物档案
     */
    @PostMapping
    public Result<String> add(@RequestBody Animal animal) {
        if (animal.getFoundTime() == null) {
            animal.setFoundTime(LocalDateTime.now());
        }
        if (animal.getHealthStatus() == null) {
            animal.setHealthStatus(0);
        }
        if (animal.getLifeStatus() == null) {
            animal.setLifeStatus("待审核");
        }
        animalService.insert(animal);
        return ApiResult.success();
    }

    /**
     * 更新动物档案
     */
    @PutMapping
    public Result<String> update(@RequestBody Animal animal) {
        animalService.update(animal);
        return ApiResult.success();
    }

    /**
     * 批量删除动物档案
     */
    @DeleteMapping
    public Result<String> delete(@RequestBody List<Integer> ids) {
        animalService.batchDelete(ids);
        return ApiResult.success();
    }

    /**
     * 根据ID获取动物详情
     */
    @GetMapping("/{id}")
    public Result<Animal> getById(@PathVariable Integer id) {
        Animal animal = animalService.getById(id);
        return ApiResult.success(animal);
    }

    /**
     * 查询动物列表
     */
    @PostMapping("/query")
    public Result<List<AnimalVO>> query(@RequestBody AnimalQueryDto queryDto) {
        List<AnimalVO> list = animalService.query(queryDto);
        Integer total = animalService.queryCount(queryDto);
        return ApiResult.success(list, total);
    }

    /**
     * 统计各类型动物数量
     */
    @GetMapping("/count/type")
    public Result<Map<String, Integer>> countByType() {
        Map<String, Integer> result = animalService.countByType();
        return ApiResult.success(result);
    }

    /**
     * 统计各状态动物数量
     */
    @GetMapping("/count/status")
    public Result<Map<String, Integer>> countByLifeStatus() {
        Map<String, Integer> result = animalService.countByLifeStatus();
        return ApiResult.success(result);
    }
}