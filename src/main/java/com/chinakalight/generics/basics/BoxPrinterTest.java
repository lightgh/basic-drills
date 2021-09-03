package com.chinakalight.generics.basics;

public class BoxPrinterTest {
    public static void main(String [] args){
        BoxPrinter<Integer> val1 = new BoxPrinter<Integer>(new Integer(10));
        System.out.println(val1);


        BoxPrinter<String> val2 = new BoxPrinter<String>("Simple Hello World");
        System.out.println(val2);

        BoxPrinter<SimplePerson> simpPerson = new BoxPrinter<SimplePerson>(new SimplePerson("Angelina", 34));

        System.out.println(simpPerson);

    }
}

class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T arg){
        val = arg;
    }

    public String toString(){
        return "[" + val + "]";
    }

}

class SimplePerson {

    String name;
    int age;

    public SimplePerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return
                "[" + this.name + " , " + this.age + "]";
    }



}
