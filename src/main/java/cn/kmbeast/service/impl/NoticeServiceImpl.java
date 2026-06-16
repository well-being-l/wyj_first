package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.NoticeMapper;
import cn.kmbeast.pojo.dto.query.extend.NoticeQueryDto;
import cn.kmbeast.pojo.entity.Notice;
import cn.kmbeast.service.NoticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 系统公告Service实现类
 */
@Service
public class NoticeServiceImpl implements NoticeService {

    @Resource
    private NoticeMapper noticeMapper;

    @Override
    public void insert(Notice notice) {
        noticeMapper.insert(notice);
    }

    @Override
    public void deleteById(Long id) {
        noticeMapper.deleteById(id);
    }

    @Override
    public void batchDelete(List<Long> ids) {
        noticeMapper.batchDelete(ids);
    }

    @Override
    public void update(Notice notice) {
        noticeMapper.update(notice);
    }

    @Override
    public Notice getById(Long id) {
        return noticeMapper.getById(id);
    }

    @Override
    public List<Notice> query(NoticeQueryDto queryDto) {
        return noticeMapper.query(queryDto);
    }

    @Override
    public Integer queryCount(NoticeQueryDto queryDto) {
        return noticeMapper.queryCount(queryDto);
    }
}