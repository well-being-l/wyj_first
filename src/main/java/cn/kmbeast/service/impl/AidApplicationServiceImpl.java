package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.AidApplicationMapper;
import cn.kmbeast.pojo.dto.AuditDto;
import cn.kmbeast.pojo.dto.query.extend.AidApplicationQueryDto;
import cn.kmbeast.pojo.entity.AidApplication;
import cn.kmbeast.service.AidApplicationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 援助申请Service实现类
 */
@Service
public class AidApplicationServiceImpl implements AidApplicationService {

    @Resource
    private AidApplicationMapper aidApplicationMapper;

    @Override
    public void insert(AidApplication aidApplication) {
        aidApplicationMapper.insert(aidApplication);
    }

    @Override
    public void deleteById(Long id) {
        aidApplicationMapper.deleteById(id);
    }

    @Override
    public void update(AidApplication aidApplication) {
        aidApplicationMapper.update(aidApplication);
    }

    @Override
    public void audit(AuditDto auditDto) {
        AidApplication aidApplication = AidApplication.builder()
                .id(auditDto.getId())
                .status(auditDto.getStatus())
                .auditTime(LocalDateTime.now())
                .auditorId(auditDto.getAuditorId())
                .auditorName(auditDto.getAuditorName())
                .build();
        aidApplicationMapper.audit(aidApplication);
    }

    @Override
    public AidApplication getById(Long id) {
        return aidApplicationMapper.getById(id);
    }

    @Override
    public List<AidApplication> query(AidApplicationQueryDto queryDto) {
        return aidApplicationMapper.query(queryDto);
    }

    @Override
    public Integer queryCount(AidApplicationQueryDto queryDto) {
        return aidApplicationMapper.queryCount(queryDto);
    }
}