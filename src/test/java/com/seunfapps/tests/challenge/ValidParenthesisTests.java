package com.seunfapps.tests.challenge;

import com.seunfapps.algos.challenges.ReverseWords;
import com.seunfapps.algos.challenges.ReverseWords2;
import com.seunfapps.algos.challenges.ValidParenthesis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ValidParenthesisTests {

    @Test
    public void shouldBeValid(){
        ValidParenthesis app = new ValidParenthesis();

        String input = "()[]{}";

        boolean result = app.isValid(input);


        Assertions.assertTrue(result);
    }

    @Test
    public void shouldBeInvalid(){
        ValidParenthesis app = new ValidParenthesis();

        String input = "()[]({}";

        boolean result = app.isValid(input);


        Assertions.assertFalse(result);
    }

}
