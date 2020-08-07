/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoneydata.stoneandwater.driver;

import com.stoneydata.stoneandwater.BasicTree;
import com.stoneydata.stoneandwater.Member;
import java.util.Iterator;

/**
 *
 * @author HoHill
 */
public class Rain {
    
    public static void main(String args[]){
       
        BasicTree tree = new BasicTree(); //Root
        Member a = tree.addMember("A"); // A
        Member b = tree.addMember("B");// B
        
        a.addMember("A A");// A A
        a.addMember("A B");// A B
        
        printTree(tree);
    }

    private static void printTree(Member nextMember) {
        Iterator i = nextMember.getMembers().iterator();
        while(i.hasNext()){
            Member aMember = (Member) i.next();
            System.out.println(""+aMember.getContents());
            printTree(aMember);
        }
    }
}
