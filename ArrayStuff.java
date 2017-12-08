/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystuff;

import java.util.Random;

/**
 *
 * @author Don sdfsdf stutter why is this hard SOme more changes
 */
public class ArrayStuff {
    double[][] b = {{0.0, 1, 1}, {0.0, 1, 1},};
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
        * Use Initialized to build array
        */
        int[] newArray = {23, 33, 56, 78, 90};


        /**
        * Loop through the array forward direction and print the values of the elements
        */
        System.out.println("Start printing array from the beginning to the end");
        for(int i=0 ; i < newArray.length ; i++){
            System.out.println(newArray[i]);
        }

        /**
        * Loop through the array backward and print the values of the elements.
        * the "--" means decrement the value of j each time it loops
        */
        System.out.println("Start printing array backwards from the end to the beginning");        
        for(int i=newArray.length-1 ; i >= 0; i--){
            System.out.println(newArray[i]);
        }
        
        /**
        * Create array with 50 integers  and assign them 0..49 and print each element
        */        
        System.out.println("Building array of 50 and printing the element values.  Adding up the values as we go.");  
        int[] secondArray;
        int sum=0;
        secondArray = new int[50];
        for(int i=0; i < secondArray.length; i++){
            secondArray[i]=i;
            System.out.println(secondArray[i]);
            sum += secondArray[i];
        }
        System.out.println("The sum of the second array is :" + sum);
        

        /**
        * Create array with 100 integers  and assign them random numbers between 0-99 and print each element
        */        
        System.out.println("Building array of 50 and printing the element values.  Adding up the values as we go.");  
        int[] thirdArray;
        int numberofeven=0;
        thirdArray = new int[100];
        for(int i=0; i < thirdArray.length; i++){
            thirdArray[i]=getRandomNumberInRange(0,99);
            System.out.println(thirdArray[i]);
            if (thirdArray[i] % 2 == 0) { numberofeven++; }
            
        }
        
        System.out.println("The number of even elements is :" + numberofeven);  
              
    }
    
    

    private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
    }
    
}
