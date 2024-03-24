package net.xdclass.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.xdclass.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 电商-公司收发货地址表 前端控制器
 * </p>
 *
 * @author 二当家小D
 * @since 2024-03-24
 */
@Api(tags = "地址模块")
@RestController
@RequestMapping("/api/v1/address/")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @ApiOperation("根据id查询地址信息")
    @GetMapping("/detail/{address_id}")
    public Object detail(
            @ApiParam(value = "地址id",required = true)
            @PathVariable("address_id") long id){
        return addressService.detail(id);
    }

}

