package com.xgc.work.study.design.template;

/**
 * Created by xiegaochun on 2018/6/20.
 */
public class MakeMilkTea extends DrinkTemplate{
    protected void addCondiments() {
        System.out.println(">>>>>>>>--4-----加椰果...");
    }

    protected void brew() {
        System.out.println(">>>>>>>>--2-----加入奶茶粉冲泡...");
    }
}
