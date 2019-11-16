package com.chenyu.community.oauth2.service.impl;

import com.chenyu.community.oauth2.entity.TbPermission;
import com.chenyu.community.oauth2.mapper.TbPermissionMapper;
import com.chenyu.community.oauth2.service.TbPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
public class TbPermissionServiceImpl implements TbPermissionService {
    @Autowired
    TbPermissionMapper tbPermissionMapper;
    @Override
    public List<TbPermission> getPermissionByUserId(long userId) {
        return tbPermissionMapper.getPermissionByUserId(userId);
    }
}
