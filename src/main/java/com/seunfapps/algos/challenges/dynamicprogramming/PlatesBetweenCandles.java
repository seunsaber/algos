package com.seunfapps.algos.challenges.dynamicprogramming;

public class PlatesBetweenCandles {
    /*
    * There is a long table with a line of plates and candles arranged on top of it.
    * You are given a 0-indexed string s consisting of characters '*' and '|' only,
    * where a '*' represents a plate and a '|' represents a candle.

    You are also given a 0-indexed 2D integer array queries where queries[i] = [lefti, righti]
    * denotes the substring s[lefti...righti] (inclusive). For each query, you need to find the number of plates between candles that are in the substring. A plate is considered between candles if there is at least one candle to its left and at least one candle to its right in the substring.

    For example, s = "||**||**|*", and a query [3, 8] denotes the substring "*||**|". The number of plates between candles in this substring is 2, as each of the two plates has at least one candle in the substring to its left and right.
    Return an integer array answer where answer[i] is the answer to the ith query.
    *
    * Input: s = "**|**|***|", queries = [[2,5],[5,9]]
      Output: [2,3]
      *
      * Input: s = "***|**|*****|**||**|*", queries = [[1,17],[4,5],[14,17],[5,11],[15,16]]
        Output: [9,0,0,0,0]
        Explanation:
        - queries[0] has nine plates between candles.
        - The other queries have zero plates between candles.
    * */

    public static void main (String [] args){
        String s = "***|**|*****|**||**|*";
        int [][] queries = new int[][] {{1, 17},{4, 5,}, {14, 17}, {5, 11}, {15, 16}};

        int [] result = platesBetweenCandles(s, queries);

        for(int i : result)
            System.out.print(i + " ");
    }
    public static int[] platesBetweenCandles(String s, int[][] queries) {
        //solve using prefix sum.
        int [] output = new int [queries.length];

        int [] plateCounts = new int [s.length()];
        int [] leftToRightCandles = new int [s.length()];
        int [] rightToLeftCandles = new int [s.length()];

        plateCounts[0] = s.charAt(0) == '*' ? 1 : 0;
        //if current char sis * increment, else retain previous value
        //so at any index you read, you get the number of * found so far.
        for(int i = 1; i < s.length(); i++){
            plateCounts[i] =
                    s.charAt(i) == '*' ? plateCounts[i - 1] + 1 : plateCounts[i - 1];
        }

        int candleIndex = -1;
        //get index of candles from left to right
        //so at any index you read, you know the index of the last found candle
        for(int i = 0; i < leftToRightCandles.length; i++){
            if(s.charAt(i) == '|'){
                candleIndex = i;
            }
            leftToRightCandles[i] = candleIndex;
        }

        candleIndex = -1;
        //get index of candles from right to left
        //so at any index you read, you know the index of the last found candle
        for(int i = rightToLeftCandles.length - 1; i >= 0; i--){
            if(s.charAt(i) == '|'){
                candleIndex = i;
            }
            rightToLeftCandles[i] = candleIndex;
        }


        for(int i = 0; i < queries.length; i++){
            int leftCandle = rightToLeftCandles[queries[i][0]];
            int rightCandle = leftToRightCandles[queries[i][1]];

            //if any candle is -1, that means that side is not bounded by a candle.
            if(leftCandle == -1 || rightCandle == -1 || leftCandle >= rightCandle){
                output[i] = 0;
                continue;
            }

            //difference between the prefix sum count, would give the number of plates between the candle.
            output[i] = plateCounts[rightCandle] - plateCounts[leftCandle];
        }

        return output;
    }
}
