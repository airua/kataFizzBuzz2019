package com.cifpcarballeira.katas.fizzbuzz.tests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cifpcarballeira.katas.fizzbuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam227
 */
public class Testfizzbuzz {
    
    public Testfizzbuzz() {
    }

   
     @Test
     public void test1devuelve1() {
     
         FizzBuzz fb= new FizzBuzz();
         String result=fb.getFizzBuzz(1);
         assertEquals("1",result );
         
         
     }
     
     @Test
     public void test2devuelve2() {
     
         FizzBuzz fb= new FizzBuzz();
         String result=fb.getFizzBuzz(2);
         assertEquals("2",result );
         
         
     }
     
     @Test
     public void test3devuelve3() {
     
         FizzBuzz fb= new FizzBuzz();
         String result=fb.getFizzBuzz(3);
         assertEquals("Fizz",result );
                  
     }
     
     @Test
     public void test5devuelve5() {
     
         FizzBuzz fb= new FizzBuzz();
         String result=fb.getFizzBuzz(5);
         assertEquals("Buzz",result );
                  
     }
     
     
}
