package com.sambaran;

public class Practice{
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.num1 = 100;
        sol.num2 = 200;
        sol.subtract();
        System.out.println(sol.result);
    }
}

class Solution{
    int num1, num2, result;

    public void subtract() {
        result = num2 - num1;
    }
}