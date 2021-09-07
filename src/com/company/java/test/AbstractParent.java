package com.company.java.test;
//abstract class's getInstance method works by creating instance of subclass
public abstract class AbstractParent {
    public static AbstractParent getInstance() {
        return new AbstractChild();
    }

    public abstract void sayHello();
}
class AbstractChild extends AbstractParent{
    @Override
    public void sayHello(){
        System.out.println("hello, subclass instance of abstract class ");
    }
}
