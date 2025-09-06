package com.xxs.InterfaceStudy;
//抽象类：extends~，只能一对一继承
//类可以通过：implements 接口 来实现接口,而且可以多继承
//实现了接口的类，就需要重写接口中的方法
public class UserServiceImpl implements UserService,TimeService {
    @Override
    public void add(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }

    @Override
    public void timer() {

    }
}
