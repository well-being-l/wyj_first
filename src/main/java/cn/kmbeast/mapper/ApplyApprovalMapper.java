package cn.kmbeast.mapper;

import cn.kmbeast.pojo.dto.query.extend.ApplyApprovalQueryDto;
import cn.kmbeast.pojo.entity.ApplyApproval;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplyApprovalMapper {

    void insert(ApplyApproval applyApproval);

    void update(ApplyApproval applyApproval);

    void batchDelete(@Param("ids") List<Integer> ids);

    ApplyApproval getById(Integer id);

    List<ApplyApproval> query(ApplyApprovalQueryDto queryDto);

    Integer queryCount(ApplyApprovalQueryDto queryDto);
}