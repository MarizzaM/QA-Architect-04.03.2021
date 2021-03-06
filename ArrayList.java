package com.app;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(3);
        numbers.add(8);
        numbers.add(12);
        numbers.add(12);
        numbers.add(15);
        numbers.add(3);

        System.out.println(getLastIndex(numbers, 12));

        System.out.println(getListOfIndexes(numbers, 3));

    }

    static int getLastIndex(ArrayList list, int x){

        return list.lastIndexOf(x);
    }

    static ArrayList getListOfIndexes(ArrayList list, int x){

        ArrayList list_of_indexes = new ArrayList();

        for (int i = 0; i < list.size(); i++){
            if ((int)list.get(i) == x){
                list_of_indexes.add(i);
            }
        }

        return list_of_indexes;
    }
}
