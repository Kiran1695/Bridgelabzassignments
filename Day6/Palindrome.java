import java.util.Scanner;

class Palindrome {  
     public static void main(String args[]){  
      int r,sum=0,temp;
      int i = 0;
      while (i < 2) {
        System.out.print( "Enter number: " ); 
        Scanner myInput = new Scanner( System.in );
        int n = myInput.nextInt();
        
        temp=n;    
        while(n>0){    
            r=n%10;  //getting remainder  
            sum=(sum*10)+r;    
            n=n/10;    
        }
        if(temp==sum)    
            System.out.println("palindrome number ");    
        else    
            System.out.println("not palindrome"); 
        i++;
        }
     }
}  