package com.example.demo;


public class Adopt {
    private String sex;
    private int age;
    private String sort;
    private int health;
    private String name;

    public Adopt( String name,String sort ,String sex,int age, int health) {
        this.name = name;
        this.sort = sort;
        this.sex = sex;
        this.age = age;
        this.health = health;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getsex(){
        return sex;
    }

    public void setsex(String sex){
        this.sex=sex;
    }


    public void select(){;
        System.out.println("名字： "+name+" 品种："+sort+" 性别："+sex+" 年龄："+age+" 健康值："+health);
    }
}
