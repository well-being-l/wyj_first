package cn.kmbeast.service;

import cn.kmbeast.pojo.dto.query.extend.ApplyApprovalQueryDto;
import cn.kmbeast.pojo.entity.ApplyApproval;

import java.util.List;

public interface ApplyApprovalService {

    void insert(ApplyApproval applyApproval);

    void update(ApplyApproval applyApproval);

    void batchDelete(List<Integer> ids);

    ApplyApproval getById(Integer id);

    List<ApplyApproval> query(ApplyApprovalQueryDto queryDto);

    Integer queryCount(ApplyApprovalQueryDto queryDto);
}
