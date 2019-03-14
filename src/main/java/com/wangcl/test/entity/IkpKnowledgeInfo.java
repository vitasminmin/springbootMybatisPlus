package com.wangcl.test.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;



import com.baomidou.mybatisplus.annotations.Version;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 知识基本信息
 * </p>
 *
 * @author wangcl
 * @since 2019-03-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("IKP_KNOWLEDGE_INFO")
public class IkpKnowledgeInfo extends Model<IkpKnowledgeInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 知识编码
     */
    @TableId("ID_KNOWLEDGE")
    private String idKnowledge;

    /**
     * 关联问题id
     */
    @TableField("ID_IKP_QUESTION")
    private String idIkpQuestion;

    /**
     * 知识类别：1 标准 2 疑难
     */
    @TableField("KNOWLEDGE_TYPE")
    private String knowledgeType;

    /**
     * 标题
     */
    @TableField("TITLE")
    private String title;

    /**
     * 源知识id
     */
    @TableField("SOURCES")
    private String sources;

    /**
     * 更新描述
     */
    @TableField("DESCRIPTION")
    private String description;

    /**
     * 知识责任人
     */
    @TableField("AUDITOR")
    private String auditor;

    /**
     * 知识状态 0 正常 1待审批 2 退回 3 失效 4  已删除  5预生效
     */
    @TableField("STATUS")
    private String status;

    /**
     * 知识权限等级
     */
    @TableField("SECURITY_LEVEL")
    private String securityLevel;

    /**
     * 应用渠道
     */
    @TableField("TYPE")
    private String type;

    /**
     * 知识所有关联标签hash值
     */
    @TableField("LABELS_HASHCODE")
    private String labelsHashcode;

    /**
     * 创建者
     */
    @TableField("CREATOR")
    private String creator;

    /**
     * 知识初次创建时间
     */
    @TableField("CREATED_DATE")
    private Date createdDate;

    /**
     * 知识修改人
     */
    @TableField("MODIFY_USER")
    private String modifyUser;

    /**
     * 修改日期
     */
    @TableField("MODIFIED_DATE")
    @JsonFormat(pattern = "yy-MM-dd HH:mm:ss")
    private Date modifiedDate;

    /**
     * 创建人
     */
    @TableField("CREATED_BY")
    private String createdBy;

    /**
     * 创建时间
     */
    @TableField("DATE_CREATED")
    @JsonFormat(pattern = "yy-MM-dd HH:mm:ss")
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
    @JsonFormat(pattern = "yy-MM-dd HH:mm:ss")
    private Date dateUpdated;

    /**
     * 个性主题
     */
    @TableField("SUBJECT")
    private String subject;

    /**
     * 差异标签处理完成时间
     */
    @TableField("SUBJECT_DATE")
    @JsonFormat(pattern = "yy-MM-dd HH:mm:ss")
    private Date subjectDate;

    /**
     * 是否显示共性知识编号
     */
    @TableField("COM_SHOW")
    private String comShow;

    /**
     * 是否为批量更新：1，否、2，是
     */
    @TableField("BATCH_UPDATE")
    private String batchUpdate;

    /**
     * 知识有效时间
     */
    @TableField("DATA_VALIDITY")
    private Date dataValidity;

    /**
     * 校验修改
     */
    @TableField("VALID_UPDATE")
    private String validUpdate;

    /**
     * 是否可发送 1.不可发送;2.可发送
     */
    @TableField("IS_SEND")
    private String isSend;

    /**
     * 关联模板
     */
    @TableField("TEMP_ID")
    private String tempId;

    /**
     * 知识失效时间
     */
    @TableField("INVALID_DATE")
    private Date invalidDate;

    /**
     * 知识生效时间
     */
    @TableField("EFFECT_DATA")
    private Date effectData;

    /**
     * 知识分类：1、坐席知识，2、机器人知识，3、公共信息
     */
    @TableField("KNOWLEDGE_CLASSIFY")
    private String knowledgeClassify;

    /**
     * 版本号
     */
    @TableField("VERSION_ID")
    private Double versionId;

    /**
     * 知识摘要内容
     */
    @TableField("ABSTRACT_CONTENT")
    private String abstractContent;

    /**
     * 资料接收时间
     */
    @TableField("RECEIVE_DATE")
    private Date receiveDate;

    /**
     * 关联用户组ids
     */
    @TableField("USER_GROUPS")
    private String userGroups;

    /**
     * 子类型
     */
    @TableField("SUB_TYPE")
    private String subType;

    /**
     * 机器人知识，机器人类型
     */
    @TableField("ROBOT_KNOWLEDGE_TYPE")
    private String robotKnowledgeType;

    /**
     * 点击量
     */
    @TableField("HIT_COUNT")
    private Integer hitCount;

    /**
     * 关键字
     */
    @TableField("KEYWORD")
    private String keyword;

    /**
     * 知识关联发送模板
     */
    @TableField("SEND_TEMPLATE_ID")
    private String sendTemplateId;


    @Override
    protected Serializable pkVal() {
        return this.idKnowledge;
    }

}
