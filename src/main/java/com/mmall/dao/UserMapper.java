package com.mmall.dao;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUsername(String username);

    int checkEmail(String email);

    //mybatis在传递多个参数的时候，要用到@Param("")注解，在写sql的时候，对应的是注解里的String
    User selectLogin(@Param("username")String username,@Param("password") String password);

    String selectQuestionByUsername(String username);

     int checkAnswer(@Param("username") String username, @Param("question") String question, @Param("answer") String answer);

    int updatePasswordByUsername(@Param("username") String username, @Param("passwordNew") String passwordNew);

    int checkPassword(String password,Integer userId);

    int checkEmailByUserId(@Param("email") String email, @Param("userId") Integer userId);
}