package com.platform.idleplatform.user.service;

import com.platform.idleplatform.tool.AppResponse;
import com.platform.idleplatform.user.dao.UserDao;
import com.platform.idleplatform.user.entity.FansInfo;
import com.platform.idleplatform.user.entity.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    public UserDao userDao;

    public AppResponse getUserInfo(String userId){
        UserInfo loginInfo = userDao.getUserInfo(userId);
        return AppResponse.success("查询成功",loginInfo);
    }

    public AppResponse addFans(FansInfo fansInfo){
        userDao.addFans(fansInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse isFans(FansInfo fansInfo){
        int a = userDao.isFans(fansInfo);
        return AppResponse.success("查询成功",a);
    }

    public AppResponse cancelFans(FansInfo fansInfo){
        userDao.cancelFans(fansInfo);
        return AppResponse.success("更新成功");
    }
}
