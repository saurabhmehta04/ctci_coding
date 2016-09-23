package challenges;

import java.util.*;

public class arrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
      /*
      loop num1
        loop num2
            check if mum2[index] == num1[index]
                add to the new array
        */
        // ArrayList<Integer> arr = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j++) {
                if(nums2[j] == nums1[i]){
                    set.add(nums2[j]);
                }
            }
        }
        int[] arr = new int[set.size()];
        Iterator<Integer> iter = set.iterator();
        int i = 0;
        while(iter.hasNext() && i < arr.length) {
            arr[i] = iter.next();
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,2,3,4,4,5,1};
        int[] num2 = {2,2,4,3,10};

        int[] result = intersection(num1, num2);
        for (int res : result) {
            System.out.println(res);
        }
    }
}
