

import java.io.*;

/* 
Unary operator
Arithmetic Operator
Shift Operator
Relational Operator
Bitwise Operator
Logical Operator
Ternary Operator
Assignment Operator
*/



class practice {
	public static void main (String[] args) {
	

    //unary operator
	int x=10;  
    System.out.println(x++);//10 value changed to 11 after this
    System.out.println(++x);//12  
    System.out.println(x--);//12  value changed to 11 after this
    System.out.println(--x);//10  
    int a=10;
    int b=-10
    System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
    System.out.println(~b);//9 (positive of total minus, positive starts from 0)  

    Boolean flag =false;
    System.out.println(!flag) //true will be printed


    //Arithmetic operator
    int a=10;  
    int b=5;  
    System.out.println(a+b);//15  
    System.out.println(a-b);//5  
    System.out.println(a*b);//50  
    System.out.println(a/b);//2  
    System.out.println(a%b);//0  
		

    //Shift Operator
    System.out.println(10<<2) // will shift the bit by 2 position to left  will become 40
	System.out.println(10>>2);// will shift the bit by 2 position to right  will become 2

    //For positive number, >> and >>> works same  
    //For negative number, >>> changes parity bit (MSB) to 0  

    //ternary operator:- used as one line replacement for if-then-else statement and used a lot in Java programming.

    int a=2;  
    int b=5;  
    int min=(a<b)?a:b;  
    System.out.println(min); //prints 2 


        //The logical || operator doesn't check the second condition if the first condition is true. 
        //It checks the second condition only if the first one is false.

        //The bitwise | operator always checks both conditions whether first condition is true or false.

	}
}