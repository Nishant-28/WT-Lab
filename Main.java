// Given a string str, find the minimum characters to be added at front of the string to make it a palindrome.

// Input:
// str = ABCD
// Output: 3
// Explanation: The resultant string after adding 3 characters is DCBABCD. The minimum possible answer is 3.


// You don't need to read input or print anything. Your task is to make Solution which takes the string str as input parameters and returns the minimum number of characters to be added to make it a palindrome.

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int solve(String str) {
        int n = str.length();
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                i = 0;
                j--;
            }
        }
        return n - i - 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution s = new Solution();
        System.out.println(s.solve(str));
    }
}