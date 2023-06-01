package com.green.boardver99.user;

import com.green.boardver99.user.model.UserEntity;
import com.green.boardver99.user.model.UserLoginDto;
import com.green.boardver99.user.model.UserLoginVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
  int insUser(UserEntity entity);
  UserLoginVo LoginUser(UserLoginDto dto);
}
