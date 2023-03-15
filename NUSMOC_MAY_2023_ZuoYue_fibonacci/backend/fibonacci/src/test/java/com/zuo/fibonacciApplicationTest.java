package com.zuo;
import com.zuo.dto.FibonacciResult;
import com.zuo.service.impl.FibonacciServiceImpl;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class fibonacciApplicationTest {

    @Test
    public void testGenerateFibonacciTwo() {
        FibonacciServiceImpl service = new FibonacciServiceImpl();
        FibonacciResult result = service.generateFibonacci(2);
        final BigInteger TWO = BigInteger.valueOf(2);

        // Check the length of the Fibonacci array
        assertEquals(2, result.getFibonacci().size());

        // Check the first few values of the Fibonacci array
        assertEquals(BigInteger.ZERO, result.getFibonacci().get(0));
        assertEquals(BigInteger.ONE, result.getFibonacci().get(1));

        // Check the length of the sorted array
        assertEquals(2, result.getSorted().size());

        // Check the first few values of the sorted array
        assertEquals(BigInteger.ZERO, result.getSorted().get(0));
        assertEquals(BigInteger.ONE, result.getSorted().get(1));

    }

    @Test
    public void testGenerateFibonacciTen() {
        FibonacciServiceImpl service = new FibonacciServiceImpl();
        FibonacciResult result = service.generateFibonacci(10);
        final BigInteger TWO = BigInteger.valueOf(2);

        // Check the length of the Fibonacci array
        assertEquals(10, result.getFibonacci().size());

        // Check the first few values of the Fibonacci array
        assertEquals(BigInteger.ZERO, result.getFibonacci().get(0));
        assertEquals(BigInteger.ONE, result.getFibonacci().get(1));
        assertEquals(BigInteger.ONE, result.getFibonacci().get(2));
        assertEquals(TWO, result.getFibonacci().get(3));
        assertEquals(BigInteger.valueOf(3), result.getFibonacci().get(4));

        // Check the length of the sorted array
        assertEquals(10, result.getSorted().size());

        // Check the first few values of the sorted array
        assertEquals(BigInteger.valueOf(34), result.getSorted().get(0));
        assertEquals(BigInteger.valueOf(8), result.getSorted().get(1));
        assertEquals(BigInteger.valueOf(2), result.getSorted().get(2));
        assertEquals(BigInteger.valueOf(0), result.getSorted().get(3));
        assertEquals(BigInteger.valueOf(21), result.getSorted().get(4));
    }

    @Test
    public void testGenerateFibonacciBig() {
        FibonacciServiceImpl service = new FibonacciServiceImpl();
        FibonacciResult result = service.generateFibonacci(90);
        final BigInteger TWO = BigInteger.valueOf(2);

        // Check the length of the Fibonacci array
        assertEquals(90, result.getFibonacci().size());

        // Check the first few values of the Fibonacci array
        assertEquals(BigInteger.ZERO, result.getFibonacci().get(0));
        assertEquals(BigInteger.ONE, result.getFibonacci().get(1));
        assertEquals(BigInteger.ONE, result.getFibonacci().get(2));
        assertEquals(TWO, result.getFibonacci().get(3));
        assertEquals(BigInteger.valueOf(3), result.getFibonacci().get(4));

        // Check the length of the sorted array
        assertEquals(90, result.getSorted().size());

        // Check the first few values of the sorted array
        assertEquals(BigInteger.valueOf(679891637638612258L), result.getSorted().get(0));
        assertEquals(BigInteger.valueOf(160500643816367088L), result.getSorted().get(1));
        assertEquals(BigInteger.valueOf(37889062373143906L), result.getSorted().get(2));
        assertEquals(BigInteger.valueOf(8944394323791464L), result.getSorted().get(3));
        assertEquals(BigInteger.valueOf(2111485077978050L), result.getSorted().get(4));
    }
}

