package cn.kmbeast.mapper;

import cn.kmbeast.pojo.dto.query.extend.NoticeQueryDto;
import cn.kmbeast.pojo.entity.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 系统公告Mapper接口
 */
@Mapper
public interface NoticeMapper {

    /**
     * 新增公告
     *
     * @param notice 公告实体
     * @return 影响行数
     */
    int insert(Notice notice);

    /**
     * 根据ID删除公告
     *
     * @param id 主键ID
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 批量删除公告
     *
     * @param ids 主键ID列表
     * @return 影响行数
     */
    int batchDelete(List<Long> ids);

    /**
     * 更新公告
     *
     * @param notice 公告实体
     * @return 影响行数
     */
    int update(Notice notice);

    /**
     * 根据ID查询公告
     *
     * @param id 主键ID
     * @return 公告实体
     */
    Notice getById(Long id);

    /**
     * 条件查询公告列表
     *
     * @param queryDto 查询条件
     * @return 公告列表
     */
    List<Notice> query(NoticeQueryDto queryDto);

    /**
     * 条件查询公告总数
     *
     * @param queryDto 查询条件
     * @return 总数
     */
    Integer queryCount(NoticeQueryDto queryDto);
}