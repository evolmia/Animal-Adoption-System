package com.example.demo;

public class Dog extends Adopt{
    private boolean biting;
    private boolean blood;

    public Dog (String name,String sort,String sex,int age,int health,boolean biting,boolean blood){
        super(name,sort,sex,age,health);
        this.biting=biting;
        this.blood=blood;
    }
    public boolean getbiting(){
        return biting;
    }
    public void setbiting(boolean biting){
        this.biting=biting;
    }
    public boolean getblood(){
        return blood;
    }
    public void setblood(boolean blood){
        this.blood=blood;
    }

    @Override
    public void select() {
        super.select();
        System.out.println("是否为纯种血统："+blood+" 是否有咬人史： "+biting);
    }


}
