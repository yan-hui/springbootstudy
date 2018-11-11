package lone.wolf.springbootstudy.service.impl;

import lone.wolf.springbootstudy.domain.User;
import lone.wolf.springbootstudy.mapper.UserMapper;
import lone.wolf.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/11 21:45
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int add(User user) {
        userMapper.insert(user);
        int id = user.getId();
        return id;

    }
}
