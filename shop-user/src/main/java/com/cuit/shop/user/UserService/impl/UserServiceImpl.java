package com.cuit.shop.user.UserService.impl;

import com.cuit.shop.Service.UserService;
import com.cuit.shop.bean.UmsMemberReceiveAddress;
import com.cuit.shop.user.mapper.UmsMemberReceiveAddressMapper;
import com.cuit.shop.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMapper;

    @Override
    public List<com.cuit.shop.bean.UmsMember> getAllUsers() {
//        return userMapper.selectAllUsers();

        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String id) {
        /**
         * 第一种方法  用Example
         */
        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId", id);
        return  umsMapper.selectByExample(example);
        /**
         * 第二种方法
         * 根据这个对象来查找 这个对象里面 哪一个字段不为空,就查找哪一个字段
         */
//        UmsMemberReceiveAddress umsAddress = new UmsMemberReceiveAddress();
//        umsAddress.setMemberId(id);
////        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMapper.selectByExample(umsAddress);
//        return umsMapper.select(umsAddress);
    }
}
