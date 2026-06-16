package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.MedicalRecordMapper;
import cn.kmbeast.pojo.dto.query.extend.MedicalRecordQueryDto;
import cn.kmbeast.pojo.entity.MedicalRecord;
import cn.kmbeast.service.MedicalRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 医疗记录Service实现类
 */
@Service
public class MedicalRecordServiceImpl implements MedicalRecordService {

    @Resource
    private MedicalRecordMapper medicalRecordMapper;

    @Override
    public void insert(MedicalRecord medicalRecord) {
        medicalRecordMapper.insert(medicalRecord);
    }

    @Override
    public void deleteById(Long id) {
        medicalRecordMapper.deleteById(id);
    }

    @Override
    public void batchDelete(List<Long> ids) {
        medicalRecordMapper.batchDelete(ids);
    }

    @Override
    public void update(MedicalRecord medicalRecord) {
        medicalRecordMapper.update(medicalRecord);
    }

    @Override
    public MedicalRecord getById(Long id) {
        return medicalRecordMapper.getById(id);
    }

    @Override
    public List<MedicalRecord> query(MedicalRecordQueryDto queryDto) {
        return medicalRecordMapper.query(queryDto);
    }

    @Override
    public Integer queryCount(MedicalRecordQueryDto queryDto) {
        return medicalRecordMapper.queryCount(queryDto);
    }
}