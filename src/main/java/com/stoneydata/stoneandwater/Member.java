/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoneydata.stoneandwater;

import java.util.Collection;

/**
 *
 * @author HoHill
 */
public interface Member {
    
    Member addMember(String position);
    
    Collection getMembers();
    
    String getContents();
    
}
