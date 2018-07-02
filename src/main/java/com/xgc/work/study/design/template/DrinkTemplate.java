package com.xgc.work.study.design.template;

/**
 * 们可以抽象化的想象下饮料在机器里的制作过程（这里只是简单举例，别钻牛角尖哈）
 * 大致我们可以分成4个步骤
 * ①烧水　　②冲泡饮料　　③把饮料倒入杯中　　④加入调料
 * 例如：
 *
 * 咖啡：烧开热水-->加入咖啡粉冲泡-->把饮料倒入杯中-->加入少许糖
 * 奶茶：烧开热水-->加入奶茶粉冲泡-->把饮料加入杯中-->加入椰果/珍珠
 *
 * 不难发现，饮料制作过程中的步骤中的①烧水、③把饮料倒入杯中是重复工作，制泡哪种饮料都一样，那么也就是重复工作，我们可以把它设定为通用性操作。
 * 我们只需要去关心步骤②和步骤④即可
 * 由于制泡饮料的步骤就是这4步，所以我们可以把它抽象成一个"制作饮料模板"出来，下面就以上面这个例子，我用代码来说明
 *
 * DrinkTemplate.java(模板类)
 *
 * 这是一个制作饮料的模板类，也就是制作所有饮料的基类
 * 我们可以把这4个步骤封装到一个模板方法里，并实现里面的通用步骤
 *
 * 由于避免继承它的子类去修改整体制作架构，所以这个方法用了final修饰符来修饰，好比著名的"好莱坞原则":Don't call us, we'll call you 子类需要听从父类的安排
 * 由于步骤②和步骤④需要根据具体制泡的饮料来确定，所以需要延迟到子类去实现，这里采用了protected修饰符以便子类可以复写，其他方法就可以直接写"死"掉，用private修饰符修饰，这样的使得代码工作人员能够更加关注自身的工作，而不必去考虑一些其他因素。
 * 这是一个制作饮料的模板类，也就是制作所有饮料的基类
 *
 * Created by xiegaochun on 2018/6/20.
 */
public abstract class DrinkTemplate {

    /**抽象基类
     *
     * 制作饮料方法模板
     * 4个步骤    1、烧水 2、冲泡饮料 3、把饮料倒入杯中 4、加调料
     * 由于步骤1、3是通用的步骤，适合于制作任何饮料，所以可以把它写死
     * 2和4步骤，针对不同的饮料有不同的选择，所以可以把它延迟到子类去复写实现（注意访问修饰符）
     */
    public final void DrinkTemplate(){
        boilWater();//烧水
        brew();//冲泡饮料
        pourInCup();//把饮料倒入杯中
//        addCondiments();//加调料
        if(condition()==true){//若条件允许，则加入调料，默认允许
            addCondiments();//加调料
        }
    }

    protected boolean condition() {
        return true;
    }


    protected abstract void addCondiments();//加调料，由于饮料所加调料各不相同，所以可以延迟到子类实现

    private void pourInCup() {
        System.out.println(">>>>>>>>--3-----pourInCup 把饮料倒入杯中...【重复工作，我们可以把它设定为通用性操作。】");
    }

    protected abstract void brew();//冲泡饮料 ，由于饮料所用的材料各不相同，所以可以延迟到子类实现

    private void boilWater() {
        System.out.println(">>>>>>>>--1-----烧水步骤进行中...【重复工作，我们可以把它设定为通用性操作。】");
    }

}