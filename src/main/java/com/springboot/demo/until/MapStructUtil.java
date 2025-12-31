package com.springboot.demo.until;

import cn.hutool.core.util.DesensitizedUtil;
import com.springboot.demo.annotation.AddressDesensitize;
import com.springboot.demo.annotation.IdCardDesensitize;
import com.springboot.demo.annotation.NameDesensitize;
import com.springboot.demo.annotation.PhoneDesensitize;
import org.mapstruct.Named;

/**
 * {@code @description} MapStruct工具类
 *
 * @author fangzhijian
 * @since 2025-12-29 14:19
 */
public class MapStructUtil {

    /**
     * 地址脱敏：只显示到地区，不显示详细地址，比如：北京市海淀区****
     *
     * @param address 地址
     * @return 脱敏后的地址
     */
    @AddressDesensitize
    @Named("addressDesensitize")
    public static String addressDesensitize(String address) {
        return DesensitizedUtil.address(address, 6);
    }

    /**
     * 邮箱脱敏：邮箱前缀仅显示第一个字母，前缀其他隐藏，用星号代替，@及后面的地址显示，比如：d**@126.com
     *
     * @param email 邮箱
     * @return 脱敏后的邮箱
     */
    @AddressDesensitize
    @Named("addressDesensitize")
    public static String emailDesensitize(String email) {
        return DesensitizedUtil.email(email);
    }

    /**
     * 身份证号脱敏：保留前4位和后4位
     *
     * @param idCard 身份证号
     * @return 脱敏后的身份证号
     */
    @IdCardDesensitize
    @Named("idCardDesensitize")
    public static String idCardDesensitize(String idCard) {
        return DesensitizedUtil.idCardNum(idCard, 4, 4);
    }

    /**
     * 姓名脱敏：只显示第一个汉字，其他隐藏为2个星号，比如：李*
     *
     * @param name 姓名
     * @return 脱敏后的姓名
     */
    @NameDesensitize
    @Named("nameDesensitize")
    public static String nameDesensitize(String name) {
        return DesensitizedUtil.chineseName(name);
    }

    /**
     * 手机号脱敏：前三位，后4位，其他隐藏，比如135****2210
     *
     * @param phone 手机号
     * @return 脱敏后的手机号
     */
    @PhoneDesensitize
    @Named("phoneDesensitize")
    public static String phoneDesensitize(String phone) {
        return DesensitizedUtil.mobilePhone(phone);
    }
}
