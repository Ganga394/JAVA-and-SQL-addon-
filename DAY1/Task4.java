package Basics;
import java.util.*;
public class sample {

	public static void main(String[] args) {
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter the A value:");
	     int a=s.nextInt();
	     System.out.println("Enter the B value:");
	     int b=s.nextInt();
	     System.out.println("Enter the Operator:");
	     int c=s.nextInt();
	     switch(c) {
	     case 1:
	    	 System.out.println(a+b);
	    	 break;
	     case 2:
	    	 System.out.println(a-b);
	    	 break;
	     case 3:
	    	 System.out.println(a*b);
	    	 break;
	     case 4:
	    	 System.out.println(a/b);
	    	 break;
	     default:
	    	 System.out.println("Invalid number..");
	    	 	 
	    	 	 
	     }
	}

}
