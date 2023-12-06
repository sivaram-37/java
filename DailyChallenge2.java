/*The program must accept a string S as the input. The program must print the desired pattern as 
shown in the Example Input/Output section.
Proceed to Solve the Program
Boundary Condition(s): 1 <= Length of S <= 1000
Input Format:
The first line contains S.
Output Format:
The lines contain the desired pattern as shown in the Example Input/Output section.
Example Input/Output 1:
Input:
skillrack
Output:
skillrack
*killrac*
**illra**
***llr***
****l****
***llr***
**illra**
*killrac*
skillrack

Example Input/Output 2:
Input:
logics
Output
logics
*ogic*
**gi**
*ogic*
logics
*/

package com.skillrack;
import java.util.*;

public class DailyChallenge2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=in.nextLine();
		ArrayList<String> str=new ArrayList<String>();
		System.out.println(s);
		int a;
		if(s.length()%2==0) {
			a=(s.length()/2)-1;
		}
		else {
			a=s.length()/2;
		}
		for(int i=0;i<a;i++) {
			String ns="";
			ns="*".repeat(i+1)+s.substring(i+1,s.length()-i-1)+"*".repeat(i+1);
			str.add(ns);
			System.out.println(ns);
		}
		Collections.reverse(str);
		for(int i=0;i<str.size();i++) {
			System.out.println(str.get(i));
		}
		System.out.println(s);
		in.close();
	}

}
