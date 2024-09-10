package com.xsc.SE1;

/**
 * @author Shawn
 * @Title PrimeNum
 * @Package com.xsc.SE1
 * @Description: 输出1~20000内的所有素数，按每行5个打印出来，并分析程序中最费时的函数是什么， 如何改进？
 * @date 2024/9/10-20:27
 */
public class PrimeNum {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 20000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
