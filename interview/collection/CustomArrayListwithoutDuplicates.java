package com.interview.collection;

import java.util.ArrayList;
import java.util.List;
/*How to write customArrayList , which don't allow duplicates*/
public class CustomArrayListwithoutDuplicates extends ArrayList {

    @Override
    public boolean add(Object o) {
        if(this.contains(o)){
            return true;

        }
        else {
        return super.add(o);}
    }

    public static void main(String[] args) {


    }
}
