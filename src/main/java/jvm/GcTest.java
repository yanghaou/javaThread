package jvm;

/**
 * function
 * Author: yang.hao
 * Date: 2016/11/26
 */
public class GcTest {
    private static final int _1MB = 1024*1024;

    public static void main(String args[]){
        byte [] a1,a2,a3;
        a1 = new byte[_1MB/4];
        a2 = new byte[3*_1MB];
        a3 = new byte[3*_1MB];
        a3 = null;
        a3 = new byte[3*_1MB];
    }
}
