package cn.kmbeast.service;

import cn.kmbeast.pojo.dto.query.extend.PostQueryDto;
import cn.kmbeast.pojo.entity.Post;

import java.util.List;

public interface PostService {

    void insert(Post post);

    void update(Post post);

    void batchDelete(List<Integer> ids);

    Post getById(Integer id);

    List<Post> query(PostQueryDto queryDto);

    Integer queryCount(PostQueryDto queryDto);
}