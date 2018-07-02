package com.xgc.work.study.design.template;

/**
 * 冲泡咖啡类 ，继承了抽象基类，并复写了它的抽象方法
 * Created by xiegaochun on 2018/6/20.
 */
public class MakeCoffee extends DrinkTemplate {


    protected void addCondiments() {
        System.out.println(">>>>>>>>--4-----加糖...");
    }

    protected void brew() {
        System.out.println(">>>>>>>>--2-----加入咖啡粉冲泡...");
    }

    @Override
    protected boolean condition() {
        return false;
    }
}
