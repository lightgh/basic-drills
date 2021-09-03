package com.chinakalight.java8drills;

public class BoxPrinter<T> {
    private T val;
    public BoxPrinter(T args){
        val = args;
    }

    public String toString(){
        return "[" + val + "]";
    }
}

class OutPrinter<T, U, K, J> {
    private T val1;
    private U val2;
    private K val3;
    private J val4;

    public OutPrinter(T val1, U val2, K val3, J val4){

    }

    public String toString(){
        return "";
    }
}

class BoxPrinterTest {
    public static void main(String[] args) {
        BoxPrinter<Integer> value1 = new BoxPrinter<>(new Integer(10));
        BoxPrinter<Integer> value2 = new BoxPrinter<>(Integer.valueOf(12));

        System.out.println(value1 + " " + value2);
    }
}
