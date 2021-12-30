package com.seunfapps.tests.challenge;

import com.seunfapps.algos.challenges.StringToIntegerAtoI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StringToIntegerAtoITests {

    @Test
    public void runTest(){
        StringToIntegerAtoI app = new StringToIntegerAtoI();

        //String input = "4123";
        //String input = "000004123";
        //String input = "    -4123";
        String input = "-91283472332";

        int result = app.myAtoi(input);

        Assertions.assertEquals(-2147483647, result);
    }
}
