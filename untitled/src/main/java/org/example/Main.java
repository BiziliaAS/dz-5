package org.example;

public class Main {
    public static void main(String[] args) {

        int int1 = 10;
        int int2 = 28;
        int int3 = 65;
        int int4 = 57;

        int intresult12 = int1 + int2;
        int intresult34 = int3 + int4;

        boolean isFirstSumLess = intresult12 < intresult34;
        System.out.println(isFirstSumLess);

        intresult12++;
        intresult34 -= 2;
        boolean secsumcom = intresult12 > intresult34;
        System.out.println(secsumcom);

        if (intresult12 % 2 == 0 || intresult34 % 2 == 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}