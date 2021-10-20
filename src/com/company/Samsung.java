package com.company;

public class Samsung implements ChineseFactory {
    public Headphones createHeadphones() {
        return new SamsungHeadphones();
    }
    public Phone createPhone() {
        return new SamsungPhone();
    }
    public Tablet createTablets(){
        return new SamsungTablet();
    }

}
