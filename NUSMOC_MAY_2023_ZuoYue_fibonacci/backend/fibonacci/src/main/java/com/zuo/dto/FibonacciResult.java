package com.zuo.dto;

import java.math.BigInteger;
import java.util.List;

public class FibonacciResult {

    public List<BigInteger> fibonacci;
    public List<BigInteger> sorted;


    public FibonacciResult(List<BigInteger> fibonacci, List<BigInteger> sorted) {
        this.fibonacci = fibonacci;
        this.sorted = sorted;
    }

    public List<BigInteger> getFibonacci() {
        return fibonacci;
    }

    public void setFibonacci(List<BigInteger> fibonacci) {
        this.fibonacci = fibonacci;
    }

    public List<BigInteger> getSorted() {
        return sorted;
    }

    public void setSorted(List<BigInteger> sorted) {
        this.sorted = sorted;
    }
}
