package com.cuit.shop.Service;



import java.util.List;

public interface UserService {
    List<com.cuit.shop.bean.UmsMember> getAllUsers();

    List<com.cuit.shop.bean.UmsMemberReceiveAddress> getReceiveAddressByMemberId(String id);
}
