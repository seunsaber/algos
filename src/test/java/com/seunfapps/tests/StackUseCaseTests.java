package com.seunfapps.tests;

import com.seunfapps.algos.examples.StackUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StackUseCaseTests {

    @Test
    public void shouldReverse(){
        StackUseCase stackUseCaseTest = new StackUseCase();
        String reversed = stackUseCaseTest.reverse("oluwaseun");
        Assertions.assertEquals("nuesawulo", reversed);
    }

    @Test
    public void shouldReturnTrueForValidateExpression(){
        StackUseCase stackUseCaseTest = new StackUseCase();
        boolean valid = stackUseCaseTest.isBalanced("(1 + 1) * [30 - 12]");
        Assertions.assertEquals(true, valid);
    }

    @Test
    public void shouldReturnFalseForValidateExpression(){
        StackUseCase stackUseCaseTest = new StackUseCase();
        boolean valid = stackUseCaseTest.isBalanced("( 1 + 1 + ]");
        Assertions.assertEquals(false, valid);
    }





}
