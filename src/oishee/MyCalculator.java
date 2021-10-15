package oishee;

/*
Name- Sumaiya Tasnim Oishee
Id- 2012020161
Section- 53(D)
Email - cse_2012020161@lus.ac.bd
Date- 15-10-2021
 */




import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {

        int i, total = 0;

        for (i=1; i<=n; i++)
        {
            //remainder = i%n;
            if(n%i==0)
            {
                total = i+total;
            }
        }

        return total;
    }

    @Override
    public BigInteger findFactorial(int N) {

        BigInteger result = BigInteger.ONE;

        for (int i=1; i<=N; i++)
        {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
