package com.chenyu.community.oauth2.mapper;

import com.chenyu.community.oauth2.entity.TbPermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface TbPermissionMapper {
    /*
    * 查询用户所有权限
    * @param Long 用户id
    * @return TbPermission 权限对象列表
    * */
    public List<TbPermission> getPermissionByUserId(long id);
}
