package com.mycloud.provider.dao;

import entity.UacUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author YanHao [yanhao@tiemavi.com]
 */
@Mapper
public interface UacUserMapper {

    UacUser findUserById(Integer userId);
}
