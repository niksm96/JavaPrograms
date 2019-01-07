/******************************************************************************
 *  Compilation:  javac -d bin HashNumber.java
 *  Execution:    java -cp bin com.bridgelabz.datastructuremprogram.HashNumber n
 *  
 *  Purpose: ­> Create a Slot of 10 to store Chain of Numbers that belong to each Slot to
 *  			efficiently search a number from a given set of number
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   04-01-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import java.util.Map;

import com.bridgelabz.util.CustomLinkedList;

public class HashNumber {
	
	/*
	* The main function is to read from a file and use hash numbers
	* to find the searched data.
	*/
	public static void main(String[] args) throws IOException{
		
		//Customized LinkedList
		CustomLinkedList<Integer> ds=new CustomLinkedList<>();
		CustomLinkedList<Integer> ds1 = null;
		
		Map<Integer, CustomLinkedList<Integer>> map=new HashMap<Integer, CustomLinkedList<Integer>>();
		for(int i=0;i<=10;i++){
			ds1 = new CustomLinkedList<>();
			map.put(i, ds1);
		}
		FileReader fr=new FileReader("C:\\Users\\Nikita\\Desktop\\HashNumb.csv");
		BufferedReader br=new BufferedReader(fr);
		int rem;
		String num;
		String delimitor=",";
		while((num=br.readLine())!=null){
			String number[]=num.split(delimitor);
			for(String numb:number){
				ds.add(Integer.parseInt(numb));
			}
		}
		System.out.println("The numbers in the file are:");
		
		//Method 1- using function of CustomLinkedList class of
		//com.bridgelabz.util package
		ds.printList();
		
		System.out.println();
		
		//Method 2- using function of CustomLinkedList class of
		//com.bridgelabz.util package
		int len=ds.size();
		
		String[] array=new String[len];
		
		//Method 3- using function of CustomLinkedList class of
		//com.bridgelabz.util package
		String [] array2=ds.convArray(array);
		
		//Method 4- using function of CustomLinkedList class of
		//com.bridgelabz.util package
		int[] res=ds.convertIntArray(array2);
		
		//Method 5- using function of CustomLinkedList class of
		//com.bridgelabz.util package
		int[] sorted=ds.sort(res);
		
		System.out.println("The sorted array are:");
		for(int s:sorted)
			System.out.print(s+" ");
		System.out.println();
		System.out.println("Diving each number by 11");
		for(int i=0;i<sorted.length;i++){
			rem=sorted[i]%11;
			if(map.isEmpty()){
				
				//Method 6- using function of CustomLinkedList class of
				//com.bridgelabz.util package
				ds1.add(sorted[i]);
				
				map.put(rem, ds1);
			}
			else{
				ds1=map.get(rem);
				if(ds1.size()==0){
					ds1.add(sorted[i]);
				}
				else{
					//Method 7- using function of CustomLinkedList class of
					//com.bridgelabz.util package
					if(!ds1.search(sorted[i])){
						
						ds1.add(sorted[i]);
					}
				}
				map.put(rem, ds1);
			}
		}
		
		for(int i=0; i<map.size(); i++){
			CustomLinkedList<Integer> list = map.get(i);
			System.out.print(i+": ");
			list.printList();
			System.out.println();
		}
		int n=0;
		do{
			System.out.println("Enter choice");
			System.out.println("1:Search for the number  2:Write  3:Exit");
			int choice=CustomLinkedList.userInt();
			switch(choice){
			case 1: System.out.println("Enter the number to search");
					int user_num=CustomLinkedList.userInt();
					boolean rs=ds1.search(user_num);
					if(rs){
						System.out.println("The number is found");
						System.out.println("Fetching the index of the number");
						
						//Method 8- using function of CustomLinkedList class of
						//com.bridgelabz.util package
						int index=ds1.index(user_num);
						
						System.out.println(index);
						
						//Method 9- using function of CustomLinkedList class of
						//com.bridgelabz.util package
						ds1.remove(index);
						
						System.out.println("The list after removing the number");
						ds1.printList();
					}
					else{
						System.out.println("Number not found");
						ds1.add(user_num);
						System.out.println("The list after adding the not found element");
						ds1.printList();
					}
					break;
			case 2: System.out.println("Writing the modifications into the file..");
					FileWriter fw=new FileWriter("C:\\Users\\Nikita\\Desktop\\HashNumb.csv");
					BufferedWriter bw=new BufferedWriter(fw);
					int leng=ds1.size();
					String[] res_array=new String[leng];
					String[] result=ds1.convArray(res_array);
					for(int i=0;i<result.length;i++){
						bw.write(result[i]+", ");
					}
					br.close();
					bw.close();
					break;
			case 3: System.out.println("Invalid choice");
					System.exit(0);
			}
			n++;
		}while(n<5);
		
		br.close();
	}

}
