/*
205. Isomorphic Strings - Easy

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.
 */

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i=0; i<s.length(); i++){
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);
            if(map.containsKey(s_char)){
                if(map.get(s_char) != t_char) return false;
            } else {
                if(map.containsValue(t_char)) return false;
                map.put(s_char, t_char);
            }
        }
        return true;
    }
}
