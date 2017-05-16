package top.haw358.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.haw358.demo.dao.UserMapper;
import top.haw358.demo.model.User;
import top.haw358.demo.service.UserService;


/**
 * Created by haw on 17-5-14.
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
