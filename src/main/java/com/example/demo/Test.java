package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        ArrayList<Adopt> list =new ArrayList<>();
        list.add(new Cat("小龙","英短","妹妹",3,73,5,true));
        list.add(new Cat("lina","金渐层","妹妹",1,93,2,true));
        list.add(new Dog("摆摆","土松","弟弟",5,89,false,true));
        list.add(new Dog("多多","土狗","妹妹",1,93,false,false));

        System.out.println("欢迎来到东西领养家园！请问你想养一只小狗狗还是一只小猫咪呀？");
        Scanner in=new Scanner(System.in);
        String flag=in.nextLine();

        switch (flag){
            case "猫":
                System.out.println("----待领养猫猫信息----");
                for(Adopt a:list){
                    if (a instanceof Cat) {
                        Cat c=(Cat)a;
                        c.select();
                    }
                }
                break;
            case "狗":
                System.out.println("----待领养狗狗信息----");
                for(Adopt a:list){
                    if (a instanceof Dog) {
                        Dog d=(Dog)a;
                        d.select();
                    }
                }
                break;
            default:
                System.out.println("根本没有这种选项！");
                break;
        }
        System.out.println("请问你想带哪一只小动物回家呀？");
        String gohome= in.nextLine();
        System.out.println("好的！请留下您的联系方式，随后我们工作人员会和您沟通的~");
}
}
