package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.CustomLinkedList;
import com.bridgelabz.util.Queue;

public class Banking {
	public static void main(String[] args) {
		Queue q=new Queue();
		int count=0;
		int cash_count=10000;
		do{
			System.out.println("Enter the choice");
			System.out.println("1:Add  2:Check Cash  3:Exit");
			int choice=CustomLinkedList.userInt();
			switch(choice){
			case 1: q.insert(count++);
					System.out.println("Adding "+count+" person to the queue");
					System.out.println("Do you want to: 1-Deposit 2-Withdraw");
					int ch=CustomLinkedList.userInt();
					switch(ch){
					case 1: System.out.println("Enter the amount to deposit");
							int dep_amt=CustomLinkedList.userInt();
							cash_count+=dep_amt;
							System.out.println(dep_amt+" is added");
							break;
					case 2: System.out.println("Enter the amount to withdraw");
							int withdraw=CustomLinkedList.userInt();
							if(withdraw>cash_count){
								System.out.println("Cash of that amount is not available");
							}
							else{
								cash_count-=withdraw;
								System.out.println(withdraw+" is withdrawn");
							}
							break;
					default:System.out.println("Invalid choice");
							System.exit(0);
					}
					q.remove();
					System.out.println("The person is removed");
					break;
			case 2: System.out.println("The amount of cash available is: "+cash_count);
					break;
			case 3: System.exit(0);
			}
		}while(cash_count!=0);
		System.out.println("Ran out of cash");
	}
}
