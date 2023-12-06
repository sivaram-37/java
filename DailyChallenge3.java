/*
The program must accept N integers as the input. The program must print the integers which are having
the same digit among the N integers as the output. If there is no such integer, the program must 
print-1 as the output.

Boundary Condition(s):
1 <= N <= 100
1 <= Each integer value <= 10^8
Input Format:
The first line contains N
The second line contains N integers separated by a space.
Output Format:
The first line contains the integers which are having the same digit separated by a space or -1.

Example Input/Output 1:
Input: 4
87 222 9999 1
Outout
222 9999 1
Explanation:
All digits in 222 are 2. All digits in 9999 are 9.
The only digit in 1 is 1.
Hence the output is 222 9999 1

Example Input/Output 2:
Input: 5
887 56566 122 1000 56
Output: -1
 */


package com.skillrack;
import java.util.*;
public class DailyChallenge3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			arr.add(in.nextInt());
		}
		int f=0;
		for(int i=0;i<n;i++) {
			ArrayList<Integer> ni=new ArrayList<Integer>();
			int a=arr.get(i);
			while(a!=0) {
				ni.add(a%10);
				a/=10;
			}
			if(ni.size()==1) {
				System.out.print(arr.get(i)+" ");
				f=1;
			}
			else{
				int che=0;
				for(int j=1;j<ni.size();j++) {
					if(ni.get(0)==ni.get(j)) {
						che=1;
					}
					else {
						che=0;
					}
				}
				if(che==1) {
					System.out.print(arr.get(i)+" ");
					f=1;
				}
			}
			
		}
		if(f==0) {
			System.out.println(-1);
		}
		
		in.close();		
	}
}
