package lone.wolf.springbootstudy.mapper;

import lone.wolf.springbootstudy.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author hechunhui
 * @Created 2018/11/11 21:31
 */

public interface UserMapper {
    /**
     * keyProperty java对象的属性，keyColumn表示数据库的字段
     *
     * @param user
     * @return
     */
    @Insert("Insert into user(name,pwd,age,phone,create_time) values(#{name},#{pwd},#{age},#{phone},#{createTime})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insert(User user);

    @Select("select * from user")
    @Results({
            @Result(column = "create_time", property = "createTime")
    })
    List<User> getAll();

    @Select("select * from user where id=#{id}")
    @Results({
            @Result(column = "create_time", property = "createTime")
    })
    User getUserById(long id);

    @Update("update user set name=#{name} where id=#{id}")
    void update(User user);

    @Delete("delete from user where id=#{id}")
    void delete(long id);


}
