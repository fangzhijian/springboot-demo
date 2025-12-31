package com.springboot.demo.model.vo.user;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * {@code @description} 用户VO
 *
 * @author fangzhijian
 * @since 2025-12-31 11:36
 */
@Data
public class UserVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 密码
     */
    private String password;
    /**
     * token
     */
    private String apiToken;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 指定权限
     */
    private Integer role;
    /**
     * 指定权限
     */
    private String resources;
    /**
     * 账号状态 1正常，2停用 ,3-离职
     */
    private Integer status;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
