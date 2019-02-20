package edu.isu.cs.cs3308.algorithms.impl;

import edu.isu.cs.cs3308.algorithms.ArraySearch;

/**
 * @author Ethan Baumgartner
 * Code based off Isaac Griffith PsudoCode
 */

public class RecursiveBinarySearch implements ArraySearch {
    /**
     * Checks array and calls search method
     * @param array The array to store elements
     * @param item item to search for
     * @param <E> Types of elements
     * @return false if array is empty or item is null otherwise calls the search method
     */
    public <E extends Comparable> int search(E[] array, E item) {
        if (array == null || array.length <= 0 || item == null)
            return -1;
        return recBinarySearch(array, (Integer) item, 0, array.length - 1);
    }

    /**
     * performs the recursive binary search
     * @param array Array to store elements
     * @param item item to be found
     * @param low start of array
     * @param high end of array -1
     * @param <E> Types of elements
     * @return false if the start of array is less than the end of the array -1 true if item is found
     */
    public <E extends Comparable> int recBinarySearch(E[] array, int item, int low, int high){
        int mid = (low +high)/ 2;
        if (low >= high){
            return -1;
        }
        if ((Integer) array[mid] == item){
            return mid;
        }
        if ((Integer) array[mid] > item) {
            return recBinarySearch(array, item, low, mid - 1);
        }
            else{
                return recBinarySearch(array, item, mid +1, high);
            }
        }
    }