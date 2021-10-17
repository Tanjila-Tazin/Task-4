package Tanjila;
import java.math.BigInteger;

 class MyCalculator implements AdvancedArithmetic{

     @Override
     public int divisorSum() {
         int sum = 0;
         for (int i = 1; i <= n ; i++ ){
             if(n%i==0){
                 sum = sum + i;
             }
         }
         return sum;
     }

     @Override
     public void findFctorial() {
         BigInteger factorial = BigInteger.valueOf(1);
         for (int j = 1; j <= n ; j++ ){
             factorial = factorial.multiply(BigInteger.valueOf(j));
         }
         System.out.println("Factorial = " + factorial);
     }

     }
