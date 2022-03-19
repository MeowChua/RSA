package com.company;
import java.math.BigInteger;
import java.util.Random;

public class RSA {
    public static final int VERSION = 1024;
    public static final BigInteger E = new BigInteger("6537");
    private BigInteger p;
    private BigInteger q;
    private BigInteger n;// chia khoa cong khai
    private BigInteger phiN;// khoa cong khai
    private BigInteger d;// khoa bi mat
    public void initialize(){
        p=BigInteger.probablePrime(VERSION/2,new Random());// tạo random 1 snt bang version/2
        q=BigInteger.probablePrime(VERSION/2,new Random());
        n=p.multiply(q);// n = p*q
        phiN=p.subtract(BigInteger.ONE).multiply( q.subtract(BigInteger.ONE) );// phiN = ( p-1)*(q-1)
        d=E.modInverse(phiN);
    }

    public BigInteger enercrypt(BigInteger mes, BigInteger per){
       return  mes.modPow(E,per);
    }
    public BigInteger decrypt(BigInteger cip){
        return cip.modPow(d,n);
    }
    public BigInteger getN(){
        return n;
    }
}
