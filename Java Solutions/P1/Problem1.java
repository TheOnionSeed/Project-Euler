/*
 * Project Euler Problem 1
 * Made by: Tri Do
 * Task: If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23. 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * */

//Solution: 233168

public class Problem1{
  public static void main(String[] args){
    int counter = 0;
    for(int i=0; i < 1000; i++){
      if(checkMultiple(i)){
        counter+=i;//increment the counter by i if i is multiple of 3 or 5
      }
    }
    System.out.println(counter);
  }
  
  //Check if n is a multiple of 3 or 5
  private static boolean checkMultiple(int n){
    return (n%3 == 0 || n%5 == 0);
  }
}

