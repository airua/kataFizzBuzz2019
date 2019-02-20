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
     public void test3devuelveFizz() {
     
         FizzBuzz fb= new FizzBuzz();
         String result=fb.getFizzBuzz(3);
         assertEquals("Fizz",result );
                  
     }
     
     @Test
     public void test5devuelveBuzz() {
     
         FizzBuzz fb= new FizzBuzz();
         String result=fb.getFizzBuzz(5);
         assertEquals("Buzz",result );
                  
     }
     
     @Test
     public void test35devuelveFizzBuzz() {
     
         FizzBuzz fb= new FizzBuzz();
         String result=fb.getFizzBuzz(15);
         assertEquals("FizzBuzz",result );
                  
     }
     

          @Test
     public void testContiene35devuelveFizzBuzz() {
     
         FizzBuzz fb= new FizzBuzz();
         String result=fb.getFizzBuzz(35);
         assertEquals("FizzBuzz",result );
                  
     }
     
 

     @Test
     public void testcontiene5devuelveBuzz() {
     
         FizzBuzz fb= new FizzBuzz();
         String result=fb.getFizzBuzz(59);
         assertEquals("Buzz",result );
                  
     }
     
     

     
     
     
     
}
