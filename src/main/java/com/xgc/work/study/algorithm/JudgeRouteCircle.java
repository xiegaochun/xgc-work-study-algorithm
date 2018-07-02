package com.xgc.work.study.algorithm;

/**
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle,
 * which means it moves back to the original place.
 *
 * The move sequence is represented by a string. And each move is represent by a character.
 * The valid robot moves are R (Right), L(Left), U (Up) and D (down).
 * The output should be true or false representing whether the robot makes a circle.
 *
 * Example 1:
 *
 * Input: "UD"
 * Output: true
 * Example 2:
 *
 * Input: "LL"
 * Output: false
 *
 * Created by xiegaochun on 2018/6/26.
 */
public class JudgeRouteCircle {


    public static void main(String args[]){

        System.out.println(judgeCircle("LL"));
    }


    public static boolean judgeCircle(String moves) {

        if (moves.length()==0){
            return true;
        }

        int x=0;
        int y=0;
        for (int i=0;i<moves.length();i++){
            if (moves.charAt(i)=='R'){
                x++;
            }else if (moves.charAt(i)=='L'){
                x--;
            }else if (moves.charAt(i)=='U'){
                y++;
            }else if (moves.charAt(i)=='D'){
                y--;
            }
        }

        return x==0&&y==0;
    }

}
