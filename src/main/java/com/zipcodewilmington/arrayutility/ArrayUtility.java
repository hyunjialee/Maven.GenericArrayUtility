package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    T[] inputArray;


    public ArrayUtility (T[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        int counter = 0;
        List<T> newArray = new ArrayList<>(Arrays.asList(inputArray));
        newArray.addAll(Arrays.asList(arrayToMerge));
        for (int i = 0; i < newArray.size(); i++) {
            if(newArray.get(i).equals(valueToEvaluate)) {
                counter++;
            }
        }
        return counter;
    }
    public T getMostCommonFromMerge(T[] arrayToMerge){
        return null;
    }
    public Integer getNumberOfOccurrences(T valueToRemove){
        return 0;
    }
    public T[] removeValue(T valueToRemove) {
        return null;
    }
    public String toString() {
        return null;
    }
}
