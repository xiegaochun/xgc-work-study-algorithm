package com.xgc.work.study.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 *
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * Example 2:
 *
 * Input: J = "z", S = "ZZ"
 * Output: 0
 * Note:
 *
 * S and J will consist of letters and have length at most 50.
 * The characters in J are distinct.
 *
 * Created by xiegaochun on 2018/6/20.
 *
 */
public class JewelsAndStones {

    public static void main(String args[]){

        System.out.println(findJewelsNumber("adbcdsatea","ab"));
    }


    static int findJewelsNumber(String stones,String jewels){

        if (stones==null||"".equals(stones)){
            return 0;
        }
        if (jewels==null||"".equals(jewels)){
            return 0;
        }
        Map<String,Integer> map = new HashMap<String,Integer>();
        for (int i =0;i<stones.length();i++){
            if (!map.containsKey(stones.substring(i,i+1).toString())){
                map.put(stones.substring(i,i+1).toString(),1);
            }else{
                int key = map.get(stones.substring(i,i+1));
                map.put(stones.substring(i,i+1).toString(),key+1);
            }

        }
        int len = 0;
        for (int j=0;j<jewels.length();j++){
            if (map.containsKey(jewels.substring(j,j+1).toString())){
                len=len+map.get(jewels.substring(j,j+1));
            }
        }
        return len;

    }


}
