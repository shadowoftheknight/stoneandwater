/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoneydata.io.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This problem was recently asked by Google.
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * for example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 * @author HoHill
 */
public class WhichNumberAddUp {
    
    public static void main(String args[]){
        int sum = 17;
        List<Integer> lst = Arrays.asList(10,15,3,7);
        
        List<Integer> newLst = 
                lst.stream().filter((t) -> checksum(lst, t))
                        .collect(Collectors.toList());;
        
        System.out.println(" lst -> " + newLst);
       
    }
    
    public static boolean checksum(List<Integer> lst, Integer param){
        for(Integer n:lst){
           if(n + param == 17){
               return true;
           }
        }
         
       return false;
   }
        
    
}
