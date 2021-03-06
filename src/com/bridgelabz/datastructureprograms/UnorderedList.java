/******************************************************************************
 *  Compilation:  javac -d bin UnorderedList.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.UnorderedList n
 *  
 *  Purpose: Reads the text from a file, split it into words and arrange it as Linked List.
 *  		 Takes a user input to search a Word in the List. If the Word is not found then 
 *  		 add it to the list, and if it found then remove the word from the List.
 *  		 In the end save the list into a file
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   02-01-2019
 *
 ******************************************************************************/


package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.util.CustomLinkedList;

public class UnorderedList<T> {

	/*
	* The main function is read a file and add to customized linked 
	* list to find the searched word
	*/
	public static void main(String[] args) throws IOException {
		
		//Customized Linked list
		CustomLinkedList<String> ds=new CustomLinkedList<>();
		
		FileReader fr=new FileReader("C:\\Users\\Nikita\\Desktop\\file.csv");
		BufferedReader br=new BufferedReader(fr);
		String str;
		String delimitor=",";
		while((str=br.readLine())!=null){
			String[] word=str.split(delimitor);
			for(String string:word){
				
				//Method 1- using function of CustomLinkedList class of
				//com.bridgelabz.util package
				ds.add(string);
				
			}
		}
		System.out.println("The list consists of:");
		
		//Method 2- using function of CustomLinkedList class of
		//com.bridgelabz.util package
		ds.printList();
		
		System.out.println("Enter the choice");
		int n=0;
		do{
			System.out.println("1:Search for a word  2:Exit and Write");
			int choice=CustomLinkedList.userInt();
			switch(choice){
			case 1:	System.out.println("Enter the key to be searched");
					String string=CustomLinkedList.userString();
					
					//Method 3- using function of CustomLinkedList class of
					//com.bridgelabz.util package
					boolean rs=ds.search(string);
					
					if(rs){
						System.out.println("Word is found");
						System.out.println("Fetching the index of the word");
					
						//Method 4- using function of CustomLinkedList class of
						//com.bridgelabz.util package
						int index=ds.index(string);
						
						System.out.println(index);
						
						//Method 5- using function of CustomLinkedList class of
						//com.bridgelabz.util package
						ds.remove(index);
						
						System.out.println("The list after removing the string");
						
						//Method 6- using function of CustomLinkedList class of
						//com.bridgelabz.util package
						ds.printList();
						
					}
					else{
						System.out.println("Word is not found");
						ds.add(string);
						System.out.println("The list after adding the not found element");
						ds.printList();
					}
					break;
			case 2: System.out.println("Writing the modifications into the file..");
					FileWriter fw=new FileWriter("C:\\Users\\Nikita\\Desktop\\file.csv");
					BufferedWriter bw=new BufferedWriter(fw);
					
					//Method 7- using function of CustomLinkedList class of
					//com.bridgelabz.util package
					int len=ds.size();
					
					String[] array=new String[len];
					
					//Method 8- using function of CustomLinkedList class of
					//com.bridgelabz.util package
					String[] result=ds.convArray(array);
					
					for(int i=0;i<result.length;i++){
						bw.write(result[i]+", ");
					}
					br.close();
					bw.close();
					break;
		default: System.out.println("Invalid choice");
				 System.exit(0);
		
		}
			n++;
		}while(n<10);
		
	}
	
}
