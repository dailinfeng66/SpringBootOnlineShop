package com.cuit.shop.user.UserController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cuit.shop.Service.UserService;
import com.cuit.shop.controllerApi.user.UserControllerApi;
import io.swagger.annotations.Api;
//import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//描述controller的作用
@Api(tags = "shop-学习-day 1to2")
@RestController
public class UserController implements UserControllerApi {
    /**
     * @Api 用在请求的类上 表示对类的说明
     * tags="说明该类的作用,可以在ui界面上看到的注解"
     * value="该参数没有什么意义,在ui界面上也看不到,所以不需要配置"
     * @ApiOperation: 用在请求的方法上, 说明方法的用途, 作用
     * value:说明方法的用途,作用
     * notes:方法的备注说明
     * @ApiImplicitParams:用在请求的方法上表示一组参数说明
     * @ApiImplicitParam:用在@ApiImplicctParams注解中指定一个请求参数的各个方面 name:参数名
     * value:参数的汉字说明,解释
     * required:参数是否 必须传
     * paramType:参数放在哪个地方
     * header->请求参数的获取:@RequestHeader
     * query->请求参数的获取:@RequestParam
     * path(用于restful风格接口)->请求参数的获取@PathVariable
     * body 不常用
     * form 不常用
     * dataType:参数类型,默认String,其他值dataType="intenger"
     * defaultValue:默认的参数值
     * EG:
     * @ApiImplicitParams({@ApiImplicitParam(name="pageNum",defaultValue = "1",required = true,dataType = "int",paramType = "path")
     * ,@ApiImplicitParam(name="pageSize",defaultValue = "10",required = true,dataType = "int",paramType = "path")})
     * @ApiReponses:用于在请求的方法上表示一组响应
     * @ApiReponse:用在@ApiReponses中,一般用于表达一个错误的响应信息 code:数字 -> 500
     * message:信息
     * reponse:抛出异常的类
     * @ApiModel:用于响应类上,表示一个返回响应数据信息 ->这种一般用在post创建的时候使用@RequestBody的时候请求参数无法使用@ApiImplicitParam注解进行描述的时候
     * @ApiModelProperty:用在属性上描述响应类的属性
     */


    /**
     * 这里把@Autowired改为@Reference
     * 一定是dubbo的@Reference  远程注入
     */
    @Reference
    UserService userService;


    @GetMapping("hello")
    @Override
    public String sayHello() {
        return "hello world";
    }

    /**
     * 得到所有user
     *
     * @return
     */
    @GetMapping("getAllUsers")
    @Override
    public List getAllUser() {
        return userService.getAllUsers();
    }

    /**
     * 根据memberid查询收货地址
     *
     * @param memberId
     * @return
     */

    @GetMapping("ReceiveAddress/{memberId}")
    @Override
    public List getReceiveAddressByMemberId(@PathVariable("memberId") String memberId) {
        return userService.getReceiveAddressByMemberId(memberId);
    }

}


