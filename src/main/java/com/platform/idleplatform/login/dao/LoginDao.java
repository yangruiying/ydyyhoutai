package com.platform.idleplatform.login.dao;

import com.platform.idleplatform.login.entity.LoginInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginDao {
    public LoginInfo login(LoginInfo loginInfo);


}
