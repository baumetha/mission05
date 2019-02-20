package edu.isu.cs.cs3308.algorithms.impl;

import edu.isu.cs.cs3308.algorithms.ArraySearch;

/**
 * @author Ethan Baumgartner
 * Code based off Isaac Griffith PsudoCode
*/
public class BinarySearch implements ArraySearch {

    /**
     * Performs a BinarySearch
     * @param array The array
     * @param item The item being searched for
     * @param <E> Types of elements being stored
     * @return True if the item is found, false if the array is empty or if the item is null
     */
    public <E extends Comparable> int search(E[] array, E item) {
        if (array == null || array.length < 0 || item == null){
            return -1;
        }
        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int mid = (low + high)/ 2;
            if (array[mid] == item) {
                return mid;
            }
                else if((Integer)item < (Integer)array[mid]){
                high = mid - 1;
            }
                else{
                    low = mid + 1;
                }
        }
        return -1;
            }
        }