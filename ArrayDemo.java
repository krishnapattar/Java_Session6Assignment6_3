

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int first,last,item,counter,num,array[],middle;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("plz enter numbers of elements");
		num=s.nextInt();

		array=new int[num];
		

		System.out.println("plz enter "+num+"elements");
		
		for(counter=0;counter<num;counter++)
			array[counter]=s.nextInt();
			
			System.out.println("enter search value");
			item=s.nextInt();
			first=0;
			last=num-1;
			middle=(first+last)/2;
			
			 while( first <= last )
		      {
		         if ( array[middle] < item )
		           first = middle + 1;
		         else if ( array[middle] == item )
		         {
		           System.out.println(item + " found at location " + (middle + 1) + ".");
		           break;
		         }
		         else
		         {
		             last = middle - 1;
		         }
		         middle = (first + last)/2;
		      }
		      if ( first > last )
		          System.out.println(item + " is not found.\n");
		   }
		}