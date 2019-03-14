package com.wangcl.test.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.wangcl.test.entity.IkpKnowledgeInfo;
import com.wangcl.test.service.IIkpKnowledgeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 知识基本信息 前端控制器
 * </p>
 *
 * @author wangcl
 * @since 2019-03-10
 */
@RestController
@RequestMapping("/test/ikpKnowledgeInfo")
public class IkpKnowledgeInfoController {
    @Autowired
    IIkpKnowledgeInfoService knowledgeService;

    @ResponseBody
    @RequestMapping("/page")
    public Object knowledgePage() {
        return knowledgeService.selectPage(new Page<>(1, 5));
    }

    @ResponseBody
    @RequestMapping("/pageCondition")
    public Object pageCondition() {
        EntityWrapper<IkpKnowledgeInfo> con = new EntityWrapper<IkpKnowledgeInfo>();

        con.setEntity(new IkpKnowledgeInfo());
        con.like("title","坐席");
        return knowledgeService.selectPage(new Page<>(1, 5), con);
    }
}
