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

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Resource
    private AnimalService animalService;

    @PostMapping
    public Result<String> add(@RequestBody Animal animal) {
        if (animal.getFoundTime() == null) {
            animal.setFoundTime(LocalDateTime.now());
        }
        if (animal.getHealthStatus() == null) {
            animal.setHealthStatus(0);
        }
        animalService.insert(animal);
        return ApiResult.success();
    }

    @PutMapping
    public Result<String> update(@RequestBody Animal animal) {
        animalService.update(animal);
        return ApiResult.success();
    }

    @DeleteMapping
    public Result<String> delete(@RequestBody List<Integer> ids) {
        animalService.batchDelete(ids);
        return ApiResult.success();
    }

    @GetMapping("/{id}")
    public Result<Animal> getById(@PathVariable Integer id) {
        Animal animal = animalService.getById(id);
        return ApiResult.success(animal);
    }

    @PostMapping("/query")
    public Result<List<AnimalVO>> query(@RequestBody AnimalQueryDto queryDto) {
        List<AnimalVO> list = animalService.query(queryDto);
        Integer total = animalService.queryCount(queryDto);
        return ApiResult.success(list, total);
    }
}
