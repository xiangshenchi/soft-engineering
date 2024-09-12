package com.xsc.SE1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Shawn
 * @Title SubArraySum
 * @Package com.xsc.SE1
 * @Description: 找出一个整数数组中子数组之和的最大值
 * @date 2024/9/10-15:11
 */
public class SubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int maxSum = nums[0];
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = Math.max(sum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println("最大子数组之和为：" + maxSum);
    }
}

