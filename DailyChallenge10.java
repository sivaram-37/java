/*
The program must accept a string S and an integer X as the input. The program must replace the xth character in S
by repeating it X times.Then the program must print the modified string S as the output.
Boundary Condition(s): 1< X < Length of S<= 1000
Input Format:
The first line contains S. The second line contains X
Output Format:
The first line contains the modified S
Example Input/Output 1:
Input:
skillrack 
5
Output: 
skillllllrack
Explanations
The 5th character in string skillrack is l. So l is replaced by repeating it five times.
Hence the output is skillllllrack
Example Input/Output 2:
Input:
Environment
4
Output:
Enviiiironment
 */

package com.skillrack;
import java.util.*;
public class DailyChallenge10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int n=in.nextInt();
		System.out.print(s.substring(0,n-1));
		for(int i=0;i<n;i++) {
			System.out.print(s.substring(n-1, n));
		}
		System.out.print(s.substring(n));
		in.close();
		
	}

}
