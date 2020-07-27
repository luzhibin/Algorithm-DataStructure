package com.Array;

/** 使用二维数组打印一个 10 行的杨辉三角
 *  【提示】
 *  1.第一行有1个元素，第n行有n个元素
 *  2.每一行的第一个元素和最后一个元素都是1
 *  3.从第三行开始，对于非第一个元素和最后一个元素的元素，满足：
 *     yanghui[][] = yanghui[i-1][j-1]+yanghui[i-1][j]
 */
public class YangHuiTest {

    public static void main(String[] args) {
        //1.声明并初始化二维数组
        int[][] yangHui = new int[10][];
        //2.给数组的元素赋值
        for(int i = 0;i<yangHui.length;i++){
            yangHui[i] = new int[i+1];
            //给首末元素赋值
            yangHui[i][0] = yangHui[i][i] = 1;
            //给每行的非首末元素赋值
            //从第二个元素开始，到倒数第二个元素结束
            for (int j = 1;j<yangHui[i].length-1;j++){
                yangHui[i][j] = yangHui[i-1][j-1]+yangHui[i-1][j];
            }
        }

        //遍历
        for (int i = 0;i<yangHui.length;i++){
            for (int j = 0;j<yangHui[i].length;j++){
                System.out.print(yangHui[i][j]+" ");
            }
            System.out.println();
        }
    }
}
