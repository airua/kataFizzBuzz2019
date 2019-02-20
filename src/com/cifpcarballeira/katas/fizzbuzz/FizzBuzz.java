/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.fizzbuzz;

/**
 *
 * @author dam227
 */
public class FizzBuzz {

    public String getFizzBuzz(int i){
            if(i%3==0 && i%5==0 ) return "FizzBuzz";
            else if (i%3==0)return "Fizz";
            else if(i%5==0 || Integer.toString(i).contains("5")) return "Buzz";            
            else return Integer.toString(i);
            
            //|| Integer.toString(i).contains("3")
            

    }
    
}


