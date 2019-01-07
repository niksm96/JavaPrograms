/******************************************************************************
 *  Compilation:  javac -d bin OrderedList.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprogram.OrderedList n
 *  
 *  Purpose: ­> Read .a List of Numbers from a file and arrange it ascending Order in a
 *  			Linked List. Take user input for a number, if found then pop the number out of the
 *  			list else insert the number in appropriate position
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   31-12-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.util.CustomLinkedList;
import com.bridgelabz.util.Utility;

public class OrderedList{
	
	/*
	* The main function is to read from a file and sort the elements
	* in ascending order to find the searched data and write the 
	* result into a file
	*/
	public static void main(String[] args) throws IOException {
		
		//Customized Linked List
		CustomLinkedList<Integer> ds=new CustomLinkedList<>();
		String filename="C:\\Users\\Nikita\\Desktop\\Numbers.csv";
		FileReader fr=new FileReader(filename);
		CustomLinkedList<Integer> ds1=new CustomLinkedList<>();
		BufferedReader br=new BufferedReader(fr);
		String number[]=new String[100];
		String num;
		String delimitor=",";
		while((num=br.readLine())!=null){
			number=num.split(delimitor);
		}
		Integer [] intArr=new Integer[number.length];
		for(int i=0;i<intArr.length;i++)
		{
			intArr[i]=Integer.valueOf(number[i]);
		}
		
		////Method 1- using function of CustomLinkedList class of
		//com.bridgelabz.util package
		Integer[] sorted=Utility.sort(intArr);
		
		for(int numb:sorted){
		
			//Method 2- using function of CustomLinkedList class of
			//com.bridgelabz.util package
			ds.add(numb);
		}
		
		System.out.println("The numbers in the file are:");
		
		//Method 3- using function of CustomLinkedList class of
		//com.bridgelabz.util package
		ds.printList();
		
		System.out.println("Enter the choice");
		int n=0;
		do{
			System.out.println("1:Search for a number  2:Final Write  3:Exit");
			int choice=CustomLinkedList.userInt();
			switch(choice){
			case 1:	System.out.println("Enter the number to be searched");
					int user_num=CustomLinkedList.userInt();
					
					//Method 4- using function of CustomLinkedList class of
					//com.bridgelabz.util package
					
					boolean rs=ds.search(user_num);
					if(rs){
						System.out.println("Number is found");
						System.out.println("Fetching the index of the number");
						
						//Method 5- using function of CustomLinkedList class of
						//com.bridgelabz.util package
						int index=ds.index(user_num);
						
						System.out.println(index);
						
						//Method 6- using function of CustomLinkedList class of
						//com.bridgelabz.util package
						ds.remove(index);
						
						System.out.println("The list after removing the number");
						
						//Method 7- using function of CustomLinkedList class of
						//com.bridgelabz.util package
						ds.printList();
					}
					else{
						System.out.println("Number not found");
						ds.add(user_num);
						String[] array=new String[ds.size()];
						
						//Method 8- using function of CustomLinkedList class of
						//com.bridgelabz.util package
						String array1[]=ds.convArray(array);
						
						//Method 9- using function of CustomLinkedList class of
						//com.bridgelabz.util package
						int[] intArray=ds.convertIntArray(array1);
						
						int[] sorted_array=ds.sort(intArray);
						for(int i:sorted_array)
							ds.add(i);
						System.out.println("The list after adding the not found element");
						ds.printList();
					}
					break;
			case 2: System.out.println("Writing the modifications into the file..");
					
					
					//Method 10- using function of CustomLinkedList class of
					//com.bridgelabz.util package
					int leng=ds.size();
					String[] res_array=new String[leng];
					String[] result=ds.convArray(res_array);
					Utility.fileWriter(result,filename);
//					for(int i=0;i<result.length;i++){
//						bw.write(result[i]+", ");
//					}
//					br.close();
//					bw.close();
					break;
		   case 3: System.out.println("Invalid choice");
				   System.exit(0);
		
		}
			n++;
		}while(n<10);
		br.close();
	}
}
