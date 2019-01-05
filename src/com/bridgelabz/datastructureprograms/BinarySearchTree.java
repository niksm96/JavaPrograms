package com.bridgelabz.datastructureprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.CustomLinkedList;
import com.bridgelabz.util.Utility;

public class BinarySearchTree {
	public static void main(String[] args) {
		System.out.println("Enter the number of test cases");
		int ch=CustomLinkedList.userInt();
		List<Integer> lst=new ArrayList<Integer>();
		int i=0;
		while(i<ch){
			System.out.println("Enter the number of nodes");
			int nodes=CustomLinkedList.userInt();
			int res=Utility.numberOfBST(nodes);
			lst.add(res);
			i++;
		}
		System.out.println("The number of binary search tree for the following nodes are:");
		System.out.println(lst);
	}
}
