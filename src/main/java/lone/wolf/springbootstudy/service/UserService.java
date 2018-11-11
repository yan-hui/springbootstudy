package lone.wolf.springbootstudy.service;

import lone.wolf.springbootstudy.domain.User;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/11 21:44
 */
public interface UserService {
    int add(User user);
}
