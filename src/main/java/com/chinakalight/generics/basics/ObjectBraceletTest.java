package com.chinakalight.generics.basics;

public class ObjectBraceletTest{
    public static void main(String[] args) {
        ObjectBracelet<Object> var1 = new ObjectBracelet<>(new Object());
        System.out.println(var1);

        ObjectBracelet<String> var2 = new ObjectBracelet<>("Singing");
        System.out.println("var2: " + var2);

        ObjectBracelet<Long> var3 = new ObjectBracelet<>(34L);
        System.out.println("var3: " + var3);

        ObjectBracelet<King> var4 = new ObjectBracelet<King>(new King("Junior", "Peterson", 23));
        System.out.println("King: " + var4);

        System.out.println("============================>=====>>");

        ObjectBraceletMultiple<String, Integer, Object, King, String> objectBraceletMultiple =
                new ObjectBraceletMultiple<>(
                        "Kong",
                        34,
                        new Object(),
                        new King("Senior", "Panders", 78),
                        "Software Development Methodologies");

        System.out.println("objectBraceletMultiple: " + objectBraceletMultiple);


        ObjectBraceletMultiple<King, King, King, King, String> objectBraceletMultiple2 =
                new ObjectBraceletMultiple<>(
                        new King("Senior", "Zebra", 78),
                        new King("Senior", "Lion", 78),
                        new King("Senior", "Danger", 76),
                        new King("Senior", "Panders", 18),
                        "Software Development Methodologies" );

        System.out.println("objectBraceletMultiple-2: " + objectBraceletMultiple2);

        PairOfT<Integer> nPair1 = new PairOfT<>(200, 300, 500);

        System.out.println(nPair1);

    }

}

class PairOfT<T> {

    T object1;
    T object2;
    T object3;

    PairOfT(T one, T two, T three){
        object1 = one;
        object2 = two;
        object3 = three;
    }

    public T getFirst(){
        return object1;
    }

    public T getSecond(){
        return object2;
    }

    public T getThird(){
        return object3;
    }

    @Override
    public String toString() {
        return "PairOfT{" +
                "object1=" + object1 +
                ", object2=" + object2 +
                ", object3=" + object3 +
                '}';
    }
}

 class King {
    String title;
    String name;
    int age;

    public King(String title, String name, int age){
        this.title = title;
        this.name = name;
        this.age = age;
    }

     @Override
     public String toString() {
         return "King{" +
                 "title='" + title + '\'' +
                 ", name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }
 }

class ObjectBracelet<CT> {
    CT braceTemplate;
    public ObjectBracelet(CT braceTemplate){
        this.braceTemplate = braceTemplate;
    }

    public String toString(){
        return "[" + this.braceTemplate + "]";
    }
}

class ObjectBraceletMultiple<CT1, CT2, CT3, CT4, CT5> {
    CT1 firstObj;
    CT2 secondObj;
    CT3 thirdObj;
    CT4 fourthObj;
    CT5 fifthObj;

    public ObjectBraceletMultiple(CT1 firstParam, CT2 secondParam, CT3 thirdParam, CT4 fourthParam, CT5 fifthParam){
        this.firstObj = firstParam;
        this.secondObj = secondParam;
        this.thirdObj = thirdParam;
        this.thirdObj = thirdParam;
        this.fourthObj = fourthParam;
        this.fifthObj = fifthParam;
    }

    @Override
    public String toString() {
        return "ObjectBraceletMultiple{" +
                "firstObj=" + firstObj +
                ", secondObj=" + secondObj +
                ", thirdObj=" + thirdObj +
                ", fourthObj=" + fourthObj +
                ", fifthObj=" + fifthObj +
                '}';
    }
}



