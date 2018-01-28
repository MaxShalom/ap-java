/*
Lesson 25 - Unit 3 - Algorithms 

Make an algorithm that prints all 
the prime (can online divide by 1 and by itself) 
numbers from 1-100.
*/

public class Main {
  
  public static void main(String[] args)
  {
    boolean prime[] = new boolean [100];
          
    //Initialize to true
    for (int j = 0; j < prime.length; j++)
    {
      prime[j] = true;
    }

    for (int d = 2; d < prime.length; d++) {
      for (int i = d + 1; i < prime.length; i++) {
        if (i % d == 0){
          prime [i] = false;
        }
      }
    }

    //Output
    for(int i = 2; i < prime.length; i++) {
      if (prime[i]){
        System.out.print(i + " ");
      }
    }
  }
}

