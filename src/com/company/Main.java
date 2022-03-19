package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RSA per1 = new RSA();
        RSA per2 = new RSA();
        per1.initialize();
        per2.initialize();
        BigInteger mes = new BigInteger("121232");
        BigInteger cip = per1.enercrypt(mes,per2.getN());
        BigInteger de = per2.decrypt(cip);
        System.out.println(mes);
        System.out.println(de);
    }
}
