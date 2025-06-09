class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String joint1 = String.join("",word1);
        String joint2 = String.join("",word2);
        
        if(joint1.equals(joint2)) return true;
        else return false;
    }
}