package com.poja.prime.endpoint.event.gen;


import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigInteger;
import java.util.Random;

public class PojaPrime {

    public static BigInteger generateNewPrime() {
        return  BigInteger.probablePrime(10000, new Random());
    }

}
