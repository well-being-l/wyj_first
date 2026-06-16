package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.VaccineRecordMapper;
import cn.kmbeast.pojo.dto.query.extend.VaccineRecordQueryDto;
import cn.kmbeast.pojo.entity.VaccineRecord;
import cn.kmbeast.service.VaccineRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 疫苗记录Service实现类
 */
@Service
public class VaccineRecordServiceImpl implements VaccineRecordService {

    @Resource
    private VaccineRecordMapper vaccineRecordMapper;

    @Override
    public void insert(VaccineRecord vaccineRecord) {
        vaccineRecordMapper.insert(vaccineRecord);
    }

    @Override
    public void deleteById(Long id) {
        vaccineRecordMapper.deleteById(id);
    }

    @Override
    public void update(VaccineRecord vaccineRecord) {
        vaccineRecordMapper.update(vaccineRecord);
    }

    @Override
    public VaccineRecord getById(Long id) {
        return vaccineRecordMapper.getById(id);
    }

    @Override
    public List<VaccineRecord> query(VaccineRecordQueryDto queryDto) {
        return vaccineRecordMapper.query(queryDto);
    }

    @Override
    public Integer queryCount(VaccineRecordQueryDto queryDto) {
        return vaccineRecordMapper.queryCount(queryDto);
    }
}