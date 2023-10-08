

import java.io.*;

class practice {
	public static void main (String[] args) {


        //equal and equalsIgnoreCase
   String s1="Sachin";  
   String s2="SACHIN";  
  
   System.out.println(s1.equals(s2));//false  
   System.out.println(s1.equalsIgnoreCase(s2));//true  



    //using == operator  it will compare the references not the values.
   String s1="Sachin";  
   String s2="Sachin";  
   String s3=new String("Sachin");  
   System.out.println(s1==s2);//true (because both refer to same instance)  
   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)  

        //compareTo method

        // Suppose s1 and s2 are two String objects. If:

        // s1 == s2 : The method returns 0.
        // s1 > s2 : The method returns a positive value.
        // s1 < s2 : The method returns a negative value.


   String s1="Sachin";  
   String s2="Sachin";  
   String s3="Ratan";  
   System.out.println(s1.compareTo(s2));//0  
   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 ) 

	}
}