/******************************************************************************
 *  Compilation:  javac -d bin BinarySearchTree.java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.BinarySearchTree n
 *  
 *  Purpose: ­> You are given N nodes, each having unique value ranging
 *  			from [1, N], how many different binary search tree can be created 
 *  			using all of them.
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   04-01-2019
 *
 ******************************************************************************/

package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.CustomLinkedList;
import com.bridgelabz.util.Utility;

public class BinarySearchTree {
	
	/*
	* The main function is written to take input from the user
	* and to find how many binary search trees can be formed
	* from the entered number of nodes
	*/
	public static void main(String[] args) {
		System.out.println("Enter the number of test cases");
		int ch=CustomLinkedList.userInt();
		List<Integer> lst=new ArrayList<Integer>();
		int i=0;
		while(i<ch){
			System.out.println("Enter the number of nodes");
			int nodes=CustomLinkedList.userInt();
			
			//Method 1- using function of Utility class of
			//com.bridgelabz.util package
			int res=Utility.numberOfBST(nodes);
			
			lst.add(res);
			i++;
		}
		System.out.println("The number of binary search tree for the following nodes are:");
		System.out.println(lst);
	}
}
