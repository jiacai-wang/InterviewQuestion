package onlineWrittenTest.Test360;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 题目描述：
 * 小红有两个长度为n的排列A和B。每个排列由[1,n]数组成，且里面的数字都是不同的。
 *
 * 现在要找到一个新的序列C，要求这个新序列中任意两个位置(i,j)满足:
 *
 * 如果在A数组中C[i]这个数在C[j]的后面，那么在B数组中需要C[i]这个数在C[j]的前面。
 *
 * 请问C序列的长度最长为多少呢？
 *
 * 输入
 * 第一行一个整数，表示N。
 *
 * 第二行N个整数，表示A序列。
 *
 * 第三行N个整数，表示B序列。
 *
 * 满足:N<=50000
 *
 * 输出
 * 输出最大的长度
 *
 *
 * 样例输入
 * 5
 * 1 2 4 3 5
 * 5 2 3 4 1
 * 样例输出
 * 2
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }

        System.out.println(lengthOfC(a,b));
    }

    public static int lengthOfC (int []a,int[]b){
        ArrayList c = new ArrayList();




        return c.size();
    }
}