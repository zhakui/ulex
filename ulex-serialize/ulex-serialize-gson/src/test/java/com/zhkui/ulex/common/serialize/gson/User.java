package com.zhkui.ulex.common.serialize.gson;

public class User{
    public String name;
    public int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    } 

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }
}