package com.wangcl.test.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.wangcl.test.model.form.PageForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class SuperController<M extends IService<T>, T> {
    @Autowired
    protected M service;

    public SuperController() {

    }

    @ResponseBody
    @RequestMapping("/search/{id}")
    public final T searchById(@PathVariable String id) {
        EntityWrapper<T> wrapper = new EntityWrapper();
        wrapper.eq("id", id);
        return service.selectOne(wrapper);
    }

    @ResponseBody
    @RequestMapping("/dataList")
    public final List<T> dataList() {
        return service.selectList(null);
    }

    @ResponseBody
    @RequestMapping("/pageList")
    public final Page<T> pageList(PageForm form) {
        return service.selectPage(form.toPage());
    }

    @ResponseBody
    @RequestMapping("/remove")
    public final boolean remove(List<String> idList) {
        return service.deleteBatchIds(idList);
    }

    @ResponseBody
    @RequestMapping("/addOrUpdate")
    public final boolean addOrUpdate(List<T> dataList) {
        return service.insertOrUpdateBatch(dataList);
    }
}
