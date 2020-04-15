package com.Array;

/**
 * Created by luzhibin on 2020/4/15 12:17
 */

/** 练习-二维数组
 *  定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
 *  找出这个二维数组里，最大的那个值，并打印出其二维坐标
 */
public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] array = new int[5][5];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j] = (int) (Math.random()*100);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("二维数组中的最大值为：");
        int max = array[0][0];
        int iMax = 0;
        int jMax = 0;
        for (int i=1;i<array.length;i++){
            for (int j=1;j<array[i].length;j++){
                if (max<array[i][j]){
                    max = array[i][j];
                    iMax = i;
                    jMax = j;
                }
            }
        }
        System.out.println(max);
        System.out.println("二维坐标为：["+iMax+"]["+jMax+"]");
    }
}
