package com.platform.idleplatform.user.dao;

import com.platform.idleplatform.user.entity.FansInfo;
import com.platform.idleplatform.user.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    public UserInfo getUserInfo(String userId);

    public int addFans(FansInfo fansInfo);

    public int isFans(FansInfo fansInfo);

    public int cancelFans(FansInfo fansInfo);

    public int getFansNum(String userId);

    public int getAttenNum(String userId);

    public List<UserInfo> getFans();

}
