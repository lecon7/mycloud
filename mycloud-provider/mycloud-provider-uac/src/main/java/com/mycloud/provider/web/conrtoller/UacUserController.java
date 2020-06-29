package com.mycloud.provider.web.conrtoller;

import entity.UacUser;
import com.mycloud.provider.service.UacUserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author YanHao [yanhao@tiemavi.com]
 */
@RestController
public class UacUserController {

    @Resource
    private UacUserService uacUserService;

    @RequestMapping(value = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UacUser> findUserById(@PathVariable("userId") Integer userId) {
        UacUser uacUser = uacUserService.findUserById(userId);
        return ResponseEntity.ok(uacUser);
    }
}
