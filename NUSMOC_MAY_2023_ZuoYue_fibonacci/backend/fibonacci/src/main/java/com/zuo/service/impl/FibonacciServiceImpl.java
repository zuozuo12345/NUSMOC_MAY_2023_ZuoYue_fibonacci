package com.zuo.service.impl;



import com.zuo.dto.FibonacciResult;
import com.zuo.service.IFibonacciService;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FibonacciServiceImpl implements IFibonacciService {
    private  static final BigInteger TWO = BigInteger.valueOf(2);
    @Override
    public FibonacciResult generateFibonacci(int n) {
        List<BigInteger> fibonacciArray = new ArrayList<>(n);
        List<BigInteger> sortedArray = new ArrayList<>(n);
        List<BigInteger> evenNumbers = new ArrayList<>(n/2);
        List<BigInteger> oddNumbers = new ArrayList<>(n/2);


        fibonacciArray.add(BigInteger.ZERO);
        evenNumbers.add(BigInteger.ZERO);


        if (n >= 2)
        {
            fibonacciArray.add(BigInteger.ONE);
            oddNumbers.add(BigInteger.ONE);
        }


        for (int i = 2; i < n; i++) {
            BigInteger num = fibonacciArray.get(i - 1).add(fibonacciArray.get(i - 2));
            fibonacciArray.add(num);
            if (num.mod(TWO).intValue() ==0) {
                evenNumbers.add(num);
            } else {
                oddNumbers.add(num);
            }
        }




        evenNumbers.sort(Comparator.reverseOrder());
        oddNumbers.sort(Comparator.reverseOrder());

        sortedArray.addAll(evenNumbers);
        sortedArray.addAll(oddNumbers);

        return new FibonacciResult(fibonacciArray, sortedArray);
    }

}
