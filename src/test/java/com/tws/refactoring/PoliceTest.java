package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PoliceTest {
    @Test
    public void return_true_when_age_is_18() {
        //Given
        Driver driver = new Driver(18);
        Police police = new Police();

        //When
        boolean checkDriver = police.checkDriver(driver);

        //Then
        Assertions.assertEquals(true, checkDriver);
    }
}
