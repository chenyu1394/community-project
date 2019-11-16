package com.chenyu.community.oauth2.service;

import com.chenyu.community.oauth2.entity.TbPermission;

import java.util.List;

public interface TbPermissionService {
   public List<TbPermission> getPermissionByUserId(long userId);
}
