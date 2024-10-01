package com.ethan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ethan.mapper.UserMapper;
import com.ethan.model.entity.User;
import com.ethan.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
