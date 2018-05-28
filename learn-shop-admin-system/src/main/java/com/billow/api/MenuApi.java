package com.billow.api;

import com.billow.common.base.BaseApi;
import com.billow.common.enums.ResCodeEnum;
import com.billow.common.resData.BaseResponse;
import com.billow.pojo.ex.MenuEx;
import com.billow.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 菜单管理
 *
 * @author liuyongtao
 * @create 2018-05-26 9:27
 */
@RestController
@RequestMapping("/menuApi")
@Api(value = "MenuApi", description = "菜单管理")
public class MenuApi extends BaseApi {

    @Autowired
    private MenuService menuService;

    @GetMapping("/indexMenus")
    @ApiOperation(value = "初始化菜单信息", notes = "初始化菜单信息")
    public BaseResponse<List<MenuEx>> indexMenus() {
        BaseResponse<List<MenuEx>> baseResponse = this.getBaseResponse();
        try {
            List<MenuEx> menuExes = menuService.indexMenus();
            baseResponse.setResData(menuExes);
        } catch (Exception e) {
            baseResponse.setResCode(ResCodeEnum.FAIL);
            this.getErrorInfo(e);
        }
        return baseResponse;
    }
}