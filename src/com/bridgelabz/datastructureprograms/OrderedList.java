package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.util.DataStructure;

public class OrderedList<T> extends Node<T> implements Comparable<T> {
	@Override
	public int compareTo(T obj) {
		if(obj == super.data){
			return 0;
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) throws IOException {
		DataStructure<String> ds=new DataStructure<>();
		FileReader fr=new FileReader("C:\\Users\\Nikita\\Desktop\\odfile.csv");
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
		System.out.println("Enter the choice");
		
		int n=0;
		do{
			System.out.println("1:Search for a word  2:Exit and Write");
			int choice=DataStructure.userInt();
			switch(choice){
			case 1:	System.out.println("Enter the key to be searched");
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
					break;
			case 2: System.out.println("Writing the modifications into the file..");
					FileWriter fw=new FileWriter("C:\\Users\\Nikita\\Desktop\\odfile.csv");
					BufferedWriter bw=new BufferedWriter(fw);
					int len=ds.size();
					String[] array=new String[len];
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
