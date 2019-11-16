package com.chenyu.community.oauth2.mapper;

import com.chenyu.community.oauth2.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface TbUserMapper {
   /*
   * 查询用户基本信息
   * @param 用户名
   * @return TbUser
   * */
   public TbUser getUserByUsername (String username);
}
