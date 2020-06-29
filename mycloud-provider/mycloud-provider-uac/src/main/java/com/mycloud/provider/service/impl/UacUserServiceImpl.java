package com.mycloud.provider.service.impl;

import com.mycloud.provider.dao.UacUserMapper;
import entity.UacUser;
import com.mycloud.provider.service.UacUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author YanHao [yanhao@tiemavi.com]
 */
@Service
public class UacUserServiceImpl implements UacUserService {

    @Resource
    private UacUserMapper uacUserMapper;

    @Override
    public UacUser findUserById(Integer userId) {
        return uacUserMapper.findUserById(userId);
    }
}
