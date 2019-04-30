package com.wangcl.test.learn;

import org.springframework.stereotype.Component;

@Component("small")
public class SmallWritingBrush extends WritingBrush {
    @Override
    public void write() {
        System.out.println("small write");
    }
}
