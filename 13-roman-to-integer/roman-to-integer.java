class Solution {
    public int romanToInt(String roman) {
        Map<Character, Integer> s = new HashMap();
        s.put('I', 1);
        s.put('V', 5);
        s.put('X', 10);
        s.put('L', 50);
        s.put('C', 100);
        s.put('D', 500);
        s.put('M', 1000);

        int i = 0;
        int sum = 0;
        int n = roman.length();
        while (i<n) {
            if(i<n-1 && s.get(roman.charAt(i)) < s.get(roman.charAt(i+1))){
                sum += s.get(roman.charAt(i+1)) - s.get(roman.charAt(i));
                i += 2;
            } else {
                sum += s.get(roman.charAt(i));
                i++;
            }
        }
        return sum;
    }
}