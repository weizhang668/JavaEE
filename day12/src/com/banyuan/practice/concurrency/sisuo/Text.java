package com.banyuan.practice.concurrency.sisuo;

/**
 * @Auther: 张伟
 * @Date: 2019/11/6
 * @Description: com.banyuan.practice.concurrency.sisuo
 * @version: 1.0
 */
public class Text {
    public static void main(String[] args) {
        DeaA deaA=new DeaA();
        DeaB deaB=new DeaB();
        deaA.start();
        deaB.start();
    }
}
