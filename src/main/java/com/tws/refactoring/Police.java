package com.tws.refactoring;

public class Police {
    public boolean checkDriver(Driver driver) {
        int maxAge = 18;
        return driver.getAge() >= maxAge;
//        if(driver.age >= 18) return true;
//        else return false;
    }
}
