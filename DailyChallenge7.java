/*
The program must accept N integers as the input. The program must remove the first occurrence of "0" 
in each integer among the N integers. Then the program must print the sum of the N modified integers'
as the output.
Proceed to Salve the Program
Boundary Condition(s):
2<N<100
10 Each integer value <= 10^5
Input Format:
The first line contains N
The second line contains N integers separated by a space.
Output Format:
The first line contains the sum of the N modified integers
Example Input/Output 1:
Input:
3
100 320 10020
Output: 1062
Explanations
After removing the first occurrence of 0 in each integer, the three integers become 10, 32 and 1020. 
So their sum 1062 is printed as the output (10+32+1020=1062)
Example Input/Output 2:
Input:
4
87 157 10 13
Output
258
 */

package com.skillrack;
import java.util.*;
public class DailyChallenge7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
			String s=Integer.toString(arr[i]);
			char[] ch=s.toCharArray();
			
			String ns="";
			int f=0;
			for(char c:ch) {

				if(c=='0' && f==0) {
					f=1+(int)c;
				}
				else{
					ns+=c;			
				}
			}

			sum+=Integer.parseInt(ns);
			
		}
		System.out.println(sum);
		
		in.close();
	}

}
