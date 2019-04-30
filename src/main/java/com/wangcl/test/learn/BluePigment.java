package com.wangcl.test.learn;

import org.springframework.stereotype.Component;

@Component("blue")
public class BluePigment implements Pigment {
    @Override
    public void printColor() {
        System.out.println("blue");
    }
}
