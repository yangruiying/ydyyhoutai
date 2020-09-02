package com.platform.idleplatform.user.controller;

import com.platform.idleplatform.tool.AppResponse;
import com.platform.idleplatform.user.entity.FansInfo;
import com.platform.idleplatform.user.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
@CrossOrigin
public class UserController {
    @Resource
    public UserService userService;

    @RequestMapping("getUserInfo")
    public AppResponse getUserInfo(String userId){
        return userService.getUserInfo(userId);
    }

    @PostMapping("addFans")
    public AppResponse addFans(FansInfo fansInfo){
        return userService.addFans(fansInfo);
    }

    @RequestMapping("isFans")
    public AppResponse isFans(FansInfo fansInfo){
        return userService.isFans(fansInfo);
    }

    @PostMapping("cancelFans")
    public AppResponse cancelFans(FansInfo fansInfo){
        return userService.cancelFans(fansInfo);
    }
}
