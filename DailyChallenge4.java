/*
The program must accept a string S as the input. The program must remove the first occurrence of all 
the repeated consonants in the string S. Then the program must print the modified string S as the 
output.

Boundary Condition(s):
3 Length of S <= 1000

Input Format:
The first line contains 5.

Output Format:
The first line contains the modified string S.

Example Input/Output 1:
Input:
Attendance

Output:
Atedance

Explanations
The repeated consonants in the string Attendance are t and n.
So the first occurrence of both the consonants are removed from the string Attendance.
Hence the output is Atedance

Example Input/Output 2:
Input:
Cloud

Output:
Cloud

Example Input/Output 3:
Input: 
OCcurrence@123

Output:
OCurence@123
 */


package com.skillrack;
import java.util.*;

public class DailyChallenge4 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		in.close();
		char []ch=s.toCharArray();
		ArrayList<Character> ns=new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			ns.add(ch[i]);
		}
		for(int i=0;i<ns.size()-1;i++) {
			for(int j=i+1;j<ns.size();j++) {
				if(isConsonent(ns.get(i))==1){
					if(ns.get(i)==ns.get(j)) {
						ns.remove(i);
					}
				}
			}
		}
		for(Character c:ns) {
			System.out.print(c+"");
		}
	}

	static int isConsonent(Character c) {
		if(c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u') {
			return 0;
		}
		return 1;
	}

}
