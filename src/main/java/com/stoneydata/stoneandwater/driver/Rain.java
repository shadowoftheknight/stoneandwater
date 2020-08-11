/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoneydata.stoneandwater.driver;

import com.stoneydata.stoneandwater.Member;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author HoHill
 */
public class Rain {
    
    public static void main(String args[]){
        int solve = solve(8123);
        System.out.println("solve " + solve);
    }
    
   

    public static int solve(int n) {
        String amt = String.valueOf(n);
        amt =  amt.replaceFirst("[0-2]","3");
        return Integer.parseInt(amt);
    }

    private static void printTree(Member nextMember) {
        nextMember.getMembers().forEach((t) -> {
            Member aMember = (Member) (t);
            if(aMember.isRoot()){
                System.out.println("[root] -> "+aMember.getContents());
            }else{
                System.out.println(""+aMember.getContents());
            }
            printTree(aMember);
        });
    }
    
}
