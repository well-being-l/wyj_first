package cn.kmbeast.controller;

import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.PostQueryDto;
import cn.kmbeast.pojo.entity.Post;
import cn.kmbeast.service.PostService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Resource
    private PostService postService;

    @PostMapping
    public Result<String> add(@RequestBody Post post) {
        if (post.getPublishTime() == null) {
            post.setPublishTime(LocalDateTime.now());
        }
        if (post.getStatus() == null) {
            post.setStatus("待审核");
        }
        postService.insert(post);
        return ApiResult.success();
    }

    @PutMapping
    public Result<String> update(@RequestBody Post post) {
        postService.update(post);
        return ApiResult.success();
    }

    @DeleteMapping
    public Result<String> delete(@RequestBody List<Integer> ids) {
        postService.batchDelete(ids);
        return ApiResult.success();
    }

    @GetMapping("/{id}")
    public Result<Post> getById(@PathVariable Integer id) {
        Post post = postService.getById(id);
        return ApiResult.success(post);
    }

    @PostMapping("/query")
    public Result<List<Post>> query(@RequestBody PostQueryDto queryDto) {
        List<Post> list = postService.query(queryDto);
        Integer total = postService.queryCount(queryDto);
        return ApiResult.success(list, total);
    }
}