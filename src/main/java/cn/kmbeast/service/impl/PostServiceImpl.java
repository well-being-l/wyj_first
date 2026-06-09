package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.PostMapper;
import cn.kmbeast.pojo.dto.query.extend.PostQueryDto;
import cn.kmbeast.pojo.entity.Post;
import cn.kmbeast.service.PostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Resource
    private PostMapper postMapper;

    @Override
    public void insert(Post post) {
        postMapper.insert(post);
    }

    @Override
    public void update(Post post) {
        postMapper.update(post);
    }

    @Override
    public void batchDelete(List<Integer> ids) {
        postMapper.batchDelete(ids);
    }

    @Override
    public Post getById(Integer id) {
        return postMapper.getById(id);
    }

    @Override
    public List<Post> query(PostQueryDto queryDto) {
        return postMapper.query(queryDto);
    }

    @Override
    public Integer queryCount(PostQueryDto queryDto) {
        return postMapper.queryCount(queryDto);
    }
}