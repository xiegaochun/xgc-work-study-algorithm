package com.xgc.work.study.design.template;

/**
 * Created by xiegaochun on 2018/6/20.
 */
public class Test {
    public static void main(String[] args) {
        DrinkTemplate coffee=new MakeCoffee();
        coffee.DrinkTemplate();
        System.out.println("*******************************");
        DrinkTemplate milkTea=new MakeMilkTea();
        milkTea.DrinkTemplate();
    }
}
