package cn.kmbeast.mapper;

import cn.kmbeast.pojo.dto.query.extend.PostQueryDto;
import cn.kmbeast.pojo.entity.Post;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostMapper {

    void insert(Post post);

    void update(Post post);

    void batchDelete(@Param("ids") List<Integer> ids);

    Post getById(Integer id);

    List<Post> query(PostQueryDto queryDto);

    Integer queryCount(PostQueryDto queryDto);
}
