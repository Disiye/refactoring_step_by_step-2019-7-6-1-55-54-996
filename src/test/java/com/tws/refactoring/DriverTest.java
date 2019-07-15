package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DriverTest {

    @Test
    public void return_driver_age_is_18_when_age_is_18() {
        //given
        int age = 18;

        //when
        Driver driver = new Driver(age);

        //then
        Assertions.assertEquals(age, driver.getAge());
    }
}
