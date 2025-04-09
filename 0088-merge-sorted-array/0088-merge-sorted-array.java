import java.util.*;
import java.util.ArrayList;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) result.add(nums1[i]);
        for (int i = 0; i < n; i++) result.add(nums2[i]);

        Collections.sort(result);

        for (int i = 0; i < result.size(); i++) {
            nums1[i] = result.get(i); 
        }

        System.out.println(Arrays.toString(nums1));



    }
}
        