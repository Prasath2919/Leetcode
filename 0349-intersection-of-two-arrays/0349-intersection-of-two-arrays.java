class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionset = new HashSet<>();

        for(int num:nums1){
            set1.add(num);
        }

        for(int num: nums2){
            if(set1.contains(num)){
                intersectionset.add(num);
            }
        }
        int[] result = new int[intersectionset.size()];
        int i = 0;
        for (int num : intersectionset) {
            result[i++] = num;
        }

        return result;
    }
}
        