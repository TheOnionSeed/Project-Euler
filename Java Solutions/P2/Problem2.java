/*
 * Project Euler Problem 2
 * Made by: Tri Do
 * Task: Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 * */

//Solution: 4613732

public class Problem2{
  public static void main(String[] args){
    int evenTotal=  0;
    int prevNumb =  1;
    int currNumb =  2;
    
    while(currNumb < 4000000){
      int tmpNumb = prevNumb;
      if(currNumb%2 == 0){
        evenTotal += currNumb;
      }
      prevNumb = currNumb;
      currNumb = tmpNumb+currNumb;
    }
    System.out.println(Integer.toString(evenTotal));
    
  }
}

