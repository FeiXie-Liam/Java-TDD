package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private int[] specialNum = {3, 5, 7};

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            if (containNum(i, specialNum[0])) {
                results.add("Fizz");
                continue;
            }
            String str = getOutput(i);
            if (str.equals(""))
                results.add(Integer.toString(i));
            else
                results.add(str);
        }
    }

    public String getOutput(int i) {
        String str = "";
        if (isMultipleOfNum(i, specialNum[0]))
            str += "Fizz";
        if (isMultipleOfNum(i, specialNum[1]))
            str += "Buzz";
        if (isMultipleOfNum(i, specialNum[2]))
            str += "Whizz";
        return str;
    }

    public boolean isMultipleOfNum(int integer, int num) {
        return integer % num == 0;
    }

    public boolean containNum(int integer, int num) {
        char[] cs = Integer.toString(integer).toCharArray();
        for (char c : cs) {
            if (Character.getNumericValue(c) == num)
                return true;
        }
        return false;
    }


    public List<String> getResults() {
        return results;
    }
}


