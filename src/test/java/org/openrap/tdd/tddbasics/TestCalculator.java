package org.openrap.tdd.tddbasics;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void testCalculatorAdd() {
        Calculator calc = new Calculator();

        calc.add(5);
        int sum = calc.getValue();
        Assert.assertEquals("Value must be 5", 5, sum);
    }

    @Test
    public void testCalculatorAddNoSideEffects() {
        Assert.assertEquals("Value must be 5", 5, Calculator.addNoSideEffected(0, 5));
        Assert.assertEquals("Value must be 10", 10, Calculator.addNoSideEffected(0, 10));
        Assert.assertEquals("Value must be 0", 0, Calculator.addNoSideEffected(0, 0));
    }

    @Test
    public void testCalculatorAddNegativeNumber() {
        Calculator calc = new Calculator();

        try {
            calc.add(-5);
            Assert.fail("Adding negative numbers should not be allowed");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testCalculatorSubtract() {
        Calculator calc = new Calculator();

        calc.subtract(5);
        int sum = calc.getValue();
        Assert.assertEquals("Value must be -5", -5, sum);
    }

    @Test
    public void testCalculatorSubtractNoSideEffects() {
        Assert.assertEquals("Value must be -5", -5, Calculator.subtractNoSideEffected(0, 5));
        Assert.assertEquals("Value must be -10", -10, Calculator.subtractNoSideEffected(0, 10));
        Assert.assertEquals("Value must be 0", 0, Calculator.subtractNoSideEffected(0, 0));
    }

    @Test
    public void testCalculatorSubtractNegativeNumber() {
        Calculator calc = new Calculator();

        try {
            calc.subtract(-5);
            Assert.fail("Subtracting negative numbers should not be allowed");
        } catch (IllegalArgumentException expected) {
        }
    }
}
