package com.app.entity;

public class User {

    private String name;

    private Integer age;

    private Integer sex;

    private String account;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String name, Integer age, Integer sex, String account, String password) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.account = account;
        this.password = password;
    }
}
