import java.util.Scanner;

class Factorial{  
 public static void main(String args[]){  
  int i,fact=1;  
  Scanner myInput = new Scanner( System.in );
  System.out.print( "Enter number: " );
  int number = myInput.nextInt();
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
}
}  