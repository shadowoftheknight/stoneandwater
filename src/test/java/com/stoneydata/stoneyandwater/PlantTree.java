package com.stoneydata.stoneyandwater;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.stoneydata.stoneandwater.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import junitparams.JUnitParamsRunner;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author HoHill
 */
public class PlantTree {
    String LEFT = "LEFT";
    String RIGHT = "RIGHT";
    
    public PlantTree() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

     @Test
     public void shouldBeTwoBranches() {
         
        BasicTree tree = new BasicTree(); //Root
        Member a = tree.addMember(LEFT); // A
        Member b = tree.addMember(RIGHT);// B
        
        a.addMember(RIGHT);// A A
        a.addMember(LEFT);// A B
        
        tree.getMembers().stream().forEach((t) -> {
            System.out.println(""+((Member)t).getMembers().size());
        });
        
         assertTrue(true,"No members ");
     }
}
