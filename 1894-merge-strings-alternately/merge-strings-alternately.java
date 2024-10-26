class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int minlength = Math.min(word1.length(), word2.length());
        StringBuilder result = new StringBuilder();
        for(int i=0; i< minlength; i++){
            result.append(arr1[i]).append(arr2[i]);
        }
        if(word1.length()>word2.length()){
            result.append(word1.substring(minlength));
        }
        if(word2.length()>word1.length()){
            result.append(word2.substring(minlength));
        }
        return result.toString();
    }
}