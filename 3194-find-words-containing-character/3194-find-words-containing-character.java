class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        String c = Character.toString(x);
        for(int i=0;i<words.length;i++){
            if(words[i].contains(c)){
                list.add(i);
            }
        }
        return list;
    }
}