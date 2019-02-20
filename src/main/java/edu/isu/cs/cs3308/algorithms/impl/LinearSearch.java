package edu.isu.cs.cs3308.algorithms.impl;

import edu.isu.cs.cs3308.algorithms.ArraySearch;

public class LinearSearch implements ArraySearch {
    /**
     * @author Ethan Baumgartner
     * Code based off Isaac Griffith psudocode
     */
    /**
     * Performs a LinearSearch
     * @param array The array to store elements
     * @param item The item to seaarch for
     * @param <E> Types of elements being stored
     * @return True if the item is found, false if the array is empty or if the item is null
     */
    public <E extends Comparable> int search(E[] array, E item){
        if(array == null || array.length < 0 ||item == null){
            return -1;
        }
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] == item){
                return i;
            }
        }
        return -1;
    }
}