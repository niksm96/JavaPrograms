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
import java.io.FileReader;
import java.io.IOException;
import com.bridgelabz.util.DataStructure;

public class UnorderedList<T> {

	public static void main(String[] args) throws IOException {
		DataStructure<String> ds=new DataStructure<>();
		FileReader fr=new FileReader("C:\\Users\\Nikita\\Desktop\\List.csv");
		BufferedReader br=new BufferedReader(fr);
		String str;
		String delimitor=",";
		while((str=br.readLine())!=null){
			String[] word=str.split(delimitor);
			for(String string:word){
				ds.add(string);
			}
		}
		System.out.println("The list consists of:");
		ds.printList();
		System.out.println("Enter the key to be searched");
		String string=DataStructure.userString();
		boolean rs=ds.search(string);
		if(rs){
			System.out.println("Word is found");
			System.out.println("Fetching the index of the word");
			int index=ds.index(string);
			System.out.println(index);
			ds.remove(index);
			System.out.println("The list after removing the string");
			ds.printList();
		}
		else{
			System.out.println("Word is not found");
			ds.add(string);
			System.out.println("The list after adding the not found element");
			ds.printList();
		}
		br.close();
	}
	
}
