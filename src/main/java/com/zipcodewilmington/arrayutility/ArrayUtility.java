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
        //Taking in a new array to take in values of arrayToMerge

        // Finding duplicates with an equals and counter for loop
        for (int i = 0; i < newArray.size(); i++) {
            if(newArray.get(i).equals(valueToEvaluate)) {
                counter++;
            }
        }
        return counter;
    }
    public T getMostCommonFromMerge(T[] arrayToMerge){
        int counter = 0;
        T mostCommon = null;

        List<T> newArray = new ArrayList<>(Arrays.asList(inputArray));
        newArray.addAll(Arrays.asList(arrayToMerge));

        for(T items : newArray) {
            if (getNumberOfOccurrences(items) > counter) {
                counter += getNumberOfOccurrences(items);
                mostCommon = items;
            }
        }

        return mostCommon;
    }
    public Integer getNumberOfOccurrences(T valueToRemove){
        int counter = 0;
        // for the array, return the number of values that are in the given array
//        for (int i = 0; i < this.inputArray.length; i++){
//            if (this.inputArray[i].equals(valueToRemove)){
//                counter++;
//            } ANOTHER WAY WITH FOR LOOP
        for(T item : inputArray){  //using for each loop
            if (item.equals(valueToRemove)) {
                counter++;
            }
        }
        return counter;
    }
    public T[] removeValue(T valueToRemove) {
        List<T> newArray = new ArrayList<>();
        // Creating a new arraylist
        // for all the values are NOT valueToRemove, then add to new array list

        for(int i = 0; i < this.inputArray.length; i++){
            if (!this.inputArray[i].equals(valueToRemove)) {
                newArray.add(this.inputArray[i]);
            }
        }
        return newArray.toArray(Arrays.copyOf(this.inputArray, newArray.size()));
    }
}
