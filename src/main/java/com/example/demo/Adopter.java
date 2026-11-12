package com.example.demo;

public class Adopter {
    private String name;
    private String phone;

    // 无参构造（框架接收数据必须要）
    public Adopter() {}

    // 全参构造
    public Adopter(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // 用 Alt+Insert 生成 get 和 set 方法
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
