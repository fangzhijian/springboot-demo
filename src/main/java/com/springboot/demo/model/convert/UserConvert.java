package com.springboot.demo.model.convert;

import com.springboot.demo.annotation.PhoneDesensitize;
import com.springboot.demo.model.po.user.User;
import com.springboot.demo.model.vo.user.UserVo;
import com.springboot.demo.until.MapStructUtil;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * {@code @description} 用户相关转换类
 *
 * @author fangzhijian
 * @since 2025-12-31 11:37
 */
@Mapper(uses = {MapStructUtil.class})
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    /**
     * po转vo
     *
     * @param user userPo
     * @return Vo
     */
    @Mappings({
            @Mapping(target = "password", ignore = true),
            @Mapping(target = "phone", qualifiedBy = PhoneDesensitize.class)
    })
    UserVo poToVo(User user);
}
