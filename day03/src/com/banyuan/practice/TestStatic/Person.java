package com.banyuan.practice.TestStatic;

/**
 * @Auther: 张伟
 * @Date: 2019/10/24
 * @Description: com.banyuan.practice.TestStatic
 * @version: 1.0
 */
public class Person {
    private String name;
    private int age;
    private String adress;
    public static String country="中国";

    public Person() {
    }
    public Person(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                '}';
    }

}
