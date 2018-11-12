package lone.wolf.springbootstudy.service.impl;

import lone.wolf.springbootstudy.domain.User;
import lone.wolf.springbootstudy.mapper.UserMapper;
import lone.wolf.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    @Transactional(propagation = Propagation.REQUIRED)
    public int add(User user) {
        user.setName("事物测试");
        userMapper.insert(user);
        int id = user.getId();
        int i = 9/0;
        return id;

    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User findById(long id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(long id) {
        userMapper.delete(id);
    }


}
