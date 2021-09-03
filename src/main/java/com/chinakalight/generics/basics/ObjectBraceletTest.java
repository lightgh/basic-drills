package com.chinakalight.generics.basics;

public class ObjectBraceletTest{
    public static void main(String[] args) {
        ObjectBracelet<Object> var1 = new ObjectBracelet<>(new Object());
        System.out.println(var1);

        ObjectBracelet<String> var2 = new ObjectBracelet<>("Singing");
        System.out.println("var2: " + var2);

        ObjectBracelet<Long> var3 = new ObjectBracelet<>(34L);
        System.out.println("var3: " + var3);

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



