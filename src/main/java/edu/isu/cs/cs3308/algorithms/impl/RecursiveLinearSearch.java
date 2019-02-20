package edu.isu.cs.cs3308.algorithms.impl;

import edu.isu.cs.cs3308.algorithms.ArraySearch;

/**
 * @author Ethan Baumgartner
 * Code based off Isaac Griffith PsudoCode
 */
public class RecursiveLinearSearch implements ArraySearch {

    /**
     * returns false if array is null or item is null
     * @param array array to store
     * @param item item to be found
     * @param <E> Types of elements
     * @return return false or call method to search
     */

    public <E extends Comparable> int search(E[] array, E item){
        if (array == null || array.length < 0 || item == null)
            return -1;
        return recLinearSearch(array, item, 0);
    }

    /**
     * Recursive Linear Search
     * @param array stores items
     * @param item item to be found
     * @param index item at array position
     * @param <E> Type of elements
     * @return false if array is empty, if item is found return true
     */
    public <E extends Comparable> int recLinearSearch(E[] array, E item, int index) {
        if(index >= array.length){
            return -1;
        }
        if (array[index] == item) {
            return index;

        }
        return recLinearSearch(array, item, index + 1);
    }
    }
