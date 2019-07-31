package com.billow.tools.constant;

/**
 * redis 的 key
 *
 * @author liuyongtao
 * @create 2019-07-30 11:19
 */
public class RedisCst {

    /**
     * 角色的权限信息：ROLE:PERMISSION:ADMIN
     *
     */
    public final static String ROLE_PERMISSION_KEY = "ROLE:PERMISSION:";

    /**
     * 角色的菜单信息：ROLE:MENU:ADMIN
     *
     */
    public final static String ROLE_MENU_KEY = "ROLE:MENU:";

    /**
     * 数据字典信息：COMM:DICTIONARY
     *
     */
    public final static String COMM_DICTIONARY = "COMM:DICTIONARY";

    /**
     * 黑名单-修改过用户信息：BLACKLIST:EDITUSER:xxx
     *
     */
    public final static String BLACKLIST_EDITUSER = "BLACKLIST:EDITUSER:";
    /**
     * 黑名单-修改过用户信息：value 中的 key
     *
     */
    public final static String BLACKLIST_EDITUSER_OLDUSER = "oldUser";
    /**
     * 黑名单-修改过用户信息：value 中的 key
     *
     */
    public final static String BLACKLIST_EDITUSER_ROLECODES = "roleCodes";
}
