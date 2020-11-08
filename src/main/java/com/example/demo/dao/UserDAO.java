package com.example.demo.dao;

/**
 * @Author : lihao
 * Created on : 2020-11-06
 * @Description : TODO描述类作用
 */
import com.example.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}
