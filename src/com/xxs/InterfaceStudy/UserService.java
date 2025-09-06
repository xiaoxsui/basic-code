package com.xxs.InterfaceStudy;

public interface UserService {
    //接口中所有定义的方法都是抽象的public abstract
    public abstract void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
    //接口中定义的都是常量，使用public static final修饰
    public static final int AGE = 99;
}
