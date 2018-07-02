package com.xgc.work.study.design.strategy;

/**
 * Created by xiegaochun on 2018/6/20.
 */
public class Test {
    public static void main(String[] args) {
        Car smallCar = new SmallCar("路虎","黑色");
        Car bussCar = new BussCar("公交车","白色");
        Person p1 = new Person("小明", 20);
        p1.driver(smallCar);
        p1.driver(bussCar);
    }
}
