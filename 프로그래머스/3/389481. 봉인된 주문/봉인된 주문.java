import java.util.*;

class Solution {
    public String solution(long n, String[] bans) {
        List<Long> banNums = new ArrayList<>();
        for (String ban : bans) {
            banNums.add(stringToLong(ban));
        }
        Collections.sort(banNums);
        
        long realN = n;
        for (long banNum : banNums) {
            if (banNum <= realN) {
                realN++;
            } else {
                break;
            }
        }
        
        return longToString(realN);
    }
    
    private long stringToLong(String s) {
        long res = 0;
        for (char c : s.toCharArray()) {
            res = res * 26 + (c - 'a' + 1);
        }
        return res;
    }
    
    private String longToString(long n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.append((char) ('a' + (n % 26)));
            n /= 26;
        }
        return sb.reverse().toString();
    }
}