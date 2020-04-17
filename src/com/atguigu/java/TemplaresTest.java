package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author 杨晨
 * @create 2020-04-16 8:50
 */
public class TemplaresTest {
    //    常用模板
    //    6.private static final   prsf
    //      public static final  psf
    //      public static final int psfi
    //      public static final String psfs
    //private static final Customer  CUST = new Customer();
    //    1.main方法    psvm
    public static void main(String[] args) {
        //2.输出    sout   hhhhh输出函数只能在方法里用哈哈哈哈
        System.out.println();
        //变形：soutp:打印形参  soutm:打印方法名 soutv xxx.sout
        int num1 = 10;
        System.out.println("num1 = " + num1);   //soutv
        System.out.println(num1);  //num1.sout
        //3.for循环    fori==itar
        String[] arr = new String[]{"Tom","Jerry","HanMeimei"};
        for (int i = 0; i < ; i++) {    //fori
            System.out.println(arr[i]);
        }
        //变形：iter  增强for循环
        for (String s : arr) {
            System.out.println(arr[i]);
        }
        //4.集合遍历   list.for   list.fori  list.forr:逆序遍历
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(13);
        list.add(23);
        for (Object o : list) {

        }
        //5.判断空  ifn
        if (list == null) {

        }
        //变形：判断不为空   inn
        if (list != null) {

        }


    }




}
