package com.mycloud.provider.service;

import entity.UacUser;

/**
 * @author YanHao [yanhao@tiemavi.com]
 */
public interface UacUserService {

    /**
     * Finds user info by specified id.
     *
     * @param userId 用户编号
     * @return
     */
    UacUser findUserById(Integer userId);
}
