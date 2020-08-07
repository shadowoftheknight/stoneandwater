/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoneydata.stoneandwater;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author HoHill
 */
public class Branch implements Member{
    String contents;

   
    Member root = null;  // is Root
    Collection members = null; // Root members

   
    public Branch(){
        root = this;
        members = new ArrayList();
    }
    
    public Member getRoot() {
        return root;
    }
    
    @Override
    public Member addMember(String _contents) {
        Branch p = new Branch();
        p.setContents(_contents);
        this.members.add(p);
        
        System.out.println(_contents + " Add m "+ p );
        return p;
    }
    
    public void setContents(String contents) {
        this.contents = contents;
    }
       
    @Override
    public Collection getMembers() {
        return members;
    }
      
    public void setMembers(Collection members) {
        this.members = members;
    }
    
    public String getContents(){
        return contents;
    }
      
}
