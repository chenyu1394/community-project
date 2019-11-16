package com.chenyu.community.oauth2.config.service;

import com.chenyu.community.oauth2.entity.TbPermission;
import com.chenyu.community.oauth2.entity.TbUser;
import com.chenyu.community.oauth2.service.TbPermissionService;
import com.chenyu.community.oauth2.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    TbPermissionService tbPermissionService;
    @Autowired
    TbUserService tbUserService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 查询用户信息
        TbUser tbUser = tbUserService.getUserByUsername(username);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if (tbUser != null) {
            // 获取用户授权
            List<TbPermission> tbPermissions = tbPermissionService.getPermissionByUserId(tbUser.getId());

            // 声明用户授权
            for (TbPermission e : tbPermissions) {
                if (e != null && e.getEnname() != null) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(e.getEnname());
                    grantedAuthorities.add(grantedAuthority);
                }
            }
        }

        // 由框架完成认证工作
        assert tbUser != null;
        return new User(tbUser.getUsername(), tbUser.getPassword(), grantedAuthorities);
    }
}
