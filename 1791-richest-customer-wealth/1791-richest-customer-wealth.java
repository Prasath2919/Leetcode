class Solution {
    public int maximumWealth(int[][] accounts) {
        ArrayList<Integer> arr = new ArrayList<>();//  we don't use arraylist instead we use
        for(int i=0;i<accounts.length;i++){   //int res=0;
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            arr.add(sum);//res =Math.max(res,sum)
        }
        Collections.sort(arr);
        return arr.get(arr.size()-1);
    }
}