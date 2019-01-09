package Solution3无重复字符的最长子串;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int n=0;
        String s2="";
        int m=0;
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (!s2.contains(c+"")){
                s2+=(c);
            }else {
                if (s2.length()>m){
                    m=s2.length();
                }
                s2=s2.substring(s2.indexOf(c)+1,s2.length())+c;
            }
        }
        if (s2.length()>m){
            m=s2.length();
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aab"));
    }
}
