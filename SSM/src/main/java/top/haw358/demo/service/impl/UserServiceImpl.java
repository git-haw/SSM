package top.haw358.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.haw358.demo.dao.UserMapper;
import top.haw358.demo.model.User;
import top.haw358.demo.service.IUserService;


/**
 * Created by haw on 17-5-14.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
