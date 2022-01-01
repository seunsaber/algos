package com.seunfapps.tests.challenge;

import com.seunfapps.algos.challenges.MaxConsecutiveOnes;
import com.seunfapps.algos.challenges.ValidParenthesis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FindMaxConsecutiveOnes {

    @Test
    public void runTest(){
        MaxConsecutiveOnes app = new MaxConsecutiveOnes();

        int [] input = new int [] {1,1,0,0,1,1,1};

        int result = app.findMaxConsecutiveOnes(input);


        Assertions.assertEquals(3, result);
    }
}
