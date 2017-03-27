/*
 * Project Euler Problem 3
 * Made by: Tri Do
 * Task: The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * */

//Solution: 6857

public class Problem3{
  public static void main(String[] args){
    Long numb = 600851475143L;
    Long largestPrime = 0L;
    Long[] factors = new Long[2];
    
    for(Long i = 2L; i * i< numb; i++){
      //get the 2 factors
      factors[0] = i;
      factors[1] = numb/i;
      
      if(numb % i == 0){
        //check if each factor is a prime
        for(int k = 0; k < 2; k++){
    
          boolean isPrime = true;
          
          for(Long j = 2L; j*j < factors[k];j++){
            if(factors[k]%j == 0){
              isPrime = false;
              break;
            }
          }
          //if factor is prime and it is greater than the largest prime
          //set larg. prime
          if(isPrime && factors[k]>largestPrime){
            largestPrime = i;
          }
          
        }
      
      }
 
    }
    
    System.out.println(Long.toString(largestPrime));
  }
}

