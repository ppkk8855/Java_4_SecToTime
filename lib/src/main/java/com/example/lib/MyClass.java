package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args){
        System.out.println("請輸入秒數：");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int second=0;
        int minute=0;
        int hour=0;
        second=num%60;
        num=num-second;
        if(num>0){
            minute=num%3600/60;
            num=num-minute*60;
            if(num>0){
                hour=num/3600;

            }
        }
        System.out.println(hour+":"+minute+":"+second);



    }
}

