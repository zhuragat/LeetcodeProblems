package easy.array.RelativeSortArray_1122;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 1122. Relative Sort Array
 * https://leetcode.com/problems/relative-sort-array/
 * <p>
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
 * <p>
 * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * Output: [2,2,2,1,4,3,3,9,6,7,19]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * arr1.length, arr2.length <= 1000
 * 0 <= arr1[i], arr2[i] <= 1000
 * Each arr2[i] is distinct.
 * Each arr2[i] is in arr1.
 */
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list = new LinkedList<>();
        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());

        List<Integer> toRemove = new ArrayList<>();

        for (Integer el2 : list2) {
            for (Integer el1 : list1) {
                if (el2.equals(el1)) {
                    list.add(el2);
                    toRemove.remove(el2);
                }
            }
        }

        list1.removeAll(toRemove);
        list1.sort(Comparator.naturalOrder());

        list.addAll(list1);
        return list.stream().mapToInt(i -> i).toArray();
    }
}