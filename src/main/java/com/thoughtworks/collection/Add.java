package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum=0;
        int min=leftBorder<rightBorder?leftBorder:rightBorder;
        int max=rightBorder>leftBorder?rightBorder:leftBorder;
        for (int i = min; i <=max; i++) {
            if(i%2==0)
                sum+=i;
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        List<Integer> list = arrayList.stream().map((item) -> {
            return item * 3 + 2;
        }).collect(Collectors.toList());
        for (int i : list) {
            sum += i;
        }
        return sum;

    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> list = new ArrayList<>();
//        for(int i:arrayList){
//            if(i%2==0)
//                list.add(i);
//            else{
//                list.add(i*3+2);
//            }
//
//        }
//        return list;
        return arrayList.stream().map((item) -> {
            return item % 2 == 0 ? item : item * 3 + 2;
        }).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
//        int sum=0;
//        List<Integer> list = arrayList.stream().map((item)->{
//            return item%2==1?item*3+5:0;
//        }).collect(Collectors.toList());
//        for(int i:list){
//            sum+=i;
//        }
//        return sum;
//        return arrayList.stream().filter((item) -> item % 2 == 1).map((item) -> item * 3 + 5).reduce(0, (item1, item2) -> {
//            return item1 + item2;
//        });
        return arrayList.stream().filter((item) -> item % 2 == 1).mapToInt((item) -> item * 3 + 5).sum();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        //int count=0;
        return arrayList.stream().filter((item) -> {return item % 2 == 0;}).mapToDouble((item) -> item).average().orElse(0);
    }

//    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
//        throw new NotImplementedException();
//    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
