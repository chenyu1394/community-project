package com.chenyu.community.oauth2.service.impl;

import com.chenyu.community.oauth2.entity.TbUser;
import com.chenyu.community.oauth2.mapper.TbUserMapper;
import com.chenyu.community.oauth2.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
public class TbUserImpl implements TbUserService {
    @Autowired
    TbUserMapper tbUserMapper;
    @Override
    public TbUser getUserByUsername(String username) {
        return tbUserMapper.getUserByUsername(username);
    }
}
