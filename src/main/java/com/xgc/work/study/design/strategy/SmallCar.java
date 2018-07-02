package com.xgc.work.study.design.strategy;

/**
 *  具体策略实现子类
 *
 * Created by xiegaochun on 2018/6/20.
 */
public class SmallCar  extends Car {

    public SmallCar(String name, String color) {
        super(name, color);
    }

    public void run() {
        System.out.println(color +" " + name  +"在高速的行驶。。。");
    }
}
