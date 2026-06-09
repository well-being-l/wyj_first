package cn.kmbeast.service;

import cn.kmbeast.pojo.dto.query.extend.UserQueryDto;
import cn.kmbeast.pojo.entity.User;

import java.util.List;

public interface UserService {

    int insert(User user);

    List<User> query(UserQueryDto userQueryDto);

    int queryCount(UserQueryDto userQueryDto);

    int update(User user);

    void batchDelete(List<Integer> ids);

    User getByActive(User user);
    // ... existing code ...

    int updateAvatar(Integer id, String avatar);

    int updatePassword(Integer id, String password);

    User getById(Integer id);
}


