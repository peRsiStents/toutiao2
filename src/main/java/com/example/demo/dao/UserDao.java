package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.*;

/**
 * @author sunlssd@qq.com
 * @Description:
 * @date 2018-09-13 21:53
 */
@Mapper
public interface UserDao {
    String TABLE_NAME="user";
    String  INSERT_FIELDS="name,password,salt,head_url";
    String SLECT_FIELDS="id,name,password,salt,head_url";

    @Insert({"insert into ",TABLE_NAME, "(",INSERT_FIELDS,
            ")","values(#{name},#{password},#{salt},#{headUrl})"})
    int addUser(User user);


    @Select({"select  ",SLECT_FIELDS," from ",TABLE_NAME,"where=#{id}"})
    User selectById(int id);

    @Update({"update ",TABLE_NAME,"set password =#{password} where id =#{id}"})
    void updatePassword(User user);

    @Delete({"delete",TABLE_NAME,"where id =#{id}"})
    void deleteByid(int id);
}
