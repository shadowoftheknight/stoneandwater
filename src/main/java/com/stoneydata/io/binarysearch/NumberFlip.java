/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoneydata.io.binarysearch;
/**
 *
 * @author HoHill
 */
public class NumberFlip {
 
   public static void main(String args[]){
       int solve = new Solution().solve(123);
       System.out.println("Solve " + solve);
   }

    static class Solution {
        public int solve(int n) {
            String amt = null;
            amt = String.valueOf(n).replaceFirst("[0-2]","3");
            return Integer.parseInt(amt);
        }
    }
}
