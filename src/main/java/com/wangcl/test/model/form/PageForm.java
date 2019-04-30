package com.wangcl.test.model.form;

import com.baomidou.mybatisplus.plugins.Page;

public class PageForm extends SuperForm {

    protected int current = 1;
    protected int size = 10;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Page toPage() {
        return new Page(current, size);
    }
}
