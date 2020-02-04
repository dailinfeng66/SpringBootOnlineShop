package com.cuit.shop.controllerApi.user;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.List;

public interface UserControllerApi {
    @ApiOperation(value = "hello", notes = "hello测试")
    String sayHello();

    @ApiOperation(value = "得到所有User", notes = "hello测试")
    List getAllUser();

    @ApiOperation("根据memberid查询用户地址")
    @ApiImplicitParam(name = "memberId", value = "String")
    List getReceiveAddressByMemberId(String memberId);


}
