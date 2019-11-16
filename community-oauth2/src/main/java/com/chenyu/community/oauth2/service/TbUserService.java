package com.chenyu.community.oauth2.service;

import com.chenyu.community.oauth2.entity.TbUser;

public interface TbUserService {
    /*
    * 根据用户名得到用户对象
    * @param 用户名
    * @return 用户对象
    * */
    public TbUser getUserByUsername(String username);
}
