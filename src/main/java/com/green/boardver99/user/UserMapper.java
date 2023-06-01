package com.green.boardver99.user;

import com.green.boardver99.user.model.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
  int insUser(UserEntity entity);
}
