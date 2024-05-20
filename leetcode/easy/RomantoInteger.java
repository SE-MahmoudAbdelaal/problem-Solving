
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int currentVal = map.get(s.charAt(i));

            // If the current value is less than the next value, it should be subtracted
            if (i + 1 < length && currentVal < map.get(s.charAt(i + 1))) {
                sum -= currentVal;
            } else {
                sum += currentVal;
            }
        }

        return sum;
    }
}
