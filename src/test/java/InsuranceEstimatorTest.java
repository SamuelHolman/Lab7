/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Locke
 */
public class InsuranceEstimatorTest {
    
    public InsuranceEstimatorTest() {
    }
    
    @org.junit.jupiter.api.Test
    public void testCalculateLifeInsurance2() throws Exception {
        System.out.println("calculateLifeInsurance");
        int age = 10;
        double expResult = 350.0;
        double result = InsuranceEstimator.calculateLifeInsurance(age);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testThatExceptionThrown() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            InsuranceEstimator.calculateLifeInsurance(4);
        });
    }
    @Test
    public void testThatExceptionThrown2() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            InsuranceEstimator.calculateLifeInsurance(111);
        });
    }
}
