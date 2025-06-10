class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        String a =s.substring(0,mid);
        String b =s.substring(mid);

        return CountVowels(a)==CountVowels(b);

    }
    public int CountVowels(String str){
        int count=0;
        for(char ch:str.toCharArray()){
            if(isVowels(ch)){
                count++;
            }
        }
        return count;
    }
    public boolean isVowels(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}