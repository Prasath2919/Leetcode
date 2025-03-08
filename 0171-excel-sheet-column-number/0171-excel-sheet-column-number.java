class Solution {
    public int titleToNumber(String S) {
        int result =0;
        for(int i=0;i<S.length();i++){
            int value = S.charAt(i)-'A'+1;

            result=result*26+value;
        }
        return result;
    }
}