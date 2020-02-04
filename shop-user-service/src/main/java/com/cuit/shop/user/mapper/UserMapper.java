package com.cuit.shop.user.mapper;


import com.cuit.shop.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

/**
 * 继承Mapper 表示将来UmsMember的所有的增删改查操作全都能够用Mapper来进行操作
 */
public interface UserMapper extends Mapper<UmsMember> {

}
