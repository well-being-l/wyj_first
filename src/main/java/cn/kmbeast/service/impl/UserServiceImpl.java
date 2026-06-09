package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.UserMapper;
import cn.kmbeast.pojo.dto.query.extend.UserQueryDto;
import cn.kmbeast.pojo.entity.User;
import cn.kmbeast.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> query(UserQueryDto userQueryDto) {
        return userMapper.query(userQueryDto);
    }

    @Override
    public int queryCount(UserQueryDto userQueryDto) {
        return userMapper.queryCount(userQueryDto);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public void batchDelete(List<Integer> ids) {
        userMapper.batchDelete(ids);
    }

    @Override
    public User getByActive(User user) {
        return userMapper.getByActive(user);
    }
    // ... existing code ...
    @Override

    public int updateAvatar(Integer id, String avatar) {
        return userMapper.updateAvatar(id, avatar);
    }

    @Override
    public int updatePassword(Integer id, String password) {
        return userMapper.updatePassword(id, password);
    }

    @Override
    public User getById(Integer id) {
        return userMapper.getById(id);
    }
}


