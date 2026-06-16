package com.luoshanghua.com.service;

import com.luoshanghua.com.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.luoshanghua.com.entity.dto.UserLoginDTO;
import com.luoshanghua.com.entity.vo.UserLoginVO;

/**
* @author Administrator
* @description 针对表【user(用户信息)】的数据库操作Service
* @createDate 2026-05-12 15:00:23
*/
public interface UserService extends IService<User> {

    /**
     * 登录，用户名不存在则创建用户，用户名存在则校验密码（phone)
     * @param userLoginDTO
     * @return
     */
    UserLoginVO login(UserLoginDTO userLoginDTO);
}
