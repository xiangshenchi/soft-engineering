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

    private static int[] sub;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int maxSum = findMaxArray(nums);
        int[] subArray = SubArraySum.sub;
        System.out.println("最大子数组之和为：" + maxSum);
        System.out.println("对应子数组为：" + Arrays.toString(subArray));
    }

    public static int findMaxArray(int[] array){
        int start = 0; // 子数组起始位置
        int end = 0;   // 子数组结束位置
        int tempStart = 0; // 临时起始位置，用于更新start
        if (array == null || array.length == 0) {
            return 0;
        }
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (currentSum < 0) {
                tempStart = i;
                currentSum = array[i];
            }else {
                currentSum += array[i];
            }
            if (currentSum > maxSum) { // 当前和大于最大和，则更新最大和及子数组位置
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        int[] sub = Arrays.copyOfRange(array, start, end + 1);
        SubArraySum.sub = sub; // 将结果保存到类变量sub中
        return maxSum;
    }
}



//更优版：
/*package com.xsc.SE1;

        import org.junit.Test;

        import java.util.Arrays;
        import java.util.Scanner;

*//**
 * @author Shawn
 * @Title SubArraySum
 * @Package com.xsc.SE1
 * @Description: 找出一个整数数组中子数组之和的最大值
 * @date 2024/9/10-15:11
 *//*
public class SubArraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int maxSum = findMaxArray(nums);
            int[] sub = SubArraySum.sub;
            System.out.println("最大子数组之和为：" + maxSum);
            System.out.println("对应的子数组为：" + Arrays.toString(sub));
        } catch (Exception e) {
            System.out.println("输入格式错误，请重新输入！");
        } finally {
            sc.close(); // 关闭 Scanner 资源
        }
    }

    public static int findMaxArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("输入数组为空或为null");
            return Integer.MIN_VALUE;
        }

        int start = 0; // 子数组起始位置
        int end = 0;   // 子数组结束位置
        int tempStart = 0; // 临时起始位置，用于更新start
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (currentSum < 0) {
                tempStart = i;
                currentSum = array[i];
            } else {
                currentSum += array[i];
            }

            if (currentSum > maxSum) { // 当前和大于最大和，则更新最大和及子数组位置
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        int[] sub = Arrays.copyOfRange(array, start, end + 1);
        SubArraySum.sub = sub; // 将结果保存到类变量sub中
        return maxSum;
    }

    private static int[] sub; // 用于存储子数组
}*/
