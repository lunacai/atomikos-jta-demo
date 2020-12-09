package com.example.atomikosjtademo.service;

import com.example.atomikosjtademo.mapping.UserMapper;
import com.example.atomikosjtademo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User select(int ids) {
        User result = userMapper.selectByPrimaryKey(ids);
        return result;
    }

    public int insert(User record) {
        int result = userMapper.insert(record);
        return result;
    }

    public int update(User record) {
        int result = userMapper.updateByPrimaryKey(record);
        return result;
    }

    public int delete(int ids) {
        int result = userMapper.deleteByPrimaryKey(ids);
        return result;
    }

    public int insertWithHystrix(User record) {
        int result = userMapper.insert(record);
		/*
		long now = System.currentTimeMillis();
		// 模拟一个异常
		if (now % 2 > -1) {
			throw new RuntimeException("Insert user throws test insert exception");
		}
		*/
        return result;
    }
}
