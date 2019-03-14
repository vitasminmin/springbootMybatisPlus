package com.wangcl.test.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;



import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author wangcl
 * @since 2019-03-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Users extends Model<Users> {

    private static final long serialVersionUID = 1L;

    /**
     * id.
     */
    @TableId("ID")
    private String id;

    /**
     * 用户名
     */
    @TableField("USER_ID")
    private String userId;

    /**
     * 密码
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * 邮箱
     */
    @TableField("EMAIL")
    private String email;

    /**
     * 手机号
     */
    @TableField("MOBILE")
    private String mobile;

    /**
     * 姓名
     */
    @TableField("NAME")
    private String name;

    /**
     * 创建人
     */
    @TableField("CREATED_BY")
    private String createdBy;

    /**
     * 创建时间
     */
    @TableField("DATE_CREATED")
    private Date dateCreated;

    /**
     * 更新人
     */
    @TableField("UPDATED_BY")
    private String updatedBy;

    /**
     * 更新时间
     */
    @TableField("DATE_UPDATED")
    private Date dateUpdated;

    /**
     * 0:正常;1:锁定;2:删除
     */
    @TableField("STATUS")
    private String status;

    /**
     * 用户类型，默认普通用户
     */
    @TableField("ORG_ID")
    private String orgId;

    @TableField("USER_TYPE")
    private String userType;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
