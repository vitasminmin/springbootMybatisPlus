package com.wangcl.test.learn;

public abstract class WritingBrush {
    private Pigment pigment;

    public Pigment getPigment() {
        return pigment;
    }

    public void setPigment(Pigment pigment) {
        this.pigment = pigment;
    }

    public abstract void write();

    public void writeWithPigment(){
        pigment.printColor();
        write();
    }

 }
