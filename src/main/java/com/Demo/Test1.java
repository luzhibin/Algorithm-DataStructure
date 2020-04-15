package com.Demo;

import org.junit.jupiter.api.Test;

/**
 * Created by luzhibin on 2020/4/15 17:26
 */
public class Test1 {
    public static void main(String[] args) {
    }

    @Test
    public void method1(){
        boolean b = true;
        //遍历100以内的自然数
        for (int i = 2;i<=100;i++){
            //j：被i除
            for (int j=2;j<i;j++){
                if (i % j == 0){    //%是求模运算，即2%10=2，10%2=0，10%3=1。
                    b = false;
                }
            }
            if (b){
                System.out.print(i+" ");
            }
            b = true;
        }
    }
}
