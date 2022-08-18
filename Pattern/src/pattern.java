import java.io.*;
import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		    for(int i=1;i<=4;i++) {
		      for(int j=i;j<=4-1;j++) {
		        System.out.print(" ");
		      }
		      for(int j=1;j<=i;j++) {
		        System.out.print(j);
		      }
		      for(int j=i-1;j>=1;j--) {
		        System.out.print(j);
		      }
		      System.out.println();
		   
	  }
   }
}


