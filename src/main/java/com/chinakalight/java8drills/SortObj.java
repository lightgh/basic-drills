package com.chinakalight.java8drills;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortObj {
    public static void main(String[] args) {
        List<ObjHolder> objHolderList = new ArrayList<>();
        objHolderList.add(new ObjHolder(1, "Antarctic"));
        objHolderList.add(new ObjHolder(1, "U.S. Virgin Island"));
        objHolderList.add(new ObjHolder(1, "Andorran"));
        objHolderList.add(new ObjHolder(1, "Afghan"));
        objHolderList.add(new ObjHolder(4, "Nigerian"));
        objHolderList.add(new ObjHolder(1, "British, UK"));
        objHolderList.add(new ObjHolder(2, "Chinese"));
        objHolderList.add(new ObjHolder(1, "Austrian"));
        objHolderList.add(new ObjHolder(1, "Canadian"));
        objHolderList.add(new ObjHolder(1, "Armenian"));
        objHolderList.add(new ObjHolder(5, "American"));



        System.out.println("NOT-SORTED");
        print(objHolderList);

        System.out.println("SORTED");
        objHolderList = objHolderList.stream().sorted(Comparator.comparing(ObjHolder::getCount)).collect(Collectors.toList());
        print(objHolderList);

//        objHolderList.sort(Comparator.reverseOrder((c1, c2) -> ((int) (c1 - c2))).collect(Collectors.toList());

        Collections.reverse(objHolderList);
        System.out.println("REVERSED-STR");
        print(objHolderList);

        Comparator<Integer> feeComparator = (c1, c2) -> (int) (Integer.compare(c2, c1));

//
//        List<ObjHolder> obList = objHolderList.stream().limit(3).collect(Collectors.toList());
//
//        print(obList);

    }

    public static void print(List<ObjHolder> args) {
        System.out.println("Get-Printed | Get-Country | Display");
        args.forEach(e -> {
            System.out.println(e.getCount() + "  " +  e.getLabel());
        });
    }
}
class ObjHolder{

    private String label;
    private int count;

    public ObjHolder( int count, String label){
        this.label = label;
        this.count = count;
    }

    public int getCount(){
        return this.count;
    }

    public String getLabel(){
        return this.label;
    }
}