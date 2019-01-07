/******************************************************************************
 *  Compilation:  javac -d bin Banking.java
 *  Execution:    java -cp bin com.bridgelabz.datastrcutureprogram.Banking n
 *  
 *  Purpose: ­> Create a Program which creates Banking Cash Counter where people
 *  come in to deposit Cash and withdraw Cash. Have an input panel to add people
 *  to Queue to either deposit or withdraw money and dequeue the people. Maintain
 *  the Cash Balance.
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   03-01-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructureprograms;

import com.bridgelabz.util.CustomLinkedList;
import com.bridgelabz.util.Queue;

public class Banking {
	
	/*
	* The main function is written to take input from the user
	* to perform transactions by using customized queue
	*/
	public static void main(String[] args) {
		
		/*
		 * Customized queue in com.bridgelabz.util package
		 */
		Queue<Integer> q=new Queue<Integer>();
		int count=0;
		int cash_count=10000;
		do{
			System.out.println("Enter the choice");
			System.out.println("1:Add  2:Check Cash  3:Exit");
			int choice=CustomLinkedList.userInt();
			switch(choice){
			
			case 1: //Method 1- using function of Queue class of
					//com.bridgelabz.util package
					q.insert(count++);
					
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
					
					//Method 2- using function of Queue class of
					//com.bridgelabz.util package
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
