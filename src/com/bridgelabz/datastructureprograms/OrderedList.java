package com.bridgelabz.datastructureprograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.util.CustomLinkedList;
import com.bridgelabz.util.Utility;

public class OrderedList{
	public static void main(String[] args) throws IOException {
		CustomLinkedList<Integer> ds=new CustomLinkedList<>();
		FileReader fr=new FileReader("C:\\Users\\Nikita\\Desktop\\Numbers.csv");
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
		Integer[] sorted=Utility.sort(intArr);
		for(int numb:sorted){
			ds.add(numb);
		}
		System.out.println("The numbers in the file are:");
		ds.printList();
		System.out.println("Enter the choice");
		int n=0;
		do{
			System.out.println("1:Search for a number  2:Final Write  3:Exit");
			int choice=CustomLinkedList.userInt();
			switch(choice){
			case 1:	System.out.println("Enter the number to be searched");
					int user_num=CustomLinkedList.userInt();
					boolean rs=ds.search(user_num);
					if(rs){
						System.out.println("Number is found");
						System.out.println("Fetching the index of the number");
						int index=ds.index(user_num);
						System.out.println(index);
						ds.remove(index);
						System.out.println("The list after removing the number");
						ds.printList();
					}
					else{
						System.out.println("Number not found");
						ds.add(user_num);
						String[] array=new String[ds.size()];
						String array1[]=ds.convArray(array);
						int[] intArray=ds.convertIntArray(array1);
						int[] sorted_array=ds.sort(intArray);
						for(int i:sorted_array)
							ds1.add(i);
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
