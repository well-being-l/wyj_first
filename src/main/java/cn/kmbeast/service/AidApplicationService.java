package cn.kmbeast.service;

import cn.kmbeast.pojo.dto.AuditDto;
import cn.kmbeast.pojo.dto.query.extend.AidApplicationQueryDto;
import cn.kmbeast.pojo.entity.AidApplication;

import java.util.List;

/**
 * 援助申请Service接口
 */
public interface AidApplicationService {

    /**
     * 新增援助申请
     *
     * @param aidApplication 援助申请实体
     */
    void insert(AidApplication aidApplication);

    /**
     * 根据ID删除援助申请
     *
     * @param id 主键ID
     */
    void deleteById(Long id);

    /**
     * 更新援助申请
     *
     * @param aidApplication 援助申请实体
     */
    void update(AidApplication aidApplication);

    /**
     * 审核援助申请
     *
     * @param auditDto 审核信息
     */
    void audit(AuditDto auditDto);

    /**
     * 根据ID查询援助申请
     *
     * @param id 主键ID
     * @return 援助申请实体
     */
    AidApplication getById(Long id);

    /**
     * 条件查询援助申请列表
     *
     * @param queryDto 查询条件
     * @return 援助申请列表
     */
    List<AidApplication> query(AidApplicationQueryDto queryDto);

    /**
     * 条件查询援助申请总数
     *
     * @param queryDto 查询条件
     * @return 总数
     */
    Integer queryCount(AidApplicationQueryDto queryDto);
}