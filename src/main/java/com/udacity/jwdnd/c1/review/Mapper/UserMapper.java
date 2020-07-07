package com.udacity.jwdnd.c1.review.Mapper;

import com.udacity.jwdnd.c1.review.Model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("SELECT * from users where username = #{username}")
    public User getUser(String username);

    @Insert("INSERT into users (username, salt, password, firstname, lastname) " +
            "values (#{username}, #{salt}, #{password}, #{firstName}, #{lastName})")
    @Options(useGeneratedKeys = true, keyProperty = "#{userid}")
    public Integer insert(User user);
}
