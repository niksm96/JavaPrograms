package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.util.DataStructure;

public class OrderedList{
	public static void main(String[] args) throws IOException {
		DataStructure<Integer> ds=new DataStructure<>();
		DataStructure<Integer> ds1=new DataStructure<>();
		FileReader fr=new FileReader("C:\\Users\\Nikita\\Desktop\\Numbers.csv");
		BufferedReader br=new BufferedReader(fr);
		String num;
		String delimitor=",";
		while((num=br.readLine())!=null){
			String number[]=num.split(delimitor);
			for(String numb:number){
				ds.add(Integer.parseInt(numb));
			}
		}
		System.out.println("The numbers in the file are:");
		ds.printList();
		System.out.println();
		int len=ds.size();
		String[] array=new String[len];
		String [] array2=ds.convArray(array);
		int[] res=ds.convertIntArray(array2);
		int[] sorted=ds.sort(res);
		System.out.println("The sorted array are:");
		for(int s:sorted)
			System.out.print(s+" ");
		System.out.println("Adding the sorted array into list");
		for(int i:sorted)
			ds1.add(i);
		System.out.println("The sorted numbers in the list");
		ds1.printList();
		System.out.println("Enter the choice");
		int n=0;
		do{
			System.out.println("1:Search for a number  2:Final Write  3:Exit");
			int choice=DataStructure.userInt();
			switch(choice){
			case 1:	System.out.println("Enter the number to be searched");
					int user_num=DataStructure.userInt();
					boolean rs=ds1.search(user_num);
					if(rs){
						System.out.println("Number is found");
						System.out.println("Fetching the index of the number");
						int index=ds1.index(user_num);
						System.out.println(index);
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
					FileWriter fw=new FileWriter("C:\\Users\\Nikita\\Desktop\\Numbers.csv");
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
		}while(n<10);
		br.close();
	}
}
