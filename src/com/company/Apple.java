package com.company;

public class Apple implements ChineseFactory{
    public Headphones createHeadphones() {
        return new AppleHeadphones();
    }
    public Phone createPhone() {
        return new ApplePhone();
    }
    public Tablet createTablets(){
        return new AppleTablet();
    }
}
