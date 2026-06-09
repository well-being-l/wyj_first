package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.ApplyApprovalMapper;
import cn.kmbeast.pojo.dto.query.extend.ApplyApprovalQueryDto;
import cn.kmbeast.pojo.entity.ApplyApproval;
import cn.kmbeast.service.ApplyApprovalService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ApplyApprovalServiceImpl implements ApplyApprovalService {

    @Resource
    private ApplyApprovalMapper applyApprovalMapper;

    @Override
    public void insert(ApplyApproval applyApproval) {
        applyApprovalMapper.insert(applyApproval);
    }

    @Override
    public void update(ApplyApproval applyApproval) {
        applyApprovalMapper.update(applyApproval);
    }

    @Override
    public void batchDelete(List<Integer> ids) {
        applyApprovalMapper.batchDelete(ids);
    }

    @Override
    public ApplyApproval getById(Integer id) {
        return applyApprovalMapper.getById(id);
    }

    @Override
    public List<ApplyApproval> query(ApplyApprovalQueryDto queryDto) {
        return applyApprovalMapper.query(queryDto);
    }

    @Override
    public Integer queryCount(ApplyApprovalQueryDto queryDto) {
        return applyApprovalMapper.queryCount(queryDto);
    }
}