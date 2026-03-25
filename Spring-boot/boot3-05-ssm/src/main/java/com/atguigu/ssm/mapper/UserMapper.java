package com.atguigu.ssm.mapper;

import com.atguigu.ssm.bean.TUser;
import org.apache.ibatis.annotations.Param;

/**
 *
 */
public interface UserMapper {
    public TUser getUserById(@Param("id") Long id);


}
