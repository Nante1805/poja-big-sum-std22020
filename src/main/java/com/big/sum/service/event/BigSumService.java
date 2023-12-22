package com.big.sum.service.event;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class BigSumService {
    public BigInteger add(String a, String b) {
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        return bigA.add(bigB);
    }
}
