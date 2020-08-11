/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoneydata.io.binarysearch;

import java.util.*;


 
class Solution {

    private static boolean hasNext(Tree node) {
         if(node.left != null && node.right != null){ // is complete
             return   true;
         }
         
         return false;
    }

  
   static class Tree {
    public Tree(){};
    int val =-1;
    Tree left;
    Tree right;
  }
    public static void main(String args[]){
        Tree root = new Tree();
        root.val =0;
        root.left = new Tree();
        root.left.val = 1;
//        root.left.left = new Tree();
//        root.left.left.val = 1;
        root.left.right = new Tree();
        root.left.right.val = 0;
        
        root.right = new Tree();
        root.right.val= 0;
        
        root.right.left = new Tree();
        root.right.left.val = 1;
        root.right.right = new Tree();
        root.right.right.val = 0;
        
        System.out.println(""+solve(root));
    }
    
    /*
    Given a binary tree root, return whether it's a complete binary tree. 
    That is every level is filled with nodes except possibly the last 
    and all nodes in the last level are as far left as possible.
    */
    public static boolean solve(Tree root) {
        
        Tree node = root.left;
        while(hasNext(node)){
            node = node.left;
        }
        //last node 
        if( node.left == null && node.right != null){
            System.out.println("node " + node.val);
            return false;
        }
        
        return true; // last node is complete
    }
    
}
