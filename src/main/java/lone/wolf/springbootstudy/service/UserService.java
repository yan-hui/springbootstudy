package lone.wolf.springbootstudy.service;

import lone.wolf.springbootstudy.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/11 21:44
 */
public interface UserService {
    int add(User user);
    List<User> getAll();
    User findById(long id);
    void update(User user);
    void delete(long id);
}
