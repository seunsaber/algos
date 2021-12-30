package com.seunfapps.algos.challenges;

public class StringToIntegerAtoI {

    public int myAtoi(String s) {
        char [] sArray = s.toCharArray();
        int sLength = sArray.length;
        int index = 0;
        int sign = 1;

        while(index < sLength){
            if(sArray[index] == ' ')
                index++;
            else
                break;
        }
        if(index < sLength && sArray[index] == '-'){
            sign = -1;
            index++;
        }else if(index < sLength && sArray[index] == '+'){
            sign = 1;
            index++;
        }

        int num = 0;

        while(index < sLength && Character.isDigit(sArray[index])){
            if(num > (Integer.MAX_VALUE / 10))
                return sign * Integer.MAX_VALUE;

            num = (num * 10) +  sArray[index] - '0';

            index++;
        }

        return sign * num;

    }
}
