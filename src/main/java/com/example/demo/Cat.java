package com.example.demo;

public class Cat extends Adopt{
    private int ill;
    private boolean sterilize;

    public Cat(String name,String sort,String sex,int age,int health,int ill,boolean sterilize){
        super(name,sort,sex,age,health);
        this.ill=ill;
        this.sterilize=sterilize;
    }

    public int getIll() {
        return ill;
    }
    public void setill(int ill){
        this.ill=ill;
    }
    public boolean  getsterilize(){
        return sterilize;
    }
    public void setSterilize(boolean sterilize) {
        this.sterilize = sterilize;
    }

    @Override
    public void select() {
        super.select();
        System.out.println("生病程度："+ill+" 是否绝育："+sterilize);
    }

}
