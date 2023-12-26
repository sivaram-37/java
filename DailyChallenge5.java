/*
The program must accept an integer N as the input. The program must print the largest possible 
integer which is obtained by rotating the digits of N in the clockwise direction.

Boundary Condition(s): 10<=N<= 10^8
Input Format: The first line contains N.
Output Format:
The first line contains the largest possible integer as per the given condition.
Example Input/Output 1:
Input: 2451
Output 5124

 */

package com.skillrack;
import java.util.*;
public class DailyChallenge5 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		in.close();
		int l=s.length();
		char[] ch=s.toCharArray();
		int lar=0,ind=0;
		for(int i=0;i<l;i++) {
			if((int)ch[i]>lar) {
				lar=(int)ch[i];
				ind=i;
			}
		}
		char[] a=new char[2*l];
		for(int i=0;i<l;i++) {
			a[i]=a[i+l]=ch[i];
		}
		
		for(int i=0+ind;i<l+ind;i++) {
			System.out.print(a[i]);
		}
	}
}

